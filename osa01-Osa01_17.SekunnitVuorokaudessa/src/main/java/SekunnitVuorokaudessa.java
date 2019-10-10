
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);       
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan? ");
        String strVuorokausi = lukija.nextLine();
        int vuorokausi = Integer.parseInt(strVuorokausi);
        int laskuSuluissa = (((60 * 60) * 24) * vuorokausi);
        System.out.println(laskuSuluissa);
    }
}
