package packfruits;
import java.util.Scanner;
import packfruits.Apple;
import packfruits.Mango;
import packfruits.Orange;

public class Tester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basket capacity: ");
		Fruits[] newfruit = new Fruits[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			
			System.out.println("Choose from the following:");
			System.out.println("Options 1. Apple 2. Mango 3. Orange 4. Display fruits in the basket 10.Exit");
			
			switch (sc.nextInt()) {
			case 1:
				if (counter < newfruit.length) 
				{
					System.out.println("1 Apple added");
					newfruit[counter++]= new Apple(" ");
					Fruits f = new Apple(" ");
					System.out.println(f.taste());
					System.out.println("Total " + counter+"  fruits added");
					break;
				} 
				
				else 
				{
					System.out.println("Basket full!!!!");
					exit= true;	
				}	
				break;
			
			case 2:
				if (counter < newfruit.length) 
				{
					System.out.println("1 Mango added");
					newfruit[counter++]= new Mango(" ");
					Fruits f = new Mango(" ");
					System.out.println(f.taste());
					System.out.println("Total " + counter+"  fruits added");
				} 
				else 
				{
					System.out.println("Basket full!!!!");
					exit= true;	
				}	
				break;
				
			case 3:
				if (counter < newfruit.length) 
				{
					System.out.println("1 Orange added");
					newfruit[counter++]= new Orange(" ");
					Fruits f = new Orange(" ");
					System.out.println("Total " + counter+"  fruits added");
				} 
				else 
				{
					System.out.println("Basket full!!!!");
					exit= true;	
				}	
				break;
				
			case 4:
				for(Fruits f: newfruit) 
				{
					if(f != null) 
					{
						System.out.println(f.taste());
					}
				}
			
			case 10:
				exit = true;
				break;
			
			}
	}
		sc.close();
	}
	}
