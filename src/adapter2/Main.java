	package adapter2;

public class Main {
    public static void main(String[] args) {
        Student student = new HumanAdapter("keiichi", 32);
        student.showName();
        student.showAge();
    }
}
