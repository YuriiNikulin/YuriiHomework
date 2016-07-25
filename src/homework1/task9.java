package homework1;

import java.util.Random;

/**
 * Created by yurii on 21.07.2016.
 */
public class task9 {
    public static void main(String[] args) {
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            mas1[i] = 25 + rand.nextInt(50);
            mas2[i] = 25 + rand.nextInt(50);
        }

        System.out.println("\nmas1");
        for (int i = 0; i < 10; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println("\nmas2");
        for (int i = 0; i < 10; i++) {
            System.out.print(mas2[i] + " ");
        }

        int parni_mas1=0;
        int parni_mas2=0;

        for (int i=0;i<10;i++){
            if (mas1[i]%2==0){parni_mas1+=1;}
            if (mas2[i]%2==0){parni_mas2+=1;}
        }

        if (parni_mas1>parni_mas2){
            System.out.println("\n\nв першом більше");
        }
        if (parni_mas1<parni_mas2){
            System.out.println("\n\nв другому більше");
        }
        if (parni_mas1==parni_mas2){
            System.out.println("\n\nпорівну");
        }
    }
}
