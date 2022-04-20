package factory_method;

import java.util.ArrayList;

public class IDCardFactory extends Factory {

  private ArrayList<String> owners = new ArrayList<String>();

  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  protected void registerProduct(Product product) {
    IDCard icCard = (IDCard)product;
    String owner = icCard.getOwner();
    owners.add(owner);
  }

  public ArrayList<String> getOwners() {
    return owners;
  }
}

