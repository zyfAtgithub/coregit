package com.yf.springdemo.test.hello2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yf.springdemo.hello2.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
public class TestHelloWorld {
	
	@Resource
	HelloWorldService helloWorldService;
	
	@Test
	public void test1() {
		helloWorldService.sayHello();
	}
}
