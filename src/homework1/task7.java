package homework1;

import java.util.Random;

/**
 * Created by yurii on 21.07.2016.
 */
public class task7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] mas = new int[2 + rand.nextInt(20)];

        System.out.println("масив ");
        for (int i = 0; i < mas.length - 1; i++) {
            mas[i] = rand.nextInt(60);
            System.out.print(mas[i] + "; ");
        }

        int sum1 = 0;
        for (int i = 0; i <= (mas.length - 1) / 2; i++) {
            sum1 += mas[i];
        }

        int sum2 = 0;
        for (int i = (mas.length - 1) / 2; i < mas.length - 1; i++) {
            sum2 += mas[i];
        }

        System.out.println();

        if (sum1 > sum2) {
            for (int i = 0; i < (mas.length - 1) / 2; i++) {
                System.out.print(mas[i] + " ");
            }
        } else {
            for (int i = (mas.length - 1) / 2; i < mas.length - 1; i++) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}
