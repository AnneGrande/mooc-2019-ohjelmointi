
import java.util.ArrayList;
import java.util.Scanner;

public class ListanViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
          int nimia = 0;      
        ArrayList<String> lista = new ArrayList<>();
       
        while (true) {
        
            
            String luettu = lukija.nextLine();
            
            if (luettu.equals("")) {
             
                break;
           
            }
            
            lista.add(luettu); 
            
            nimia = nimia +1;
        }
       
        System.out.println(lista.get (nimia -1));
    }
}
