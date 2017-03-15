package com.databaseconnection.start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.demo.dao.Student;

public class StudentCrudImp implements StudentCrud {
	Connection connect = null; // import java.sql
	String username = "root";
	String password = "123456";
	String url = "jdbc:mysql://127.0.0.1:3306/demodatabase";

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection(url, username, password);
		return connect;
	}

	@Override
	public Student insertStudent(Student student) {
		String query = "insert into students(fname,sname,address,phone) values (?,?,?,?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(query);
			ps.setString(1, student.getName());
			ps.setString(2, student.getSname());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getPhone());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList=new ArrayList<Student>();
		String query="select * from students";
		ResultSet rs=null;
		try {
			PreparedStatement ps = getConnection().prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
			Student student=new Student();
			student.setName(rs.getString("fname"));    //first row
			student.setSname(rs.getString("sname"));
			student.setAddress(rs.getString("address"));
			student.setPhone(rs.getInt("phone"));
			studentList.add(student);
		}} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Iterator<Student> itr=studentList.iterator();
//		while(studentList.next()){
//			System.out.println("Name: "+student.getName());
//		}
			return studentList;
	}

//	@Override
//	public Student searchStudent() {
//		String query="select * from students where fname=student.getName()";
//		try {
//			PreparedStatement ps = getConnection().prepareStatement(query);
//			ps.executeUpdate();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			return null;
//	}

	@Override
	public List<Student> getStudentbyName(Student student) {
		List<Student> studentList=new ArrayList<Student>();
		String query="select * from students where fname=?";
		ResultSet rs=null;
		try {
			PreparedStatement ps = getConnection().prepareStatement(query);
			ps.setString(1, student.getName());
			rs=ps.executeQuery();
			while(rs.next()){
				Student student1=new Student();
				student1.setName(rs.getString("fname"));    //first row
				student1.setName(rs.getString("sname"));
				student1.setName(rs.getString("address"));
				student1.setName(rs.getString("phone"));
				studentList.add(student);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
	
	

}
