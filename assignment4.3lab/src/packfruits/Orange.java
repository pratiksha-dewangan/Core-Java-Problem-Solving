package packfruits;

public class Orange extends Fruits{
	
	private String name; 
	
	public Orange(String name) 
	{
		super(name);
		this.name = name;
	}
	
	public String taste() {

		return super.taste()+" is Orange which sour in taste";
	}
}

