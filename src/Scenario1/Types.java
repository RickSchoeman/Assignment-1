package Scenario1;

/**
 * Created by ricks on 15-12-2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Types {
    private static List<Type> types = new ArrayList<>();

    public Types() {
    }

    public static void addType(Type f){
        types.add(f);
    }

    public static List<Type> getAllTypes(){
        return types;
    }

    public static Type getType(int index){
        return types.get(index - 1);
    }
}