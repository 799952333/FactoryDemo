package factory.factoryMethod;

import factory.Apple;
import factory.Fruits;

public class AppleFactory implements IFruitsFactory {

	@Override
	public Fruits create() {
		// TODO �Զ����ɵķ������
		return new Apple();
	}

}
