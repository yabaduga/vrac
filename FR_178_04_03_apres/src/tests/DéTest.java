package tests;

import jeudedes.Dé;

import static org.junit.jupiter.api.Assertions.*;

class DéTest {

    @org.junit.jupiter.api.Test
    public void testCtor() {
        Dé d = new Dé();

        assertNotNull(d);
    }
        public void testRouler(){
            Dé d=new Dé();
            int valeur=d.rouler();
            assertTrue(valeur>0&& valeur <7);

        }

    }
