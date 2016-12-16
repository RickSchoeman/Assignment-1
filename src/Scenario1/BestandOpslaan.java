package Scenario1;

import java.io.File;

/**
 * Created by ricks on 15-12-2016.
 */
public class BestandOpslaan extends File{
    private Type type;

    public BestandOpslaan(String name){
        this(name,null);
    }

    public BestandOpslaan(String name, Type type) {
        super(name);
        this.type = type;
    }

    public void setType(Type type){
        this.type = type;
    }

    public void opslaan(){
        type.opslaan(this);
    }

}
