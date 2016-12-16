package Scenario2;

/**
 * Created by Nick-PC on 12/16/2016.
 */
public class RectangleAdapter implements Shape {
    Rectangle rec;

    public RectangleAdapter(Rectangle rec){
        this.rec = rec;
    }

    public void display() {
        rec.display(0, 0, 10, 10);
    }
}
