package com.qianfeng.maven.pojo.po;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//这个注解放的位置要重点注意，是注解类的
//spring和Junit的整合
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-test.xml"})
public class StudentTest {
	@Autowired
	private Phone phone;
	@Test
	public void testStudent(){
		System.out.println(phone);
		
		
		/*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s = ctx.getBean("student",Student.class);
		System.out.println(s);*/
		
		
		//注意：“Phone”首字母大写的原因，@Component(Phone)--->@Component(phone)这是默认的
		/*Phone phone = ctx.getBean("Phone", Phone.class);
		System.out.println(phone);*/
	}
}
