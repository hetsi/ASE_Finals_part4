package creational_Factory_Method;

public class ChocolateFactory {
	
	public Chocolates selectChocolate(String chocolatename)
	{
		if(chocolatename.equalsIgnoreCase("white")) {
			return new WhiteChocolate();
		}else if(chocolatename.equalsIgnoreCase("dark")) {
			return new DarkChocolate();
		}else if(chocolatename.equalsIgnoreCase("milk"))
			return new MilkChocolate();	
		else 
			return null;
		
	}

}
