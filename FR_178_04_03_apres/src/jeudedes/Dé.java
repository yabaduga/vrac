/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeudedes;

/**
 * @author fabien
 */
public class Dé {

    private int valeurDe;

    public Dé() {
        valeurDe = 4;
        int valeurDe = 1 + (int)(Math.random() * ((7 - 1) + 1));
    }

    public int rouler() {
        //fournir une valeur aléatoire
        return valeurDe;
    }
}
