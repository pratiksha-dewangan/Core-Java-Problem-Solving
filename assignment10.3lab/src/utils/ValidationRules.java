package utils;

import java.text.ParseException;
import java.util.Date;
import com.app.core.Course;
import static com.app.core.Student.sdf;

import custom_exception.StudentHandlingException;

public class ValidationRules {
	public static Course convertCourse(String courseName) throws StudentHandlingException{
		return Course.valueOf(courseName.toUpperCase());
	}
	public static Date convertDate(String date) throws ParseException{
		return sdf.parse(date);
	}
}
