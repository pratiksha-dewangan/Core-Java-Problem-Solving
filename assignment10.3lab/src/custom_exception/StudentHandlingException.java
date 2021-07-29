package custom_exception;
//2.3 Create custom exception class
public class StudentHandlingException extends Exception{
	public StudentHandlingException(String mesg) {
		super(mesg);
	}
}
