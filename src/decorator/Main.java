package decorator;
// https://qiita.com/i-tanaka730/items/a0f53d70b0830cfd150b
public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello world");
        b1.show();
        System.out.println("");

        Display b2 = new SideBorder(b1);
        b2.show();
        System.out.println("");

        Display b3 = new FullBorder(b2);
        b3.show();
        System.out.println("");

        Display b4 =
            new FullBorder(
                new SideBorder(
                    new FullBorder(
                        new StringDisplay("Hello japan"))));
        b4.show();
    }
}
