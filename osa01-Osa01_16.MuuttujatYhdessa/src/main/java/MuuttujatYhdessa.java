
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä merkkijono! ");
        String teksti = lukija.nextLine();
        System.out.println("Syötä kokonaisluku! ");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku! ");
        double luku1 = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo! ");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + teksti);
        System.out.println("Syötit kokonaisluvun " + luku);
        System.out.println("Syötit liukuluvun " + luku1);
        System.out.println("Syötit totuusarvon " + arvo);
    }
}
