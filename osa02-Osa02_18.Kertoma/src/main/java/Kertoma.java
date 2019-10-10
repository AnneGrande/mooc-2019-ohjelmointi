
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        int kertoma = 1;
        
        System.out.println("Mihin asti? ");
        int n = lukija.nextInt();

    while(n != 0){
    kertoma = kertoma * n;
    n = n - 1;
}

System.out.println(kertoma);
    }
}
