package tester;
import static com.app.core.Library.sdf;
import static utils.CollectionUtils.populateData;
import static utils.CollectionUtils.populateHashMap;

import static utils.ValidationUtils.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Library;

import cust_exception.BookHandlingException;
public class Tester {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Library> library = populateHashMap(populateData());
			boolean exit = false;
			while (!exit) {
				System.out.println("Options: 1. Add book. 2 Display All books in a library 3 Issue out a book. 4 Return a book 5 Remove book");
				System.out.println("6. Remove by author name 7. Sort as per aesc book title 8. 10. Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // Adding the book
						System.out.println("Enter book details: Title(string),Category(enum),Price ,Publish Date,authorName,quantity");
						System.out.println("Enter book title");
						sc.nextLine();
						String title1 = sc.nextLine();
						Library lib =library.get(title1);
						if(lib==null) {
							//add
							System.out.println(library.put(title1, new Library(title1, convertCategory(sc.next()), sc.nextDouble(),
									sdf.parse(sc.next()), sc.next(),sc.nextInt())));
						}
						else {
							lib.setQuantity(lib.getQuantity()+1);
						}
						System.out.println("Book added successfully");

						break;
						
						case 2://Display all book details
							for(Library l : library.values())
								System.out.println(l);
							break;
							
						case 3:// Issue out a book.
//							i/p book title
//							If the book is found , update the quantity suitably.
							System.out.println("Enter book title: ");
							sc.nextLine();
							String title2 = sc.nextLine();
							Library lib2 =library.get(title2);
							if(lib2==null || lib2.getQuantity()==0) 
								throw new BookHandlingException("Book not available");
							
							else {
								lib2.setQuantity(lib2.getQuantity()-1);
							}
							break;
							
						case 4://Return a book
//							i/p book title
//							If the book is found , update the quantity suitably.
							System.out.println("Enter book title: ");
							sc.nextLine();
							String title3 = sc.nextLine();
							Library lib3 =library.get(title3);
							lib3.setQuantity(lib3.getQuantity()+1);
							break;
							
						case 5://Remove book
							System.out.println("Enter book title to remove: ");
							sc.nextLine();
							String title4 = sc.nextLine();
							if(library.containsKey(title4))
							{
								library.remove(title4);
								System.out.println("Book removed successfully..!!");
							}
							else 
								throw new BookHandlingException("No such book exist");							
						break;
						
	
					case 10:
							exit = true;
							break;
					}
					
				}
				catch(Exception e ) {
					e.printStackTrace();
					System.out.println("Exception in tester's inner" +e.getMessage());
					sc.nextLine();
				}
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Exception in tester's outer "+e.getMessage());
		}

	}

}
