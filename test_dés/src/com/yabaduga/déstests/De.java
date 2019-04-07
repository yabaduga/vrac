package com.yabaduga.déstests;
public class De {
    private int valeurFace;

    public int rouler() {
        int min = 1, max = 6, range = max - min + 1;
        valeurFace = (int) (Math.random() * range + min);

        System.out.println("la valeur de la face est " + valeurFace);
        return min;
    }

    public int getValeur() {
        return valeurFace;
    }

    public void setValeurFace(int f) {
        this.valeurFace = f;
    }
}
