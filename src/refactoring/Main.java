package refactoring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Backup for the assignment2 

//class CurrentAccount extends Account {
//    // private static String name;
//    // private static String id;
//    // private double balance;
//    private double overdraft; // overdraft facility granted
//    private double overdrawn = 0; // overdrawn amount
//
//    protected CurrentAccount(String name, String id, double balance, double overdraft) {
//        // this.name = name;
//        // this.id = id;
//        // this.balance = balance;
//        super(name, id, balance);
//        this.overdraft = overdraft;
//    }
//
//    // public double getBalance() {
//    //     return balance;
//    // }
//
//    // public void deposit(double amt) {
//    //     balance += amt;
//    // }
//
//    public void updateBalanceAndOverdrawn(double amt) {
//        if (amt < balance) 
//            balance -= amt;
//        else {
//            balance = 0;
//            overdrawn += amt - balance;
//        }
//    }
//
//    public boolean withdraw(double amt) {
//        if (balance + overdraft >= amt) {
//            // if (amt < balance) 
//            //     balance -= amt;
//            // else {
//            //     balance = 0;
//            //     overdrawn += amt - balance;
//            // }
//            this.updateBalanceAndOverdrawn(amt);
//            return true;
//        }
//        return false;
//    }
//}


//class SavingsAccount extends Account {
//    // private String name;
//    // private String id;
//    // private double balance;
//    private double minAmount; // minimum amount to be maintained
//
//    protected SavingsAccount(String name, String id, double balance, double minAmount) {
//        // this.name = name;
//        // this.id = id;
//        // this.balance = balance;
//        super(name, id, balance);
//        this.minAmount = minAmount;
//    }
//
//    // public double getBalance() {
//    //     return balance;
//    // }
//
//    // public void deposit(double amt) {
//    //     balance += amt;
//    // }
//    public void updateBalance(double amt) {
//        balance -= amt;
//    }
//
//    public boolean withdraw(double amt) {
//        if (balance - minAmount >= amt) {
//            // balance -= amt;
//            updateBalance(amt);
//            return true;
//        }
//        return false;
//    }
//
//    /*
//    public void setIdentification(String n, String i) {
//        name = n;
//        id = i;
//    }*/
//}


