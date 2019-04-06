package jeudedes;

import jeudedes.De;

public class Gobelet {
        private De d1 = new De();
        private De d2 = new De();

        public int getValeur(){
                return d1.getValeur()+d2.getValeur();
        }
        public void setValeur(int f){
                d1.setValeur(f);
                d2.setValeur(f);
        }
}
