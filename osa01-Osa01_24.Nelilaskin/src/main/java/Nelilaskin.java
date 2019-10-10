
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä ensimmäinen luku! ");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku! ");
        int luku2 = Integer.valueOf(lukija.nextLine());

        int summa = (luku1 + luku2);
        int erotus = (luku1 - luku2);
        int tulo = (luku1 * luku2);
        double jako = (1.0 * luku1 / luku2);
        
        System.out.println(luku1+" + "+luku2 +" = "+summa);
        System.out.println(luku1+" - "+luku2 +" = "+erotus);
        System.out.println(luku1+" * "+luku2 +" = "+tulo);
        System.out.println(luku1+" / "+luku2 +" = "+jako);
    }
}
