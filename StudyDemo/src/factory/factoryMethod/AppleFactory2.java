package factory.factoryMethod;

import factory.Apple;
import factory.Fruits;

public class AppleFactory2 extends AIFruitsFactory {

	@Override
	public Fruits create() {
		// TODO �Զ����ɵķ������
		return new Apple();
	}

}
