//https://www.xmisao.com/2013/12/11/gof-designpattern-java-abstractfactory.html
package abstract_factory2;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<AbstractFactory> factories = new ArrayList<AbstractFactory>();
		factories.add(new ConcreteFactory1());
		factories.add(new ConcreteFactory2());
		
		for(AbstractFactory factory : factories){
			AbstractProductA productA = factory.createProductA();
			productA.methodA();
			AbstractProductB productB = factory.createProductB();
			productB.methodB();
		}
	}
}
