package jeudedes;

public class Principale {
    public static void main (String[] args){
        Gobelet monGobelet=new Gobelet();
        monGobelet.setValeur(5);
        System.out.println("valeur du gobelet : " + monGobelet.getValeur());
    }
}
