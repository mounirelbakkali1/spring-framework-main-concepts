package com.startup.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    private  Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Before("execution(* com.startup.services.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Entring  : "+ joinPoint.getSignature().getName());

    }
    @After("execution(* com.startup.services.*.*(..))")
    public void logAfter(JoinPoint joinPoint) throws InterruptedException {
        logger.info("Exiting  : "+ joinPoint.getSignature().getName());
    }

    @Around("execution(* com.startup.repositories.*.*(..))")
    public Object log(ProceedingJoinPoint jp) throws Throwable {
        String methodeName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        logger.info("calling method "+methodeName+ " with args "+args[0]);
        Object result = jp.proceed();
        logger.info("Method "+methodeName+" returns "+result);
        return  result;
    }


}
