
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int paikka = 0;
        int pienin = Integer.MAX_VALUE;

        for (int i=0; ;i++) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }
            if (luettu < pienin) {
                pienin = luettu;
                paikka = i;
            }
        }

        System.out.println("Pienin luku on " + pienin);
        System.out.println("Pienin luku löytyy indeksistä " + paikka);
    }
}
