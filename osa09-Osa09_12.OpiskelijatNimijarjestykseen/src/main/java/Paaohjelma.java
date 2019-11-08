
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Paaohjelma {

    public static void main(String[] args) {
        ArrayList<String> opiskelija = new ArrayList<>();
        Opiskelija eka = new Opiskelija("jamo");
        Opiskelija toka = new Opiskelija("jamo1");
        System.out.println(eka.compareTo(toka));
        
        ArrayList<Opiskelija> opiskelijat = new ArrayList<>();
        opiskelijat.add(eka);
        opiskelijat.add(toka);
        opiskelijat.add(new Opiskelija ("Anne"));
        opiskelijat.add(new Opiskelija ("Matti"));
        
        opiskelijat.stream().sorted().forEach(o -> System.out.println(o));
       
    }
}
