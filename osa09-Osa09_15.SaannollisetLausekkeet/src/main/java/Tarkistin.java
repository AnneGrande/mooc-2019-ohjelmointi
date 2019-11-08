
public class Tarkistin {
    
    
    public boolean onViikonpaiva(String viikonpaiva) {
        return viikonpaiva.matches("ma|ti|ke|to|pe|la|su");
        
    }
    
    public boolean kaikkiVokaaleja(String vokaali) {
        return vokaali.matches("(a|e|i|o|u|y|å|ä|ö)*");
    }
    
    public boolean kellonaika(String aika) {
        return aika.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}