package factory.abstractFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		FFruitsFactory f= new FFruitsFactory();
		f.createApple().eat();;
		XFruitsFactory x= new XFruitsFactory();
		x.createApple().eat();;
	}
}
