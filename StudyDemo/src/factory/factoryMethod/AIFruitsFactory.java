package factory.factoryMethod;

import factory.Fruits;

public abstract class AIFruitsFactory {
	public void printCreate() {
		System.out.println("create fruits");
	}
	abstract Fruits create();
}
