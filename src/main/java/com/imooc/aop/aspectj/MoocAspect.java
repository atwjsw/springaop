package com.imooc.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MoocAspect {
	
	@Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
	public void pointcut() {}
	
	@Pointcut("within(com.imooc.aop.aspectj.biz.*)")
	public void bizPointcut() {}

	@Before("pointcut()")
	public void before() {
		System.out.println("before");
			
	}
	
	@Before("pointcut() && @annotation(moocMethod)")
	public void beforeWithAnnotation(MoocMethod moocMethod) {
		System.out.println("BeforeWithAnnotation." + moocMethod.value());			
	}
	
	@Before("pointcut()&&args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("beforeWithParam " + arg);
			
	}
	
	@AfterReturning(pointcut="bizPointcut()", returning="returnValue" )
	public void afterReturning(Object returnValue ) {
		System.out.println("afterReturning: " + returnValue);
			
	}
	
	@AfterThrowing(pointcut="bizPointcut()", throwing="e" )
	public void afterReturning(Exception e ) {
		System.out.println("afterThrowing: " + e.getMessage());
	}
	
	@After("bizPointcut()")
	public void after() {
		System.out.println("after");
			
	}
	
	@Around("bizPointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around 1");
		Object retVal = pjp.proceed();
		System.out.println("around 2 " + retVal);
		return retVal;
			
	}
	
	
	
}
