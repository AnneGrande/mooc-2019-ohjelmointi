
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Mitä tulostetaan? ");
        String tulostettava = lukija.nextLine();
        
        System.out.println(tulostettava + tulostettava + tulostettava);
    }
}