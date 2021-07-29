package com.app.org;

public class Worker extends Emp{
//	2.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(int id, String name, String deptId, double basic, int hoursWorked, double hourlyRate) {
		super(id, name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
//	Behaviour--- 
//	1. get worker details -- :  override toString.

	@Override
	public String toString() {
		return "Worker [Hours Worked=" + hoursWorked + ", Rate per Hour=" + hourlyRate + "," + super.toString()+
				 ", Salary =" + super.getBasic()+" ]";
				}

//	2.  compute net salary (formula:  = basic+hoursWorked*hourlyRate) --override computeNetSalary
	public double computeNetSalary() {
		return super.getBasic() +(hoursWorked*hourlyRate);
	}

//	3. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
	
	public double hrlyRate() {
		return hourlyRate;
	}
}
