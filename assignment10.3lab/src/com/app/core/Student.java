package com.app.core;
//Student  : 

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

//		2.1 Student : prn (string : unique id) , name , email , password, course (enum) ,GPA(double) , dob(Date)
	private String prn;
	private String name;
	private String email;
	private String password;
	private Course crse;
	private double gpa;
	private Date dateOfBirth;
	
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
//	Add suitable constructor/s , toString , equals (as per the requirement)
	public Student(String prn, String name, String email, String password, Course crse, double gpa, Date dateOfBirth ) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.crse =crse;
		this.gpa = gpa;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Student(String prn) {
		super();
		this.prn = prn;
	}	

	public double setGpa(double arg) {
		this.gpa=arg;
		return this.gpa;
	}

	@Override
	public String toString() {
		return "Student [Id=" + prn + ", Name=" + name + ", Email=" + email + ", Password=" + password + ", Course Taken=" + crse
				+ ", GPA =" + gpa + ", D-0-B=" + sdf.format(dateOfBirth) + "]";
	}
@Override
public boolean equals(Object o) {
	System.out.println("In equals ");
	if(o instanceof Student)
		return prn==(((Student)o).prn);
	return false;
}

}
