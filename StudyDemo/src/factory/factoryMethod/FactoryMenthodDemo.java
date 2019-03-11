package factory.factoryMethod;

public class FactoryMenthodDemo {

	public static void main(String[] args) {
		IFruitsFactory factory = new AppleFactory();
		factory.create();
		
		AIFruitsFactory factory2= new AppleFactory2();
		factory2.printCreate();
		factory2.create();
	}

}

