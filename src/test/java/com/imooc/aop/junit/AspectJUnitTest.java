package com.imooc.aop.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.aop.aspectj.biz.MoocBiz;
import com.imooc.aop.schema.advice.biz.AspectBiz;

import junit.framework.TestCase;

public class AspectJUnitTest extends TestCase {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-aspectj.xml");

	@Test
	public void testMoocAop() {
		MoocBiz mb = (MoocBiz) ctx.getBean("moocBiz");
		mb.save("Testing AspectJ");
	}
}
