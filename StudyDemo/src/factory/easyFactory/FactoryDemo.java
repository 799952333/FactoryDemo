package factory.easyFactory;

import factory.Fruits;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FruitsFactory sf = new FruitsFactory();
		Fruits shape = sf.getShape("circle");
		shape.eat();
		Fruits shape2 = sf.getShape("square");
		shape2.eat();
	}

}
