package tester;
import static utils.CollectionUtils.*;
import static utils.ValidationUtils.*;
import java.util.HashMap;
import java.util.Scanner;
import static com.app.core.Library.sdf;
import com.app.core.Library;



public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			HashMap<String,Library> library = populateHashMap(populateData());
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("Options: 1. Add book. 2 Display All books in a library 3 Issue out a book. 4 Return a book 5 Remove book 10. Exit");
					switch(sc.nextInt()) 
					{
						case 1:
							System.out.println("Enter book details: Title(string),Category(enum),Price ,Publish Date,authorName,quantity");
							System.out.println("Enter title");
							String title = sc.next();
					
		
							break;
						
						case 2:
							for(Library l : library.values())
								System.out.println(l);
							break;
							
						case 10:
							exit = true;
							break;
					}
					
				}
				catch(Exception e ) {
					System.out.println("Exception in tester's inner" +e.getMessage());
				}
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Exception in tester's outer "+e.getMessage());
		}
//		
//		
//		I/P Book details
//		In case of a new book , store book details in the map.
//		In case of duplicate title , just update the quantity
//
//		
//
//		2.3 Issue out a book.
//		i/p book title
//		If the book is found , update the quantity suitably.
//
//		2.4 Return a book
//		i/p book title
//		If the book is found , update the quantity suitably.
//
//		2.5 Remove book
//		i/p book title










	}

}
