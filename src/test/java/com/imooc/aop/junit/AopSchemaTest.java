package com.imooc.aop.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.aop.schema.advice.biz.AspectBiz;
import com.imooc.aop.schema.advice.biz.Fit;

import junit.framework.TestCase;

public class AopSchemaTest extends TestCase {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-schema-advice.xml");

	@Test
	public void testMoocAop() {
		AspectBiz ab = (AspectBiz) ctx.getBean("aspectBiz");	
		try {
			ab.biz();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMoocAop2() {
		AspectBiz ab = (AspectBiz) ctx.getBean("aspectBiz");	
		try {
			ab.init("imooc biz", 999);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMoocAop3() {
		Fit fit = (Fit) ctx.getBean("aspectBiz");	
		try {
			fit.filter();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
