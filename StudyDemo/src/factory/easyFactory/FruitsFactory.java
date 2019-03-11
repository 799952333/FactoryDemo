package factory.easyFactory;

import factory.Apple;
import factory.Banana;
import factory.Fruits;

public class FruitsFactory {
	public Fruits getShape(String shape) {
		if(shape.equalsIgnoreCase("apple")) {
			return new Apple();
		}else if(shape.equalsIgnoreCase("banana")) {
			return new Banana();
		}else {
			return null;
		}
		
	}
}
