package com.bp.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bp.service.HelloService;

/**
 * 
 * @author current_bp
 * @createTime 20161213
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:applicationContext.xml"})
public class HelloServiceTest {
	
	@Autowired
	private HelloService helloService;

	@Test
	public void test1(){
		System.out.println("111111");
		System.out.println(helloService.sayHello("baopan"));
	}
}
