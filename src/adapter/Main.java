package adapter;
//https://qiita.com/i-tanaka730/items/da8731c219c921d30a59
public class Main {
//	Used inheritance.
    public static void main(String[] args) {
        Student student = new HumanAdapter("keiichi", 31);
        student.showName();
        student.showAge();
    }
}
