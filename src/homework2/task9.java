package homework2;

import method.matrixMethod;

/**
 * Created by yurii on 23.07.2016.
 */
public class task9 {
    public static void main(String[] args) {

        System.out.println("first matrix");
        int[] l_w = matrixMethod.matrix_L_W();
        int[][] matrix1 = matrixMethod.generateMatrix(l_w[0], l_w[1]);
        matrixMethod.printMatrix(matrix1);
        System.out.println();

        System.out.println("second matrix");
        int[] l_w_1 = matrixMethod.matrix_L_W();
        int[][] matrix2 = matrixMethod.generateMatrix(l_w_1[0], l_w_1[1]);
        matrixMethod.printMatrix(matrix2);
        System.out.println();

        if (l_w[1]!=l_w_1[0]){
            System.out.println("data not true");
        }

        int[][] result = new int[l_w[0]][l_w_1[1]];

        for (int i = 0; i < l_w[0]; i++) {
            for (int j = 0; j < l_w_1[1]; j++) {
                result[i][j] = 0;
                for (int s = 0; s < l_w[1]; s++) {
                    result[i][j] += matrix1[i][s] * matrix2[s][i];
                }
            }
        }

        matrixMethod.printMatrix(result);
    }
}
