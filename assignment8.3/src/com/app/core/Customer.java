package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

import newpackage.CustomerHandlingException;

//Create Java application for customer management system.

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private CustomerType ctype;
	
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	//2.1 Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date),type (CustomerType : enum)
	//Add/generate suitable constructor 
	public Customer(String name, String email, String password, double registrationAmount, Date dob,CustomerType ctype) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.ctype = ctype;
	}
	

	public Customer(String email) {
		super();
		this.email = email;
	}


	//and  toString
	@Override
	public String toString() {
		return "Customer [Name: " + name + ", Email: " + email + ", Password: " + password + ", Registration Amount: "
				+ registrationAmount + ", DOB: " + dob + ", Customer Type: " + ctype + "]";
	}
	
	//Unique ID(Primary Key ) : email  (2 customers are SAME iff their email ids are same)
	@Override
	public boolean equals(Object anotherCustomer) {
		if(anotherCustomer instanceof Customer)
			return email.equals(((Customer)anotherCustomer).email);
		return false;
	}
	
}
//Will you add any other data member in Customer class for parsing n formatting dates ? YES 
//HOW ? : add public static SimpleDateFormat sdf and create a static initialiser block
