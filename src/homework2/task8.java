package homework2;

import method.methodsForString;

/**
 * Created by yurii on 22.07.2016.
 */
public class task8 {
    public static void main(String[] args) {
        String line = methodsForString.enter() + " ";

        int f = 0;
        String[] slova = new String[line.length()];

        int indexProb = 0;
        while (line.length() != 0) {
            indexProb = line.indexOf(" ");

            slova[f] = line.substring(0, indexProb);
            line = line.substring(indexProb + 1);
            f++;
        }

        for (int i = 0; i < f; i++) {
            String firsrSymbol = slova[i].substring(0, 1).toUpperCase();
            slova[i] = firsrSymbol + slova[i].substring(1);
            System.out.print(slova[i] + " ");
        }
    }
}
