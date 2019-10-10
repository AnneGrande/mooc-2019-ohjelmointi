
public class Pienin {

    public static int pienin(int luku1, int luku2) {
           
             
   int pienin;
   if ( luku1 < luku2 )
   {
   pienin = luku1;
   return pienin;
   } else
    return luku2; 



    }


    public static void main(String[] args) {
    int vastaus =  pienin(2, 7);
    System.out.println("Pienin: " + vastaus);
    }
    }

