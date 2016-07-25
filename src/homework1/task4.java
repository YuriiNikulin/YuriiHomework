package homework1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yurii on 21.07.2016.
 */
public class task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] mas = new int[rand.nextInt(10)];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt();
        }
        System.out.println("довжена масиву \n" + mas.length);
    }
}
