/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocmms.cmms.schedule;

/**
 *
 * @author 700001280
 */
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.ocmms.cmms.mail.MailSenderService;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.repository.MaterialPlantInfoRepository;


@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	// private static final SimpleDateFormat dateFormat = new
	// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ddhh:mm:ss");
	private static final Long[] LINE = { -8L, -13L, -18L, -23L, -28L };
	private static final Long[] EQUIPMENT = { -644L, -650L, -651L, -652L, -653L };

	@Autowired
	private MaterialPlantInfoRepository materialPlantInfoService;
	
	@Autowired
	private MailSenderService mailSenderService;
	
	List<MaterialPlantInfo> materialPlantInfoes;
	
	private int i = 0;

	// 0 0 10,14,16 * * ? 每天上午10点，下午2点，4点
	// 0 0/30 9-17 * * ? 朝九晚五工作时间内每半小时
	// 0 0 12 ? * WED 表示每个星期三中午12点
	// "0 0 12 * * ?" 每天中午12点触发
	// "0 15 10 ? * *" 每天上午10:15触发
	// "0 15 10 * * ?" 每天上午10:15触发
	// "0 15 10 * * ? *" 每天上午10:15触发
	// "0 15 10 * * ? 2005" 2005年的每天上午10:15触发
	// "0 * 14 * * ?" 在每天下午2点到下午2:59期间的每1分钟触发
	// "0 0/5 14 * * ?" 在每天下午2点到下午2:55期间的每5分钟触发
	// "0 0/5 14,18 * * ?" 在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发
	// "0 0-5 14 * * ?" 在每天下午2点到下午2:05期间的每1分钟触发
	// "0 10,44 14 ? 3 WED" 每年三月的星期三的下午2:10和2:44触发
	// "0 15 10 ? * MON-FRI" 周一至周五的上午10:15触发
	// "0 15 10 15 * ?" 每月15日上午10:15触发
	// "0 15 10 L * ?" 每月最后一日的上午10:15触发
	// "0 15 10 ? * 6L" 每月的最后一个星期五上午10:15触发
	// "0 15 10 ? * 6L 2002-2005" 2002年至2005年的每月的最后一个星期五上午10:15触发
	// "0 15 10 ? * 6#3" 每月的第三个星期五上午10:15触发
	// 
	// @Scheduled(cron = "0 55 19 ? * MON-FRI")
	// @Scheduled(fixedRate = 5000)
	// @Scheduled(fixedDelay = 1000, initialDelay = 1000)
	// @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
	// @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
	// @Scheduled(cron = "${cron.expression}")
	// @Scheduled(cron = "0 45 7 ? * MON-FRI")
	//
	//@Scheduled(fixedDelay =120000)
	@Scheduled(cron = "0 0 21 ? * WED")
	//@Scheduled(cron = "0 30 7 * * ?") everyday 7:30AM
	public void lowStockInfoes() {
		materialPlantInfoes=materialPlantInfoService.getLowStockMaterial();
		if(materialPlantInfoes!=null) {
		mailSenderService.lowStockInfoes(materialPlantInfoes);
		}
		try {
			//messageSenderService.sendMessage("ROLE_ASSISTANT", kpi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("mailSenderService.sendShiftReport");
	}
	
	
}
