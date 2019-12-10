/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anneisola
 * @param arvo
 */
import java.util.ArrayList;

public class Putki<T> {

    private ArrayList<T> arvot;

    public Putki() {
        this.arvot = new ArrayList<>();
    }

    public void lisaaPutkeen(T arvo) {
        this.arvot.add(arvo);
    }

    public boolean onkoPutkessa() {
        return !this.arvot.isEmpty();
    }

    public T otaPutkesta() {
        if (this.arvot.isEmpty()) {
            return null;
        }

        T putkessaOllut = this.arvot.get(0);
        this.arvot.remove(0);

        return putkessaOllut;
    }
}