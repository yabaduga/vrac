public class FR_178_08_02 {
    public static void main(String[] args) {
        int[] tab = {3, 8, 5, 6, 7, 3, 9, 4};
        int indice_while = 0;
        while (indice_while < tab.length) {
            System.out.println(tab[indice_while]);
            indice_while++;
        }
        indice_while = 0;
        do {
            System.out.println(tab[indice_while]);
            indice_while++;
        } while (indice_while < (tab.length));

        for (int v : tab) {
            System.out.println(v);
        }
        int[][] tab2D = {{3, 4, 5, 6}, {5, 6, 4}};
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                System.out.println(tab2D[i][j]);
            }
        }
    }
}