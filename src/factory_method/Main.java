// https://qiita.com/i-tanaka730/items/1f521866c7d699ddd093
package factory_method;

public class Main {
  public static void main(String[] args) {
      Factory factory = new IDCardFactory();
      Product card1 = factory.create("keiichi");
      Product card2 = factory.create("eliza");
      Product card3 = factory.create("ibuki");
      card1.use();
      card2.use();
      card3.use();
  }
}
