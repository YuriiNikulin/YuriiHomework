package homework1;

/**
 * Created by yurii on 21.07.2016.
 */
public class task2 {
    public static void main(String[] args) {
        int[] mas = {2, 4, 1, -9, 0, 4, 56, 21, 76, 3};

        int min = mas[0];
        int max = mas[0];
        int nom_min = 0;
        int nom_max = 0;

        for (int i = 0; i < 10; i++) {
            if (min > mas[i]) {
                min = mas[i];
                nom_min = i;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (max < mas[i]) {
                max = mas[i];
                nom_max = i;
            }
        }

        for (int i = 0; i < 10; i++) {
        System.out.print(mas[i] + " ");
        }

        mas[nom_min] = max;
        mas[nom_max] = min;

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}


