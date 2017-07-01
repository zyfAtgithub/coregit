package com.yf.springdemo.hello2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {

	@Resource(name = "strutsHelloWorld")
	// @Autowired
	// @Qualifier("strutsHelloWorld")
	private IHelloWorld helloWorld;

	
	
	public HelloWorldService() {
		System.out.println("HelloWorldService....Constractor-----");
	}

	public void sayHello() {
		helloWorld.sayHello();
	}

	@PostConstruct
	public void postConstruct1() {
		System.out.println("HelloWorldService....postConstruct1");
	}

	@PreDestroy
	public void preDestroy1() {
		System.out.println("HelloWorldService....preDestroy1");
	}
}