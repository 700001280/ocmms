package com.ocmms.cmms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Aspect
public class BusinessHandleAspect {

    private static Logger logger = LoggerFactory.getLogger(BusinessHandleAspect.class);

    @Before(value = "execution(* com.ocmms.cmms.service.api.MaterialInstockDetailService.save(Object+))")
    public void beforeAdviceReport(JoinPoint jp) {        
        logger.info("JoinPoint.getSignature().getName() {}", jp.getSignature().getName());        
        logger.info("JoinPoint.getArgs().length {}", jp.getArgs().length);
        
        logger.info("JoinPoint.getTarget().getClass().getName() {}", jp.getTarget().getClass().getName());        
        logger.info("JoinPoint.getThis().getClass().getName() {}", jp.getThis().getClass().getName());        
    }

    @After(value = "execution(* com.ocmms.cmms.service.api.MaterialInstockDetailService.save(Object+))")
    public void afterAdviceReport(JoinPoint jp) {
        logger.info("JoinPoint.getSignature().getName() {}", jp.getSignature().getName());        
        logger.info("JoinPoint.getArgs().length {}", jp.getArgs().length);
        
        logger.info("JoinPoint.getTarget().getClass().getName() {}", jp.getTarget().getClass().getName());        
        logger.info("JoinPoint.getThis().getClass().getName() {}", jp.getThis().getClass().getName());   
    }

    @Before(value = "execution(* com.ocmms.cmms.service.api.AssetService.*(..))")
    public void beforeAdviceService(JoinPoint jp) {
        logger.info("JoinPoint.getSignature().getName() {}", jp.getSignature().getName());        
        logger.info("JoinPoint.getArgs().length {}", jp.getArgs().length);
        
        logger.info("JoinPoint.getTarget().getClass().getName() {}", jp.getTarget().getClass().getName());        
        logger.info("JoinPoint.getThis().getClass().getName() {}", jp.getThis().getClass().getName());   
    }

    @After(value = "execution(* com.ocmms.cmms.service.api.AssetService.*(..))")
    public void afterAdviceService(JoinPoint jp) {
        logger.info("JoinPoint.getSignature().getName() {}", jp.getSignature().getName());        
        logger.info("JoinPoint.getArgs().length {}", jp.getArgs().length);
        
        logger.info("JoinPoint.getTarget().getClass().getName() {}", jp.getTarget().getClass().getName());        
        logger.info("JoinPoint.getThis().getClass().getName() {}", jp.getThis().getClass().getName());   
    }

}
