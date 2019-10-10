
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner tiedostonLukija = new Scanner(new File("data.txt"))) {

    // luetaan tiedostoja kunnes kaikki rivit on luettu
    while (tiedostonLukija.hasNextLine()) {
        // luetaan yksi rivi
        String rivi = tiedostonLukija.nextLine();
        // tulostetaan luettu rivi
        System.out.println(rivi);
    }
} 
    }
}



    