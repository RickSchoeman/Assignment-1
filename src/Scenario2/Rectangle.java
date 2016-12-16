package Scenario2;

/**
 * Created by Nick-PC on 12/15/2016.
 */
public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
    }

    public void display(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "rectangle x = " + x + ", y = " + y + ", width = " + width + ", height = " + height;
    }
}
