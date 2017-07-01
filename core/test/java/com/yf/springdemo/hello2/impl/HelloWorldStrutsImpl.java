package com.yf.springdemo.hello2.impl;

import org.springframework.stereotype.Component;

import com.yf.springdemo.hello2.IHelloWorld;

/**
 * HelloWorldStrutsImpl [Other class implements IHelloWorld]
 *  
 * @author zhang.yifeng
 * @CreateDate 2017年7月1日
 * @version 1.0.0
 * @since  1.0.0 
 * @see com.yf.springdemo.hello2.impl 
 *
 */
@Component("strutsHelloWorld")
public class HelloWorldStrutsImpl implements IHelloWorld {
	
	@Override
	public void sayHello() {
		System.out.println("Struts say Hello!");
	}
}