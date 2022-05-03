package adapter;

public class HumanAdapter extends Human implements Student {

    public HumanAdapter(String name, int age) {
        super(name, age);
    }

    public void showName() {
        printName();
    }

    public void showAge() {
        printAge();
    }
}
