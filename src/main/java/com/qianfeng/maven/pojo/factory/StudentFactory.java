package com.qianfeng.maven.pojo.factory;

import com.qianfeng.maven.pojo.po.Student;

public class StudentFactory {
	
	public static Student createStudent(){
		return new Student();
	}
	
	public static Student createStudent2(){
		Student s = new Student();
		s.setId(2);
		s.setName("�����������ĵڶ���ѧ��");
		return s;
	}
}
