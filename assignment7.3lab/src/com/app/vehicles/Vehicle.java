package com.app.vehicles;

//Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
public class Vehicle {
	
//	state(data members)  : registrationNo : String , color : String , price : double
//	registrationNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)

	private String registrationNo;
	private String color;
	private double price;
	
	public Vehicle(String registrationNo, String color, double price) {
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}

//	Override toString to return complete state.
	@Override
	public String toString() {
		return "Vehicle [Registration Number :" + registrationNo + ", Color : " + color + ", Price :" + price + "]";
	}


//	@Override
// auto-generated metjod
//	public boolean equals(Object obj) {
//		Vehicle other = (Vehicle) obj;
//		if (registrationNo != other.registrationNo)
//			return false;
//		else {
//			return true;
//		}
	
	@Override
	public boolean equals(Object anothervehicle) 
	{
		System.out.println("Comparing two vehicles...........");
		if(anothervehicle instanceof Vehicle)
			return registrationNo.equals(((Vehicle)anothervehicle).registrationNo);
		return false;
	}
	

	
}

