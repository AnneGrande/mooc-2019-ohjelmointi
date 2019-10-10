
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner lukija = new Scanner(System.in);
        
        String nimi = "";
        int vanhin = -1;
        System.out.println("Mikä tiedosto luetaan?");
        try (Scanner tiedostonLukija = new Scanner(new File(lukija.nextLine()))) {
            while (tiedostonLukija.hasNextLine()) {
                String[] rivi  = tiedostonLukija.nextLine().split(",");
                if (Integer.valueOf(rivi[1]) > vanhin) {
                    vanhin = Integer.valueOf(rivi[1]);
                    nimi = rivi[0];
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
        System.out.println("Vanhin oli: " + nimi);

    }
}