
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luku1;
        int luku2;
        int summa=0;

        System.out.println("Ensimmäinen: ");
        luku1=lukija.nextInt();
        System.out.println("Viimeinen: ");
        luku2=lukija.nextInt();

        while (luku1<=luku2)
        {
            summa=summa+luku1;
            luku1++;
        }

        System.out.println("summa on " +summa);

        }
}
