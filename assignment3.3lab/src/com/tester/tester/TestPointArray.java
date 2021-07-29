package com.tester.tester;
import java.util.Scanner;
import com.geometry.*;

public class TestPointArray {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many point you want to plot?");
		Point2D[] points =new Point2D[scan.nextInt()];
		int i=1;
		Menu m = new Menu();
		do {
			
			m.menufunction();
			int choice = scan.nextInt();
			if(choice == 5) {
				break;
			}
			switch(choice) {
			case 1:
				System.out.println("Enter index number: ");
				int index = scan.nextInt();
				if(index>=0 && index < points.length && points[index]==null) {
					System.out.println("Enter cordinates x and y of "+i);
					points[index]=new Point2D(scan.nextInt(), scan.nextInt());
					System.out.println("Points added at index "+index);
				}
				else {
					System.out.println("Point already plotted or invalid index");
				}
				break;		
			case 2:
				for(Point2D p: points)
				{
					if(p != null) {
						System.out.println(p.getDetails());	
					}		
				}
				break;
			case 3:
				System.out.println("Enter two index position to compare: " );
				System.out.println(points[scan.nextInt()].isEqual(points[scan.nextInt()])? "SAME" : "DIFFERENT");
				break;
				
			case 4:
				System.out.println("Enter index position to compare and enter cordinates of points: " );
				System.out.println((points[scan.nextInt()].calculateDistance(scan.nextInt(),scan.nextInt())));
				System.out.println("Distance bwtween two points are: ");
	
				break;

			 case 5:
                scan.close();
                System.exit(0);
              
			default:
				System.out.println("Invalid index i.e. Index out of range");
				break;
			}

		}while(true);
	}
}
class Menu{
	public void menufunction() {
		System.out.println("Choose from the below options");
		System.out.println("-------------------------------------------------");
		System.out.println("1. Plot a new point at a particular index");
		System.out.println("2. Display all points plotted so far");
		System.out.println("3. Test Equality of two points");
		System.out.println("4. Calculate distance between two points");
		System.out.println("5. Enter 10 to exit");
	}
	
}
