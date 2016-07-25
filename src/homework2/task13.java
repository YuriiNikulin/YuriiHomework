package homework2;

import java.util.Scanner;
import method.methodRorTask13;
import method.matrixMethod;

/**
 * Created by yurii on 24.07.2016.
 */
public class task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("rozmir polya");
        int rozmir = sc.nextInt();
        boolean win = false;
        int[][] pole = methodRorTask13.pole(rozmir);

        //matrixMethod.printMatrix(pole);

        while (win == false) {

            System.out.print("koordenata X (1 - " + rozmir + ") ");
            int X = sc.nextInt() - 1;
            System.out.print("koordenata Y (1 - " + rozmir + ") ");
            int Y = sc.nextInt() - 1;

            if (pole[Y][X] != 1) {
                methodRorTask13.help(pole, X, Y);
            } else {
                win = true;
                System.out.println("YOU WIN");
            }

        }
    }
}
