package homework2;

import method.methodsForString;
/**
 * Created by yurii on 22.07.2016.
 */
public class task7 {
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

        int maxSlovo = 0;
        for (int i = 0; i < f; i++) {
            if (slova[maxSlovo].length() < slova[i].length()) {
                maxSlovo = i;
            }
        }
        System.out.println();
        System.out.println(slova[maxSlovo]);
    }
}
