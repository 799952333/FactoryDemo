package factory.factoryMethod;

import factory.Apple;
import factory.Fruits;

public class AppleFactory implements IFruitsFactory {

	@Override
	public Fruits create() {
		// TODO 自动生成的方法存根
		return new Apple();
	}

}
