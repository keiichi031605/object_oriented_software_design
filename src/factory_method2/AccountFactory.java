package factory_method2;

import java.util.*;
public class AccountFactory extends Factory {

    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new Account(owner);
    }

    protected void registerProduct(Product product) {
        owners.add( ((Account)product).getOwner() );
    }

    public List getOwners() {
        return owners;
    }
}
