package com.ocmms.cmms.mail;


import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.lowagie.text.PageSize;
import com.lowagie.text.html.simpleparser.HTMLWorker;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerReplaceRecord;
import com.ocmms.cmms.service.api.EmployeeService;
import com.ocmms.cmms.service.api.EquipmentMaintenanceRecordService;
import com.ocmms.cmms.service.api.EquipmentReplaceRecordService;
import com.ocmms.cmms.service.api.ExtruderShaftReplaceRecordService;
import com.ocmms.cmms.service.api.MaterialCatalogService;
import com.ocmms.cmms.service.api.MaterialOutstockDetailService;
import com.ocmms.cmms.service.api.PartMaintenanceRecordService;
import com.ocmms.cmms.service.api.PartReplaceRecordService;
import com.ocmms.cmms.service.api.PelletizerCutterReplaceRecordService;
import com.ocmms.cmms.service.api.PelletizerUpRollerReplaceRecordService;
import com.ocmms.cmms.service.api.PelletizerReplaceRecordService;
import com.ocmms.cmms.service.api.PreventiveMaintenanceExecutionService;
import com.ocmms.cmms.service.api.UserInfoService;

import io.springlets.security.jpa.domain.UserLogin;
import io.springlets.security.jpa.service.api.UserLoginService;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

@Component
public class MailSenderService extends Thread{

	static Logger logger = Logger.getLogger(MailSenderService.class);

	@Autowired
	private MessageSource messageSource;
	 
	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private TemplateEngine templateEngine;

	@Autowired
	private UserInfoService userInfoService;

	@Value("${spring.mail.username}")
	private String fromAddress;

	@Value("${spring.mail.task.notification.newtask}")
	private String newTaskNotification;
	
	@Value("${spring.mail.task.notification.complete}")
	private String taskCompleteNotification;
	
	@Value("${spring.mail.materialstock.notification.low}")
	private String lowMaterialstockNotification;

	@Value("${spring.mail.materialstock.notification.lowweek}")
	private String lowMaterialWeekNotification;
	
	@Value("${spring.mail.materialstock.notification.newinstock}")
	private String newMaterialInstock;	
	
	@Value("${spring.mail.task.complete.receivers}")
	private String taskCompleteReceivers;
	  
	
	public void sendEmail(Object content, String template, String title, String receiver,
			String[] toAddress, String[] ccAddress) {
		try {
			final Locale locale = LocaleContextHolder.getLocale();
			//final UserLogin user = getCurrentUser();
			// Prepare the evaluation context
			final Context ctx = new Context(locale);
			/*
			 * FileSystemResource imageResourceName = new FileSystemResource( new File(
			 * "F:/project/cms/src/main/resources/static/public/img/logo.png"));
			 */

			ctx.setVariable("mailContent", content);
			/* ctx.setVariable("imageResourceName", imageResourceName); */
			// Prepare message using a Spring helper
			final MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
			final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
			message.setFrom(fromAddress);

			final String htmlContent;
			// Create the HTML body using Thymeleaf
			ctx.setVariable("name", " " + receiver);
			message.setTo(toAddress);
			message.setCc(ccAddress);
			message.setSubject(title);
			htmlContent = this.templateEngine.process(template, ctx);

			message.setText(htmlContent, true /* isHtml */);

			// Send email
			this.javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			logger.error(e.getMessage());
		}
	}

	public void sendTaskNotification(TaskTracking content) {
		try {
			String title=messageSource.getMessage("mail.task.notification.newtask.title", null, LocaleContextHolder.getLocale());
			String receiverMail=content.getTaskOwner().getEmail(); 
			String receiver=content.getTaskOwner().getFirstName()+", "+content.getTaskOwner().getLastName();
			String[] toAddress=new String[] {receiverMail}; 
			String[] ccAddress=new String[] { userInfoService.getUserMail()}; 			
			
			final Locale locale = LocaleContextHolder.getLocale();
			
			final Context ctx = new Context(locale);
			
			ctx.setVariable("mailContent", content);
			
			final MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
			final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
			message.setFrom(fromAddress);

			final String htmlContent;
			
			ctx.setVariable("name", " " + receiver);
			message.setTo(toAddress);
			message.setCc(ccAddress);
			message.setSubject(title);
			htmlContent = this.templateEngine.process(newTaskNotification, ctx);

			message.setText(htmlContent, true /* isHtml */);

			// Send email
			this.javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			logger.error(e.getMessage());
		}
	}
	
	public void taskCompleteNotification(TaskTracking content) {
		try {
			String title=messageSource.getMessage("mail.task.notification.complete.title", null, LocaleContextHolder.getLocale());
			
			String[] toAddress=taskCompleteReceivers.split(","); 
			String[] ccAddress=new String[] { userInfoService.getUserMail()}; 	
			
			final Locale locale = LocaleContextHolder.getLocale();
			
			final Context ctx = new Context(locale);
			
			ctx.setVariable("mailContent", content);
			
			final MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
			final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
			message.setFrom(fromAddress);

			final String htmlContent;
			
			ctx.setVariable("name", "s");
			message.setTo(toAddress);
			message.setCc(ccAddress);
			message.setSubject(title);
			htmlContent = this.templateEngine.process(taskCompleteNotification, ctx);

			message.setText(htmlContent, true /* isHtml */);

			// Send email
			this.javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			logger.error(e.getMessage());
		}
	}
}
