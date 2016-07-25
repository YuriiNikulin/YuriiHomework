package homework1;

import java.util.Random;

/**
 * Created by yurii on 21.07.2016.
 */
public class task8 {
    public static void main(String[] args) {
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            mas1[i] = rand.nextInt(10);
            mas2[i] = rand.nextInt(30);
        }

        System.out.println("\nmas1");
        for (int i = 0; i < 10; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println("\nmas2");
        for (int i = 0; i < 10; i++) {
            System.out.print(mas2[i] + " ");
        }
        System.out.println("\nmas1 + mas2");
        for (int i = 0; i < 10; i++) {
            System.out.print(mas1[i] + mas2[i] + " ");
        }
    }
}
