public class Gobelet {
    de2 d1 = new de2();
    de2 d2 = new de2();
    int total;

    public void lancer() {
        d1.rouler();
        d2.rouler();
        if ((d1.getValeurFace() < 1 && d2.getValeurFace() < 1) || (d1.getValeurFace() > 6 && d2.getValeurFace() > 6))
            System.out.println("il y a une erreur dans le tirage, les dés ne sont pas dans le range");
        else
            total = d1.getValeurFace() + d2.getValeurFace();
            System.out.println("d1 " + d1.getValeurFace() + " d2 " + d2.getValeurFace());
            System.out.println("le total des dés est " + total);
        }

    public int getValeur() {
        return d1.getValeurFace() + d2.getValeurFace();
    }

    public void setValeur(int f) {
        d1.setValeurFace(f);
        d2.setValeurFace(f);
    }
}


