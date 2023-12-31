/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length < 2)
            return;
        String name1 = args[0];
        String name2 = args[1];
        System.out.println("Hello " + name1 + " " + name2 + ".");
        System.out.println("Goodbye " + name2 + " " + name1 + ".");
    }
}
