
import java.util.ArrayList;

public class IoobVirheOhjelma {

    public static void main(String[] args) {
        // Muokkaa ohjelmaa siten, että ohjelmassa tapahtuu 
        // IndexOutOfBoundsException -virhe

        ArrayList<String> lista = new ArrayList<>();
        
        lista.get(13);
    }
}