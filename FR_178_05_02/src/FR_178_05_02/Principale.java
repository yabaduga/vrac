package FR_178_05_02;

public class Principale {
public static int getValeur(){

    int retVal=0;
    //...
    return retVal;
}
    public static void main (String [] args) {
        int valeur;
        if (args.length>0)
            valeur =7;
        else if (args.length == 0)
            valeur =8;
        else valeur =9;
        System.out.println("la valeur est " + valeur);

    }
}
