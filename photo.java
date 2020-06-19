import java.util.Scanner;

public class photo {
    public static void main(String[] args) {
        String input_str;
        Scanner in = new Scanner(System.in);
        input_str = in.nextLine(); // get input
        // check the last term is -1
        if (!input_str.substring(input_str.length() - 2).equals("-1")) {
            System.exit(0); // exit program, if input is not in correct format
        }
        String[] strings = input_str.split(" "); // split the words by spaces
        int n = strings.length - 1; // cut the length by -1

        permute(strings, 0, n - 1); // call permute function
    }

    /**
     * permutation function
     *
     * @param strings string array to calculate permutation for
     * @param l       starting index
     * @param r       end index
     */
    public static void permute(String[] strings, int l, int r) {
        if (l == r) { // print if permutation complete
            for (int i = 0; i < strings.length - 1; i++) {
                System.out.print(strings[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = l; i <= r; i++) {
                swap(strings, l, i);
                permute(strings, l + 1, r);
                swap(strings, l, i);
            }
        }
    }

    /**
     * Swap values at position
     *
     * @param a string array
     * @param i position 1
     * @param j position 2
     */
    public static void swap(String[] a, int i, int j) {
        String temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

}
