package jeudedes;
public class De {
private int valeurFace;
public int rouler() {
    int j=0, min=1, max =6, range =max-min+1;
   valeurFace=(int)(Math.random()*range+min);
    //valeurFace=(int)(Math.random()*6+1);
    if (valeurFace>5) {

        System.out.println("la valeur nominale " + valeurFace);

    }
    //valeurFace=4;
    return valeurFace;
}


    public int getValeur() {
        return valeurFace;
    }

    public void setValeur(int f) {
        this.valeurFace = f;
    }
}
