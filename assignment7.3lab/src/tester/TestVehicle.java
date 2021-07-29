package tester;
import java.util.Scanner;
import com.app.vehicles.*;

//Create a class TestVehicle under the package "tester"
public class TestVehicle {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
				{
					
					System.out.println("Enter vehicle 1 info registration no. , color and price");
					Vehicle v1 = new Vehicle(sc.next(),sc.next(),sc.nextDouble());
					
					System.out.println("Enter vehicle 2 info registration no. , color and price");
					Vehicle v2 = new Vehicle(sc.next(),sc.next(),sc.nextDouble());
					
					System.out.println(v1.toString());
					System.out.println(v2.toString());
					
					//Display "SAME" or "DIFFERENT" , using inherited "equals" method , from Object class.
					System.out.println(v1.equals(v2));
					
					//checking location
					System.out.println(v1.hashCode()+" "+v2.hashCode());
				}
	
		//Observe & conclude
		//Is there any problem ? YES 
		//If yes : think of the solution. 

	}

}
