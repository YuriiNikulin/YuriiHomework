package method;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yurii on 24.07.2016.
 */
public class methodForTask12 {

    public static String enterPasword() {
        Scanner sc = new Scanner(System.in);

        String pas = sc.nextLine();

        return pas;
    }

    public static boolean passwordVerification(String pas) {
        boolean verification = true;

        if (pas.length() < 8 && pas.length() > 20
                && (pas.equals("password") ||
                pas.equals("pass") || pas.equals("gfhjkm"))) {
            verification = false;
            return verification;
        }

        if (pas.toLowerCase() == pas) {
            verification = false;
            return verification;
        }

        char[] charPass = pas.toCharArray();

        for (int i = 0; i < charPass.length; i++) {
            if (charPass[i] == '0' || charPass[i] == '1' ||
                    charPass[i] == '2' || charPass[i] == '3' ||
                    charPass[i] == '4' || charPass[i] == '5' ||
                    charPass[i] == '6' || charPass[i] == '7' ||
                    charPass[i] == '8' || charPass[i] == '9') {
                verification = true;
                return verification;
            } else {
                verification = false;
            }
        }

        return verification;
    }

    public static void passwordGeneration() {

        Random rand = new Random();
        char[] pass = new char[8 + rand.nextInt(12)];
        boolean a0 = false;
        boolean a1 = false;
        boolean a2 = false;

        for (int i = 0; i < pass.length; i++) {
            int var = rand.nextInt(3);

            switch (var) {
                case 0:
                    pass[i] = (char) (97 + rand.nextInt(26));
                    a0 = true;
                    break;
                case 1:
                    pass[i] = (char) (65 + rand.nextInt(26));
                    a1 = true;
                    break;
                case 2:
                    pass[i] = (char) (48 + rand.nextInt(10));
                    a2 = true;
                    break;
            }
        }

        if (a0 == false || a1 == false || a2 == false) {
            passwordGeneration();
        } else {

            for (int i = 0; i < pass.length; i++) {
                System.out.print(pass[i]);
            }
        }
    }
}
