package Tester;
import java.util.Scanner;
import com.app.org.*;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hiring Capacity: ");
		Emp[] employees = new Emp[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		
		while(!exit ) {
			System.out.println("Select from the following options 1. Hire Manager 2. Hire Worker 3. Display info of all Employee 4. Update performanceBonus or hourly rate 10.Exit");
			switch(sc.nextInt()) {
			
//			1. Hire Manager
			case 1: 
				if(counter< employees.length) {
					System.out.println("Enter Manager details : id,name, deptId(str), basic, performanceBonus");
					employees[counter++] = new Mgr(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),	sc.nextDouble());
				}
				else {
					System.out.println("No vacancy for Managers");
				}
				break;
			
			case 2:
//				2. Hire Worker
				if(counter<employees.length) {
					System.out.println("Enter student details : int id, String name, String deptId, double basic, int hoursWorked, double hourlyRate");
					employees[counter++] = new Worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),sc.nextInt(), sc.nextDouble());			
				}
				else {
					System.out.println("No vacancy for Workers");
				}
				break;
				
			case 3:
//				3. Display information of all employees including net salary  using single for-each loop.			
				System.out.println("Details of all employee are:");
				for (Emp e : employees) {
					if(e  != null) {
							System.out.println(e);
//							Display from the same for-each loop, performance bonus if it's a manager or if it's a worker , display hourly rate of the worker .
							
							if (e instanceof Mgr) {
								System.out.print("Performance bonus of Manager is:");
								System.out.println(((Mgr) e).getPerformanceBonus());
							}
							else
//							(e instanceof Worker) 
							{
								System.out.print("Houtly rate of Worker is: ");
								System.out.println(((Worker) e).hrlyRate());
							}
					}
				}
				break;

//				4. Update performanceBonus or hourly rate
//				I/P : emp id , bonus or hourly rate increment
//				Update the details suitably.
				
			case 4:
				System.out.println("Enter index value : ");
				Emp e = employees[sc.nextInt()];
				if(e  != null) 
				{
					if (e instanceof Mgr) 
					{
						System.out.println("Enter incremented bonus: " );
						double bonus = sc.nextDouble() + ((Mgr) e).getPerformanceBonus();
						System.out.println(bonus);
//						((Mgr)e).getPerformanceBonus(((Mgr)e).getPerformanceBonus()+sc.nextDouble());
					}
					
					else if (e instanceof Worker) 
					{
						System.out.println("Update Hourly Rate: ");
						double hrbonus =sc.nextDouble()+ ((Worker) e).hrlyRate();
						System.out.println(hrbonus);
						
					}
					else
						System.out.println("Invalid update");
				}
		
			break;
			
			case 10:
				exit = true;
				break;
			}		
		}
		sc.close();

	}

}
