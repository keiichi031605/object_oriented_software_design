package bridge;
//https://qiita.com/i-tanaka730/items/91debf39a7f64ef6cb23
public class Main {

    public static void main(String[] args) {
        Display d = new Display(new StringDisplayImpl("Display Test"));
        CountDisplay cd = new CountDisplay(new StringDisplayImpl("CountDisplay Test"));
        RandomCountDisplay rcd = new RandomCountDisplay(new StringDisplayImpl("RandomCountDisplay Test"));
        d.display();
        cd.multiDisplay(5);
        rcd.randomDisplay(10);
    }
}
