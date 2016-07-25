package method;

import java.util.Random;
import java.util.Scanner;

public class matrixMethod {

    public static int[][] generateMatrix(int lengs, int width) {
        Random rand = new Random();
        int mas[][] = new int[lengs][width];

        for (int i = 0; i < lengs; i++)
            for (int j = 0; j < width; j++) {
                mas[i][j] = rand.nextInt(100);
            }

        return mas;
    }

    public static void printMatrix(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] matrix_L_W(){
        Scanner sc = new Scanner(System.in);
        int[] m_L_W = new int[2];

        System.out.print("Lengs = ");
        m_L_W[0]=sc.nextInt();
        System.out.print("Width = ");
        m_L_W[1]=sc.nextInt();

        return m_L_W;
    }
}
