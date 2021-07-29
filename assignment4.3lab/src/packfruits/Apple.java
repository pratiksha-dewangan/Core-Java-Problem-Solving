package packfruits;

public class Apple extends Fruits{
	
	private String name; 
	
	public Apple(String name) 
	{
		super(name);
		this.name = name;
	}
	
	@Override
	public String taste() {

		return super.taste()+" is  Apple which sweet and sour in taste";
	}
	

}

