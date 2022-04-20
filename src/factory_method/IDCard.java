package factory_method;

public class IDCard extends Product {

  private String owner;

  IDCard(String owner) {
    System.out.println(owner + "is created");
    this.owner = owner;
  }

  public void use() {
    System.out.println(owner + "is created");
  }

  public String getOwner() {
    return owner;
  }
}
