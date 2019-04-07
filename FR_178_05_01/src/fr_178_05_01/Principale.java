package fr_178_05_01;
public class Principale {
    public static void main (String [] args) {
        int valeurInt=5;
        System.out.println("la valeur est "+valeurInt);
        System.out.println("valeur max et min " +Integer.MAX_VALUE+ " "+Integer.MIN_VALUE);
        long valeurLong = valeurInt;
        int zero=0;
       // int resultat = valeurInt/zero;

        double valeurDouble=5.6;
        double resultatDouble=valeurDouble/zero;
System.out.println("valDouble "+resultatDouble);
char cc='a';
System.out.println("char :"+cc+"et aussi " + Character.reverseBytes(cc));

boolean monBooleen=true;
System.out.println(monBooleen);
    }
}
