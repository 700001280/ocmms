package com.ocmms.cmms.mail;


import java.util.List;
import java.util.Locale;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.service.UserInfoService;


@Service
public class MailSenderService extends Thread{

	private static Logger logger =  LoggerFactory.getLogger(MailSenderService.class);

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
	
	public void lowStockInfoes(final List<MaterialPlantInfo> materialPlantInfoes) {
		try {
			final Locale locale = LocaleContextHolder.getLocale();					
			final Context ctx = new Context(locale);			
			ctx.setVariable("materialPlantInfoes", materialPlantInfoes);
			/* ctx.setVariable("imageResourceName", imageResourceName); */
			// Prepare message using a Spring helper
			final MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
			final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
			message.setFrom(fromAddress);

			final String htmlContent;			
				ctx.setVariable("name", "s");
				
				message.setTo(new String[] {  "zeyong.qin@sabic.com", "yuqi.yang@sabic.com" });
				message.setSubject("FYI:MATERIAL LOW STOCK INFORMATION");
				htmlContent = this.templateEngine.process("mail_materialstock_low_week_notification", ctx);
			
			message.setText(htmlContent, true /* isHtml */);

			// Send email
			this.javaMailSender.send(mimeMessage);
		} catch (MessagingException e) {
			logger.error(e.getMessage());
		}
	}	
}
