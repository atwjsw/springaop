package com.imooc.aop.schema.advice.biz;

public class AspectBiz {
	
	public void biz() throws Exception {
		System.out.println("AspectBiz doing biz method ");	
		//throw new Exception();
	}
	
	public void init(String bizName, int times) {
		System.out.println("AspectBiz doing init method: " + bizName + "  " + times );
	}

}
