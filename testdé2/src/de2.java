public class de2 {
    private int valeurFace;
public void rouler() {
    int min=1,max=6,range = max-min;

    valeurFace=(int)(Math.random()*range+min);

    return;
}
    public int getValeurFace() {
        return valeurFace;
    }

    public void setValeurFace(int f) {
        this.valeurFace = f;
    }
}
