/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anneisola
 */
public class Sekuntikello {

    private Viisari sekuntit;
    private Viisari sadasosat;

    public Sekuntikello(){
        this.sekuntit = new Viisari(60);
        this.sadasosat = new Viisari(100);
    }

    public String toString() {
        return sekuntit + ":" + sadasosat;
    }
    public void etene() {
        this.sadasosat.etene();

        if (this.sadasosat.arvo() == 0) {
            this.sekuntit.etene();
            }
        }
}
