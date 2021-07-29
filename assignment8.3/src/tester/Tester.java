package tester;

//import java.util.Date;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.core.Customer;
//import com.app.core.CustomerType;

public class Tester {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("How many customer info you want to enter?");
			Customer[] customer = new Customer[sc.nextInt()];
			int counter=0;
			
			/* duplicate customer details should not be stored. c1.equals.c2*/
			
			boolean exit = false;
			while(!exit) {
				System.out.println("Choose from the following: 1. Prompt for customer details 2. Display details of all registered customers 3. Exit");
				try{
					switch(sc.nextInt()) {
					case 1:
//						Validate customer details (using validation rules)
//						You should not  accept duplicate customer details
//						Iff it's valid , create customer instance , o.w display error message via catch clause.
						if(counter< customer.length) {
							System.out.println("Enter Customer details : String name, String email, String password, "
									+ "double registrationAmount, Date dob,CustomerType ctype");
							
							customer[counter++] = new Customer(sc.next(), checkForDuplication(sc.next(), customer), passwordCheck(sc.next()), 
									validateRegistrationAmt(sc.nextDouble()),	convertDate(sc.next()),newcustomertype(sc.next()));
						}
						else {
							System.out.println("Customer Table full...");
						}
						break;
					case 2:
//						2. Display details of all registered customers using (for-each)
						if(counter!=0){
								for( Customer c : customer) 
									if(c !=null)
										System.out.println(c);
							}
						else {
							System.out.println("No customer yet registered..!!");
						}
						break;
					case 3 :
						//Exit
						exit = true;
						break;
				}
					
				}
				catch(Exception e){
					e.printStackTrace();
					System.out.println("Error in inner TRY block "+ e);
					
				}
				sc.nextLine();
			}
					
		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Error in outer TRY block");
//		}
	}	
}

