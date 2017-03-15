package com.demo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.databaseconnection.start.StudentCrud;
import com.databaseconnection.start.StudentCrudImp;

public class DemoService {
	List<Student> lis=new ArrayList();
	
	public void setStudent(){
		Student student=new Student(); 
		student.setName("rahul");
		student.setSname("maharjan");
		student.setAddress("Swoyambhu");
		student.setPhone(98);
		lis.add(student);
		StudentCrud crud=new StudentCrudImp();
		crud.insertStudent(student);
		
	}

	public void getStudent(){
		Iterator<Student> itr=lis.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
