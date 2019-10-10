
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku! ");
        int A = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku! ");
        int B = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku! ");
        int C = Integer.valueOf(lukija.nextLine());

        double keskiarvo = 1.0 * (A + B + C)/3;

        System.out.println("Syötettyjen lukujen keskiarvo on " +keskiarvo);


    }
}
