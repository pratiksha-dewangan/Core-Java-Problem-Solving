package com.app.org;

public class Mgr extends Emp{

//2.2 Mgr state  ---id,name,basic,deptId , perfmonceBonus
	private double performanceBonus;
	public Mgr(int id, String name, String deptId, double basic, double performanceBonus) {
		super(id, name, deptId,basic);
		this.performanceBonus = performanceBonus;
	}
	
//Behaviour ----1. get mgr details :  override toString. 
	
	@Override
	public String toString() {
		return "Manager [Performance Bonus=" + performanceBonus + ", " + super.toString()+" ]";
	}
	 
	//2. compute net salary (formula: basic+performanceBonus)
	
	@Override
	public double computeNetSalary() {
		return  super.getBasic() + performanceBonus;
	}
	//3. get performance bonus. --add a new method to return bonus.(getter)
	
	public double getPerformanceBonus() {
		return performanceBonus;
	}
	
}

