package com.app.org;

public abstract class Emp {
//2.1 Emp state--- id(int), name, deptId(string) , basic(double)
	
	private int id;
	private String name;
	private String deptId;
	private double basic;
	
	public Emp(int id, String name, String deptId, double basic) {
//		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.basic = basic;
	}
	/* Behaviour ---1.  get emp details -- use toString.
	2. compute net salary ---
	eg : public double computeNetSalary() */
	
	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Department Id=" + deptId + ", Basic Salary=" + basic;
	}
	
	public double getBasic() {
		return basic;
	}

	public abstract double computeNetSalary();
}
