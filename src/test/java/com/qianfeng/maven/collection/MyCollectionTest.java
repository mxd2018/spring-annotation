package com.qianfeng.maven.collection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCollectionTest {
	@SuppressWarnings("resource")
	@Test
	public void TestMyCollection(){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyCollection mc = ctx.getBean("myCollection",MyCollection.class);
		System.out.println(mc.getArrs().length+"---------"+mc.getMap().size());
	}
}
