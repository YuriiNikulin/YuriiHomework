package homework2;

import method.methodsForString;

/**
 * Created by yurii on 23.07.2016.
 */
public class task10 {
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
            for (int j = 0 + i; j < f; j++) {
                if (slova[i]!=null) {
                    if (i != j && slova[i].equals(slova[j])) {
                        slova[i] = null;
                        slova[j] = null;

                    }
                }
            }
        }
        int n = 0;
        for (int i = 0; i < f; i++) {
            if (slova[i] != null) {
                slova[n] = slova[i];
                n++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(slova[i] + " ");
        }
    }
}
