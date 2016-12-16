package Scenario1;

import java.io.File;

/**
 * Created by ricks on 15-12-2016.
 */
public class Word97 implements Type {
    public void opslaan(File f){
        System.out.println("Bestand " + f.getName() + " opgeslagen als Word97");
    }
}
