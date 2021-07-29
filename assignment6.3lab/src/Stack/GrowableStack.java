package Stack;

public class GrowableStack implements Stack{
	
	private int TOP;
	private Employee[] emp;
	
	public GrowableStack() {
		TOP = -1;
		emp = new Employee[STACK_SIZE];
	}
	
	@Override
	public void push(Employee e) {
		
		if(TOP < emp.length) {
			 emp[++TOP]= e;
		}
		else {
			Employee copyemp[] = new Employee[emp.length*2];
			for(int i=0;i<emp.length;i++) {
				copyemp[i] = emp[i];
			}
			copyemp = emp;
			emp[++TOP] = e;
		}	
	}
	
	@Override
	public Employee pop() {
		if(TOP==-1) { 
			System.out.println("Stack Underflow!!");
			return null;
		}
		else {
			return emp[TOP--] = null;
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
