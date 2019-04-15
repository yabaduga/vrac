package tests;

public class TestDé {

    public void testCtor() {
        jeudedes.Dé d = new jeudedes.Dé();
        if (d != null) {
            System.out.println("Test ctor réussi");
        } else {
            System.out.println("Test ctor a échoué");
        }
    }

    public void testRouler() {
        jeudedes.Dé d = new jeudedes.Dé();
        int valeur = d.rouler();
        if (valeur > 0 && valeur < 7) {
            System.out.println("Test du rouler est ok");
        } else {
            System.out.println("Test rouler a échoué");
        }

    }
}
