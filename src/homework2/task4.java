package homework2;

import method.matrixMethod;

/**
 * Created by yurii on 22.07.2016.
 */
public class task4 {
    public static void main(String[] args) {

        int[] l_w = matrixMethod.matrix_L_W();
        int[][] matr = matrixMethod.generateMatrix(l_w[0], l_w[1]);
        matrixMethod.printMatrix(matr);

        int[][] newMatr = new int[1][l_w[1]];
        int f = 0;

        for (int i = 0; i < l_w[0]; i++) {
            for (int j = 0; j < l_w[1]; j++) {
                if (i == j) {
                    newMatr[0][f] = matr[i][j];
                    f ++;
                }
            }
        }
        System.out.println();
        matrixMethod.printMatrix(newMatr);
    }
}
