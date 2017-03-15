package com.demo.dao;

import java.util.List;

import com.databaseconnection.start.StudentCrud;
import com.databaseconnection.start.StudentCrudImp;

public class TestStudent {

	public static void main(String[] args) {
		DemoService ds=new DemoService();
		ds.setStudent();
		ds.getStudent();
		StudentCrud crud1=new StudentCrudImp();
		List<Student> lis=crud1.getAllStudent();
		
		
	}

}
