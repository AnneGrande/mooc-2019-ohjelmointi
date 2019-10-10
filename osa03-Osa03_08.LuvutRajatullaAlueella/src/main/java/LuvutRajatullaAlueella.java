
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        try(Scanner lukija = new Scanner(System.in)) {
            int luku;
            while ((luku = Integer.valueOf(lukija.nextLine())) != -1) luvut.add(luku);
            System.out.println("Mistä?");
            int mista = Integer.valueOf(lukija.nextLine());
            System.out.println("Mihin?");
            int mihin = Integer.valueOf(lukija.nextLine());
            while (mista <= mihin) System.out.println(luvut.get(mista++));
        }
    }

        }
