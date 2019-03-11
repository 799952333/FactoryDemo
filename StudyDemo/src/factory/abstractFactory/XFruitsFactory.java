package factory.abstractFactory;

public class XFruitsFactory implements IFactory{

	@Override
	public IApple createApple() {
		return new XApple();
	}

	@Override
	public IBanana createBanana() {
		// TODO �Զ����ɵķ������
		return new XBanana();
	}

}
