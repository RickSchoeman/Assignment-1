package Scenario1;

/**
 * Created by ricks on 15-12-2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args)  {
        BestandOpslaan file = new BestandOpslaan("testfile");
        Types.addType(new RTF());
        Types.addType(new HTML());
        Types.addType(new PlainText());
        Types.addType(new WordXML());
        Types.addType(new Word97());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bestand opslaan als: ");
        int gekozenType = -1;
        boolean correct = false;
        while(!correct){
            try {
                int i = 1;
                for (Type f : Types.getAllTypes()) {
                    System.out.println(i++ + ": " + f.getClass().getSimpleName());
                }
                String keuze = br.readLine();
                gekozenType = Integer.parseInt(keuze);
                file.setType(Types.getType(gekozenType));
                file.opslaan();
                correct = true;
            } catch (IndexOutOfBoundsException e){
                System.out.println("Dit is geen valide nummer. Probeer opnieuw.");
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}