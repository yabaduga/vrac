package jeudedes;

public class Principale {
    public static void main(String[] args) {
        Gobelet monGobelet = new Gobelet();
        System.out.println("le nombre de dés est "+monGobelet.NB_DES);


        monGobelet.lancer();

            System.out.println("valeur du gobelet : " + monGobelet.getValeur());
        }
    }

