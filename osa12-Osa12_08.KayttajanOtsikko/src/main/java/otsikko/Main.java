package otsikko;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Millaisen otsikon haluaisit?");
        String ikkunanNimi = new Scanner(System.in).nextLine();
        Application.launch(KayttajanOtsikko.class, "--otsikko=" + ikkunanNimi);
    }
}