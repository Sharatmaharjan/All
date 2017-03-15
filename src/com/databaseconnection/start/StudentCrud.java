package com.databaseconnection.start;

import java.util.List;

import com.demo.dao.Student;

public interface StudentCrud {
	Student insertStudent(Student student);
	List<Student> getAllStudent();
	List<Student> getStudentbyName(Student student);
}
