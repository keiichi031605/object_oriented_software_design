//https://qiita.com/shoheiyokoyama/items/d752834a6a2e208b90ca
package factory_method2;

public class Main {
	public static void main(String[] args) {
		Factory factory = new AccountFactory();
		Product account1 = factory.create("Ralph Johnson");
		Product account2 = factory.create("Richard Helm");
		Product account3 = factory.create("John Vlissides");
		Product account4 = factory.create("Erich Gamma");

		account1.use();
		account2.use();
		account3.use();
		account4.use();
	}
}
