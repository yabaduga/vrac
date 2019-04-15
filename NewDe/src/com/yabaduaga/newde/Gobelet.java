package com.yabaduaga.newde;

public class Gobelet {
    public static void lancer() {
        for (int i=1;i<10000;i++) {
        De d1 = new De();
        De d2 = new De();
        d1.rouler();
        d2.rouler();
        System.out.println(" d1 = " + d1.getValeurFace() + " d2 = " + d2.getValeurFace());
        int tirage1 = d1.getValeurFace();
        int tirage2 = d2.getValeurFace();


            if (tirage1 == 6 && tirage2 == 6) {
                System.out.println(" Giga Chattar, un double 6 en "+i+" tirages");
                break;
            }
        }

        }
    }

