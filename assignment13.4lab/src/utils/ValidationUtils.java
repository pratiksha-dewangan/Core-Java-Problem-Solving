package utils;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Category;

import static com.app.core.Library.sdf;
import cust_exception.BookHandlingException;

public class ValidationUtils {
	
	public static Date convertDate(String date) throws ParseException{
		return sdf.parse(date);
	}
	
	public static Category convertCategory(String ctype) throws BookHandlingException{
		return Category.valueOf(ctype.toUpperCase());
	}
}
