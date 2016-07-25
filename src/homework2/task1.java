package homework2;

import java.util.Scanner;

import method.matrixMethod;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("lengs = ");
        int lengs = sc.nextInt();
        System.out.print("width = ");
        int width = sc.nextInt();
        System.out.println();

        int[][] mas = new int[lengs][width];
        mas = matrixMethod.generateMatrix(lengs,width);

        matrixMethod.printMatrix(mas);
        System.out.println("results");

        for (int i =0;i<lengs;i++){
            for (int j=0;j<width;j++){
                mas[i][j]= mas[i][j]%5==0 ?
                        8:mas[i][j];
            }
        }

        matrixMethod.printMatrix(mas);
    }
}
