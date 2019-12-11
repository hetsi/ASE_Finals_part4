package creational_Factory_Method;

public class ChooseChocolate {
	public static void main(String args[]) {
		ChocolateFactory cocofactory = new ChocolateFactory();
		Chocolates coco = cocofactory.selectChocolate("white");
		coco.eat();
		
	}

}
