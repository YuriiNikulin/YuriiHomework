package homework1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by yurii on 21.07.2016.
 */

public class task1 {
    public static void main(String[] args) {

        int[] mas = {2,4,1,-9,0,4,56,21,76,3};

        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i < 10; i++){
            if(min >  mas[i]){min = mas[i];}
        }
        for (int i = 0; i < 10; i++){
            if(max <  mas[i]){max = mas[i];}
        }

        System.out.println("min = " + min +"\nmax = " + max);
    }
}
