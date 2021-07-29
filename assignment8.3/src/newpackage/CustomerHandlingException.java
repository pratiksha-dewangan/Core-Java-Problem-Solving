package newpackage;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception{
//2.2 Create custom exception (checked exception )class in a separate package---CustomerHandlingException
	public CustomerHandlingException(String errMesg) {
		super(errMesg);
	}
	
	}


