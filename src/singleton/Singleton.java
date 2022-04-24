package singleton;

public class Singleton {
    //①
    private static Singleton singleton = new Singleton();
    //②
    private Singleton() {
        System.out.println("Create Instance");
    }
    //➂
    public static Singleton getInstance() {
        return singleton;
    }
}
