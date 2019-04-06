public class Principale {
    public static void main(String[] args){
        int i=5;
        i=i+5;
        System.out.println("I vaut" +i);
        i=i+5;
        System.out.println("I vaut" +i);
        int j =i++;
        System.out.println("I vaut" +i+" et J vaut "+j);
        ++i;
        int k=++i;
        System.out.println("I vaut" +i+" et k vaut "+k);
        int m =k%5;
        System.out.println("modulo "+k+" divisé par 5 vaut " +m);
        byte b1=127;
        byte b2=127;
        byte b3=(byte)(b1=b2);
        System.out.println("b3 vaut " +b3);
    }
}
