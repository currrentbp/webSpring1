package com.bp.service;

/**
 * 
 * @author current_bp
 * @createTime 20161213
 *
 */
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "hello " + name;
	}

}
