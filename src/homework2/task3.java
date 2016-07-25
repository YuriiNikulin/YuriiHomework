package homework2;

import java.util.Scanner;
import method.methodsForString;
/**
 * Created by yurii on 22.07.2016.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write)");
        String r = sc.next();

        System.out.println(methodsForString.palindrome(r));
    }
}
