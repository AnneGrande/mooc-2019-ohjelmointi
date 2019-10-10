import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int mista;
        int mihin;

        System.out.println("Mihin asti?");
        mihin = lukija.nextInt();
        System.out.println("Mistä lähtien?");
        mista = lukija.nextInt();
        while (mista <= mihin) {
            System.out.println(mista);
            mista++;
        }
    }
}
