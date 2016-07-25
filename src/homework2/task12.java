package homework2;

import method.methodForTask12;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter password");
        String pas = methodForTask12.enterPasword();

        if (methodForTask12.passwordVerification(pas) == true) {

            System.out.println("\nenter again");
            String pasEg = sc.nextLine();

            if (pasEg.equals(pas)) {
                System.out.println("\ntrue");
            } else {
                System.out.println("\nPasswords do not match");
            }
        } else {
            System.out.println("\nimpossible password\npossible password");
            methodForTask12.passwordGeneration();
        }
    }
}
