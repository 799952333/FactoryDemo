package factory.abstractFactory;

public class FFruitsFactory implements IFactory{

	@Override
	public IApple createApple() {
		return new FApple();
	}

	@Override
	public IBanana createBanana() {
		// TODO �Զ����ɵķ������
		return new FBanana();
	}

}
