package sovellus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anneisola
 */
public class Vakiosensori implements Sensori {
     private int mittariluku;
    
    public Vakiosensori(int luku) {
        this.mittariluku = luku;
    }

    @Override
    public boolean onPaalla(){
        return true;
    }
    
    @Override
    public void paalle() {
    }
    
    @Override
    public void poisPaalta() {
    }
    
    @Override
    public int mittaa() {
        return this.mittariluku;
    }
}