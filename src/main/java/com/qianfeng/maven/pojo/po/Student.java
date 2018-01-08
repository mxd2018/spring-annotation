package com.qianfeng.maven.pojo.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Student {
	@Value("2222")
	private int id;
	@Value("注解的人名")
	private String name;
	
	@Autowired
	private Phone phone;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
