package com.example.spring_boot_starter_hello;

/**
 * 判断依据类
 * @author WQXia
 *
 */
public class HelloService {

	private String msg;
	
	public String sayHello() {
		return "Hello " + msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
