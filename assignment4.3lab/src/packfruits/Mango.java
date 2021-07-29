package packfruits;

public class Mango extends Fruits{
	
	private String name; 
	
	public Mango (String name) 
	{
		super(name);
		this.name = name;
	}
	
	public String taste() {

		return super.taste()+" is Mango which sweet in taste";
	}
	

}

