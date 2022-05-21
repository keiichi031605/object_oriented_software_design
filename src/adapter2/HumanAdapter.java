package adapter2;

public class HumanAdapter implements Student {

    private Human human;

    public HumanAdapter(String name, int age) {
        this.human = new Human(name, age);;
    }

    public void showName() {
        human.printName();
    }

    public void showAge() {
        human.printAge();
    }
}
