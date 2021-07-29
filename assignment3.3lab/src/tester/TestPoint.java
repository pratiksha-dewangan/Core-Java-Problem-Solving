package tester;
import com.geometry.*;
import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try(Scanner scan = new Scanner(System.in)){
        
        System.out.println("Enter x and y in cordinates--");
        Point2D p1 = new Point2D(scan.nextInt(), scan.nextInt());
        
        System.out.println("Again Enter x and y in cordinates--");
        Point2D p2 = new Point2D(scan.nextInt(), scan.nextInt());
      
        
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        System.out.println(p1.isEqual(p2)? "SAME" : "DIFFERENT");
     
        Point2D p3 = p1;
        System.out.println(p3.getDetails());
        System.out.println((p1.calculateDistance(4,3)));
	}
		

	}

}


//equals -- check the reference quality
//isEqual - check the content equality
