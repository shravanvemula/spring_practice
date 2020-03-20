package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class CRMLoggingAspect {
	
	private Logger logger=Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forController() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDAO() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forService() {}
	
	@Pointcut("forController()||forService()||forDAO()")
	private void forAll() {}
	
	
	@Before("forAll()")
	public void printLogInfo(JoinPoint thejp) {
		
		String ms=thejp.getSignature().toShortString();
		
		logger.info("========> Before executing "+ms);
		
		Object[] args=thejp.getArgs();
		
		for(Object arg:args) {
			logger.info("argument:"+arg);
		}
		
	}
	
	@AfterReturning(pointcut="forAll()",returning="result")
	public void afterReturning(JoinPoint thejp,Object result) {
		
		String ms=thejp.getSignature().toShortString();
		
		logger.info("========> After executing "+ms);
		
		logger.info("Returned value "+result);
		
	}
}
