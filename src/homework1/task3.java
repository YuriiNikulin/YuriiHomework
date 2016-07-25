package homework1;

/**
 * Created by yurii on 21.07.2016.
 */
public class task3 {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] mas2 = {9, 8, 7, 6, 5, 4, 3, 29, 1};

        System.out.println("mas1");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println("\nmas2");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas2[i] + " ");
        }

        for (int i = 0; i < 9; i++) {
            mas2[i] = mas1[i];
        }

        System.out.println("\nmas1");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println("\nmas2");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas2[i] + " ");
        }
    }
}
