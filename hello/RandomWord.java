/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int index = 0;
        while (!StdIn.isEmpty()) {
            String readString = StdIn.readString();
            boolean probability = StdRandom.bernoulli(1 / (index + 1.0));
            if (probability)
                champion = readString;
            index++;
        }
        StdOut.println(champion);

    }
}
