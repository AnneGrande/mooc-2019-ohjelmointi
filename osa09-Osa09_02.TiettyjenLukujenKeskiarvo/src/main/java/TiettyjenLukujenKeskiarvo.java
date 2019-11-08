
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        ArrayList<Integer> luettu = new ArrayList<>();

        while (true) {
        String syote = lukija.nextLine();
            if (syote.equals("")) continue;
            if (syote.equals("loppu")) break;
            luettu.add(Integer.valueOf(syote));
        }

        String kumpi = "";
        while (!((kumpi.equals("p")) || kumpi.equals("n"))) {
            System.out.println("Tulostetaanko negatiivisten vai positiivisten"
                + "lukujen keskiarvo? (n/p)");
            kumpi = lukija.nextLine();
        }
        
        if (kumpi.equals("n")) {
            double keskiarvo = luettu.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku <= 0)
                .average()
                .getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + keskiarvo);
        }
        
        if (kumpi.equals("p")) {
            double keskiarvo = luettu.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0)
                .average()
                .getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + keskiarvo);
        }
    }
}
