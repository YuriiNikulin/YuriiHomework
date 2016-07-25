package method;

import java.util.Random;

/**
 * Created by yurii on 24.07.2016.
 */
public class methodRorTask13 {

    public static int[][] pole(int rozmir) {

        int[][] pole = new int[rozmir][rozmir];
        Random r = new Random();

        for (int i = 0; i < rozmir; i++) {
            for (int j = 0; j < rozmir; j++) {
                pole[i][j] = 0;
            }
        }

        pole[r.nextInt(rozmir)][r.nextInt(rozmir)] = 1;

        return pole;
    }

    public static void help(int[][] pole, int a, int b) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                if (pole[i][j] == 1) {
                    x = j;
                    y = i;
                }
            }
        }

        if (a < x) {
            System.out.println("x >");
        } else if (a > x) {
            System.out.println("x <");
        } else if (a == x) {
            System.out.println("x =");
        }

        if (b < y) {
            System.out.println("y >");
        } else if (b > y) {
            System.out.println("y <");
        } else if (b == y) {
            System.out.println("y =");
        }
    }
}
