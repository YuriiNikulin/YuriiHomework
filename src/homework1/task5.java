package homework1; /**
 * Created by yurii on 21.07.2016.
 */
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int[] mas = new int[10];

        Random rand = new Random();

        for (int i = 0; i <= mas.length - 1; i++) {
            if (i % 2 != 0) {
                mas[i] = 2 * rand.nextInt(100);
            } else {
                mas[i] = (2 * rand.nextInt(100)) - 1;
            }
        }

        for (int i = 0; i <= mas.length - 1; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
