package homework2;

import method.matrixMethod;

public class task2 {
    public static void main(String[] args) {
        int[] l_w = matrixMethod.matrix_L_W();

        String[][] matriks = new String[l_w[0]][l_w[1]];

        for (int i = 0; i < l_w[0]; i++) {
            for (int j = 0; j < l_w[1]; j++) {
                matriks[i][j] = String.valueOf(i == j ? true : false);

            }
        }
        for (int i = 0; i < l_w[0]; i++) {
            for (int j = 0; j < l_w[1]; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
