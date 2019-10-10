
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        for (Integer luku : luvut) {
            if (luku < alaraja) {
                continue;
            }

            if (luku > ylaraja) {
                continue;
            }

            System.out.println(luku);
        }
    }
}