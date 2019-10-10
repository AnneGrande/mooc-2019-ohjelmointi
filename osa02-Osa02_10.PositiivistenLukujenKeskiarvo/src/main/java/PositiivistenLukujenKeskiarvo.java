
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int summa = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            }
            if (luku >= 0) {
                lukuja = lukuja + 1;
                summa = summa + luku;

            }

        }

        if (lukuja == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
        else {
            System.out.println((double) summa / lukuja);
        }
    }
}
