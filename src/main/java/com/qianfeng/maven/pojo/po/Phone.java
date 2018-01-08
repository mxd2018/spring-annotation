package com.qianfeng.maven.pojo.po;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Phone")
@Scope(scopeName="prototype")
public class Phone {
	@Value("6666")
	private int id;
	@Value("注解的手机")
	private String phoneName;
	
	public Phone() {}
	
	public Phone(int id, String phoneName) {
		super();
		this.id = id;
		this.phoneName = phoneName;
	}

	@PostConstruct
	public void init(){
		System.out.println("初始化方法");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("销毁方法");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneName=" + phoneName + "]";
	}
	
}
