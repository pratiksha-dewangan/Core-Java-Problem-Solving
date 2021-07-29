package utils;
//Supply these validation rules using different static methods.
//(Centralized exception handling is expected)
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerType;

import newpackage.CustomerHandlingException;

import static com.app.core.CustomerType.valueOf;
import static com.app.core.Customer.sdf;

public class ValidationRules {
	public static final int max_password_length;
	public static final int min_password_length;
	static {
	//	password must be min 4 max 10 chars long
		min_password_length=4;
		max_password_length=10;
	}
	
	//
	public static String passwordCheck(String password) throws CustomerHandlingException{
		if(password.length()< min_password_length) {
			throw new CustomerHandlingException("Password less than 4 digit...");
		}
		if(password.length()>max_password_length ) {
			throw new CustomerHandlingException("Password greater than 10 digit...");
		}
		return password;
	}
	
	//reg amount should be multiples of 500
	public static double validateRegistrationAmt(double registrationamt) throws CustomerHandlingException {
		if ((registrationamt%500) != 0)
			throw new CustomerHandlingException("Registration Amount must be in multiple of 500.");
		return registrationamt;
	}
	
	//email must contain "@" & should be from ".com" domain(contains.endswith())
//	public static String validateEmail(String email) throws CustomerHandlingException{
//		if(email.contains("@")  &&  email.endsWith(".com")) 
//			return email;
//		else throw new CustomerHandlingException("Email id must include @ and endswith .com");
//
//	}

	//dob should be before 1st Jan 1995 (using before)-==-------------------------------------------------------------------------
	public static Date convertDate(String date) throws ParseException,CustomerHandlingException{
		if(sdf.parse("01-01-1995").before(sdf.parse(date)))
			throw new CustomerHandlingException("DOB-should be before 01-01-1995");
		return sdf.parse(date);
		//sdf.parse will convert (str-->date)
	}
		
	public static CustomerType newcustomertype(String ctype) throws CustomerHandlingException {
	try {
		return valueOf(ctype.toUpperCase());
	} catch (IllegalArgumentException e) {
		StringBuilder string1 = new StringBuilder("Invalid Category Choosen!!! \n");
		string1.append(Arrays.toString(CustomerType.values()));
		
		//rethrow own own custom exception
		throw new CustomerHandlingException(ctype.toString());
	}
	}
	
	public static String checkForDuplication(String email, Customer[] customer) throws CustomerHandlingException{
		Customer customer1 = new Customer(email);
		for(Customer cus : customer)
			if(cus != null && cus.equals(customer1))
				throw new CustomerHandlingException("Duplicate details of customer is not allowed");
		if(email.contains("@")  &&  email.endsWith(".com")) 
		return email;
		else throw new CustomerHandlingException("Email id must include @ and endswith .com");
	}
}


