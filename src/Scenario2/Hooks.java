package Scenario2;

/**
 * Created by ricks on 16-12-2016.
 */
public class Hooks implements Shape {
    private int xLinks;
    private int yLinks;
    private int xRechts;
    private int yRechts;

    @Override
    public void display(){
        this.xLinks = 5;
        this.yLinks = 5;
        this.xRechts = 1;
        this.yRechts = 1;
        System.out.println(toString());
    }


    @Override
    public String toString(){
        return "Hoeken hebben coördinaten linksboven : x = " + xLinks + ", y = " + yLinks + ". Rechtsboven : x = " + xRechts + ", y = " + yRechts;
    }
}
