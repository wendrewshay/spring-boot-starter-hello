package com.example.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置类
 * @author WQXia
 *
 */
@ConfigurationProperties(prefix="hello")
public class HelloServiceProperties {

	private final static String MSG = "world";
	
	private String msg = MSG;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
