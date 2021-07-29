package tester;

import java.util.ArrayList;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.core.Student;

import custom_exception.StudentHandlingException;

public class Tester {

	//2.5 Create a Tester with following options (use dynamic data structure : ArrayList)
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
//			MUST use AL methods.
			ArrayList<Student> student = new ArrayList<>(); //size =0 capacity = 10 and ---iterate in size
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("Options : 1. Add student details 2. Fetch particular Student details 3. Display all student details 4. Cancel Admission 5. Update GPA 10.Exit");
					switch(sc.nextInt()) {
						case 1:
//							1. Add student details
							System.out.println("Enter PRN ,Name , Email , Password, Course Name ,GPA , DOB");
							student.add(new Student( sc.next(),sc.next(),sc.next(),sc.next(),convertCourse(sc.next()),sc.nextDouble(),convertDate(sc.next())));
							break;
							// 1a mona mona@gmail.com monaco123 react 4500 1-1-2020
						case 2:
//							2. Fetch Student details
//							I/P : student'd PRN
//							Either display details or throw custom exception , in case of invalid PRN
							System.out.println("Enter student PRN : ");
							Student stu = new Student(sc.next());
							int index = student.indexOf(stu);
							if(index==-1)
								throw new StudentHandlingException("No such Student exist with this id");
							System.out.println(student.get(index));
							break;
							
						case 3:
						//	3. Display All student details

							System.out.println("Details of all students:  ----");
							for(Student s: student) 
								System.out.println(s);
							break;
//							other way of iteration without using for or for each loop --- by using iterator() method
//							Iterator<Student> i1= student.iterator();
//							while(i1.hasNext())
//								System.out.println(i1.next());
							
						case 4:
//							4. Cancel Admission
//							I/P : student'd PRN
//							Either remove student  details or throw custom exception , in case of invalid PRN
							System.out.println("Enter PRN : ");
							Student student3 = new Student(sc.next());
							int index3 = student.indexOf(student3);
							if(index3==-1)
								throw new StudentHandlingException("No such Student exist with this id");
							else{
								System.out.println(student.get(index3));
								student.remove(student3);
								System.out.println("Student admission cancelled");
							}
							break;
						case 5:
//							5. Update GPA
//							I/P : student'd PRN n new GPA
//							Either update student  details or throw custom exception , in case of invalid PRN
							
							System.out.println("Enter PRN and new GPA: ");
							Student student1 = new Student(sc.next());
							double gpa = sc.nextDouble();
							int index1= student.indexOf(student1);
							if(index1 == -1) 
								throw new StudentHandlingException("No such Student exist with this id");
							else {
								Student student2 = student.get(index1);
								student2.setGpa(gpa);
								System.out.println("Update details successfully");
								System.out.println(student2.toString());
							}
							break;
							
						case 10:
							exit = true;
							break;
					}		
				}
				catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}



