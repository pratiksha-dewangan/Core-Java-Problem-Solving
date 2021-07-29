package Stack;

public class FixedStack  implements Stack{
	private int TOP;
	private Employee[] emp;
	
	public FixedStack() {
		TOP = -1;
		emp = new Employee[STACK_SIZE];
	}
	
	@Override
	public void push(Employee e) {
		if(TOP == STACK_SIZE-1) {
			System.out.println("Stack overflow!!");
		}
		else {
			emp[++TOP]= e;
		}
	}
		
	@Override
	public Employee pop() {
		if(TOP==-1) { 
			System.out.println("Stack Underflow!!");
			return null;
		}
		else {
			System.out.println();
			return emp[TOP--]=null;
		}
	}

	@Override
	public void display() {
		for(Employee e : emp) {
			if(e != null) {
				System.out.println(e.toString());
			}
		}
	}
	

}
