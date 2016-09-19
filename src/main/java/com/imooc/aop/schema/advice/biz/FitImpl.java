package com.imooc.aop.schema.advice.biz;

public class FitImpl implements Fit {

	@Override
	public void filter() {
		System.out.println(this.getClass().getName() + " filter");
		
	}

}
