package factory.abstractFactory;

public class XFruitsFactory implements IFactory{

	@Override
	public IApple createApple() {
		return new XApple();
	}

	@Override
	public IBanana createBanana() {
		// TODO 自动生成的方法存根
		return new XBanana();
	}

}
