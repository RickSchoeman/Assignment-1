package Scenario2;

/**
 * Created by Nick-PC on 12/15/2016.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        RectangleAdapter r = new RectangleAdapter(rec);
        Hooks h = new Hooks();
        r.display();
        h.display();
    }
}
