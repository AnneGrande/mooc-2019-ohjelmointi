
public class LukujenKeskiarvo {

    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        int summa = luku1 + luku2 + luku3 + luku4;

        return summa;
    
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
    int summa = luku1 + luku2 + luku3 + luku4;
    double keskiarvo = summa/ (double) 4;
    
    return keskiarvo;
}

public static void main(String[] args) {
    double vastaus = keskiarvo(4, 3, 6, 1);
    System.out.println("Keskiarvo: " +vastaus);
}
}
