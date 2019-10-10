import java.util.Scanner;

public class Keskustelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    String syottörivi;

    System.out.println("Hyvää päivää! Mitä kuuluu? ");
    syottörivi = lukija.nextLine();
    System.out.println("No mutta sepäs kiinnostavaa, kerro lisää! ");
    syottörivi = lukija.nextLine();
    System.out.println("Kiitos kertomastasi! ");    
    }
}
