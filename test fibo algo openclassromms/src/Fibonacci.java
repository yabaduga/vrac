import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Compter et afficher les N premiers nombres Fibonacci.
 */
public class Fibonacci {

  public static void main(String[] args) {

  int a=0;
  int b=1;
  int c;
  int v = 1;
  System.out.println("0");
  while (v !=20) {
  v = v+1;
  c=a+b;
  System.out.println(b);
  a=b;
  b=c;
  } 
		  
}
}