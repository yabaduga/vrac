package com.yabaduga.déstests;

public class main {

    public static void main (String[] args) {

De d1 = new De();
d1.rouler();
De d2 = new De();
d2.rouler();
System.out.println(d1 + " " +d2);
int total;
total = d2.getValeur() +d1.getValeur();
System.out.println("le total des dés est "+total);
    }
}
