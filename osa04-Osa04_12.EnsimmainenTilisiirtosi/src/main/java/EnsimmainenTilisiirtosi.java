
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili MatinTili = new Tili("Matin tili", 1000.00);
        Tili omaTili = new Tili("Oma tili", 0.00);

        MatinTili.otto(100);
        omaTili.pano(100);
        System.out.println(MatinTili.saldo());
        System.out.println(omaTili.saldo());   
        }
        }
