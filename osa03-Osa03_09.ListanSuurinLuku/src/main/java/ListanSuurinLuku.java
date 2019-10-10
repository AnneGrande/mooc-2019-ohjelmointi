
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");
        
        int suurin = lista.get(0);
            
            int indeksi = 0;
            int numero = 0;
         
            while (indeksi < lista.size()) {
                lista.get(indeksi);
            int luku = lista.get(indeksi);
            if (suurin < luku) {
            suurin = luku;
    }
             if (lista.get(indeksi) == suurin) {
                
                 numero = indeksi;
                
    
             }
             
            indeksi = indeksi + 1;
        
}

System.out.println("Listan suurin luku: " + suurin);
}
    }
