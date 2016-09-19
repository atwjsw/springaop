package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
	
	public void before() {
		System.out.println("MoocAspect doing before method");
	}
	
	public void afterReturning() {
		System.out.println("MoocAspect doing after returning method");
	}

	public void handleException() {
		System.out.println("MoocAspect doing after throwing method");
	}
	
	public void after() {
		System.out.println("MoocAspect doing after finally method");
	}
	
	public Object around(ProceedingJoinPoint pjp) {
		
		Object returnVal = null;
		try {
			System.out.println("MoocAspect doing around method 1");
			returnVal = pjp.proceed();
			System.out.println("MoocAspect doing around method 2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return returnVal;		
	}
	
	public void beforeInit(String bizName, int times) {
		System.out.println("MoocAspect doing beforeInit method: " + bizName + "   " + times);
	}
	
	public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
		
		Object returnVal = null;
		try {
			System.out.println("MoocAspect doing aroundInit method 1: " + bizName + "   " + times);
			returnVal = pjp.proceed();
			System.out.println("MoocAspect doing aroundInit method 2: " + bizName + "   " + times);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return returnVal;		
	}

}
