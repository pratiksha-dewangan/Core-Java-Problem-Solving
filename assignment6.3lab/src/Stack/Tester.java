package Stack;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of chances: ");
		Stack ref=null;
		boolean exit = false;
		
		//--- display Menu
		//1 -- Choose Fixed Stack
		//2 -- Choose Growable Stack

		while(!exit ) {
				System.out.println("Which stack do you want? 1. Fixed Stack 2. Growable stack 3. Push data  4. Pop data 5. Display 10.Exit");
				switch(sc.nextInt()) {
				case 1:
					if(ref ==null) {
						ref = new FixedStack();
					}
					else {
						System.out.println("Sorry, Stack already choosen!!");
					}
					break;
					
				case 2:
					if(ref==null) {
						ref = new GrowableStack();
					}
					else {
						System.out.println("Sorry, Stack already choosen!!");
					}
					break;
				case 3:
					//Push
					if( ref!= null) {
						System.out.println("Enter Employee details: id , name, sal");
						Employee e = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
						ref.push(e);	
					}
					else {
						System.out.println("Choose Stack first");
					}
					break;	
				case 4:
					//Pop Data
					if( ref!= null) {
						System.out.println(ref.pop()+" is popped out");
					}
					else {
						System.out.println("Choose Stack first");
					}				
					break;
				case 5:
					//Display
					if(ref != null) {
						ref.display();
					}
					break;
				case 10:
					//Exit
					exit = true;
					break;
					
				default:
					System.out.println("Invalid Choice");
				}
				}
			
		sc.close();	
	}
}
