package com.qianfeng.maven.pojo.po;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//���ע��ŵ�λ��Ҫ�ص�ע�⣬��ע�����
//spring��Junit������
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
		
		
		//ע�⣺��Phone������ĸ��д��ԭ��@Component(Phone)--->@Component(phone)����Ĭ�ϵ�
		/*Phone phone = ctx.getBean("Phone", Phone.class);
		System.out.println(phone);*/
	}
}
