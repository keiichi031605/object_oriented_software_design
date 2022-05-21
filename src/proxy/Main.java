package proxy;
//https://qiita.com/i-tanaka730/items/47efbab5eccc2d36759f
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Kate");
        System.out.println("current name is " + p.getPrinterName() + ".");
        p.setPrinterName("Keiichi");
        System.out.println("current name is " + p.getPrinterName() + ".");
        p.print("Hello, world.");
    }
}
