public class quadratMagic {
    public static void main(String[] args) {
        QuadratMagic exemple = new QuadratMagic(5);
        exemple.print();
    }
}

class QuadratMagic {
    int [][] dades;
    QuadratMagic(int dimensions) {
        dades = new int [dimensions][dimensions];
        for (int a = 0; a < dimensions; a++) {
            dades [0][a] = 1;
            dades [a][0] = 1;
        }
        for (int i = 1; i < dimensions; i++) {
            for (int j = 1; j < dimensions; j++) {
                dades [j][i] = dades [j][i - 1] + dades [j - 1][i];
            }
        }
    }
    
    void print () {
        for (int i = 0; i < dades.length; i++) {
            for (int j = 0; j < dades[i].length; j++) {
                System.out.printf("%4d", dades[i][j]);


            }
            System.out.println();
        }
    }


}
