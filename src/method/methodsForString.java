package method;

import java.util.Scanner;

public class methodsForString {
    public static boolean palindrome(String st) {
        // st = st.trim();
        boolean result = true;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == st.charAt(st.length() - i - 1)) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static String enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ввдіть дані");
        String line = sc.nextLine();
        return line;
    }

}
