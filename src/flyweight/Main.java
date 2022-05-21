package flyweight;
//https://qiita.com/i-tanaka730/items/ed32b9a7c3f9f72b59ef
public class Main {
    public static void main(String[] args) {
        
        System.out.println(args[0]);
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
