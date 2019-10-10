
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int yhteensaLukuja = 0;
        int ykkosia = 0;       

        while (true) {

            int syote = Integer.valueOf(lukija.nextLine());

            if (syote == 0) {
                break;
            }
            if (syote != 0) { 
                yhteensaLukuja = yhteensaLukuja + 1;
            }
            
            if (syote ==1) {
                ykkosia = ykkosia +1;
            }   
        }
             if (yhteensaLukuja == 0) {
                 System.out.println("keskiarvon laskeminen ei ole mahdollista");
            }else
               System.out.println((double)ykkosia/yhteensaLukuja);  
            {
        }
    }
}

            
            
    