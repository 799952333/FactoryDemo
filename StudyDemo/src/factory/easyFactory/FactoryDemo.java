package factory.easyFactory;

import factory.Fruits;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FruitsFactory sf = new FruitsFactory();
		Fruits shape = sf.getShape("circle");
		shape.eat();
		Fruits shape2 = sf.getShape("square");
		shape2.eat();
	}

}
