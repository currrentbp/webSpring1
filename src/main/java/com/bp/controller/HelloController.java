package com.bp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author current_bp
 * @createTime 20161128
 *
 */

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {

	
	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(){
		return "baopan";
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		System.out.println("===> this is index.jsp");
		return "index";
	}
}
