package com.yabaduaga.newde;

public class De {
    int valeurFace;

    public int rouler() {
        //int min=1, max=6, range=max+min;
        valeurFace=(int)(Math.random()*6+1);
        return valeurFace;
    }

    public int getValeurFace() {
        return valeurFace;
    }

    public void setValeurFace(int f) {
        this.valeurFace = f;
    }
}
