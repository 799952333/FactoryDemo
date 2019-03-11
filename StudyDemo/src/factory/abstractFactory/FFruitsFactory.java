package factory.abstractFactory;

public class FFruitsFactory implements IFactory{

	@Override
	public IApple createApple() {
		return new FApple();
	}

	@Override
	public IBanana createBanana() {
		// TODO 自动生成的方法存根
		return new FBanana();
	}

}
