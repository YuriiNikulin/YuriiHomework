package homework2;

import method.matrixMethod;
/**
 * Created by yurii on 22.07.2016.
 */
public class task5 {
    public static void main(String[] args) {
        int[] l_w = matrixMethod.matrix_L_W();
        int[][] matr = matrixMethod.generateMatrix(l_w[0], l_w[1]);
        matrixMethod.printMatrix(matr);

        int[] sum = new int[l_w[0]];

        for (int i = 0; i < l_w[0]; i++) {
            for (int j = 0; j < l_w[1]; j++) {
                sum[i] += matr[i][j];
            }
        }

        int min = sum[0];
        int max = sum[0];
        int minIn = 0;
        int maxIn = 0;

        for (int i = 0; i < sum.length; i++) {
            if (sum[0] > sum[i]) {
                min = sum[i];
                minIn = i;
            }
            if (sum[0] < sum[i]) {
                max = sum[i];
                maxIn = i;
            }
        }

        System.out.println();

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                if (i == minIn) {
                    System.out.print(matr[maxIn][j] + " ");
                } else if (i == maxIn) {
                    System.out.print(matr[minIn][j] + " ");
                } else {
                    System.out.print(matr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
