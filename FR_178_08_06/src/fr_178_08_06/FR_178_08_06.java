/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_178_08_06;

/**
 *
 * @author fabien
 */
public class FR_178_08_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length>0) {
          
            for( int i =0 ; i<args.length; i++) {
                
                if(i == 2) {
                    try {
                        int age  = Integer.parseInt(args[i]);
                         System.out.println("âge : "+age);
                    }
                    catch(Exception e) {
                            System.out.println("L'âge n'est pas fourni");
                    }
                }
                else
                    System.out.println(args[i]);
            }
        }
        else {
            
            System.out.println("Aucun argument");
        }
    }
    
}
