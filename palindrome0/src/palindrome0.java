import java.util.ArrayList;

/**
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters('0'-'9','a'-'z','A'-'Z')
 * and ignoring cases.
 *
 * For example,
 * "an apple, :) elp pana#" is a palindrome.
 *
 * "dia monds dn dia" is not a palindrome.
 */

public class palindrome0 {
    public static void main(String[] args) {
        System.out.println(valid("123321"));
        System.out.println(valid("124321"));
    }
    public static boolean valid(String input) {
        // Write your solution here
        // 类似于左右挡板
        char[] inputArray = input.toLowerCase().toCharArray();

//        for (char e: inputArray) {
//            System.out.print(e);
//            System.out.println();
//        }


        int length = 0;
        if (inputArray == null || inputArray.length == 0) {
            return true;
        }

        boolean result = true;
        length = inputArray.length;
        ArrayList<Character> master = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            master.add((char) (i + '0') );

        }

        for (int i = 0; i < 26; i++) {
            master.add((char) (i + 'a'));
        }
//        System.out.println(master);


        int j = 0;
        int k  = length -1;

        while (j <= k) {
            if ( master.contains(inputArray[j]) ) {
                //compare with k
                if (master.contains(inputArray[k])) {
                    if (inputArray[j] == inputArray[k]) {

                        j++;
                        k--;
                    } else {
//                        System.out.println(inputArray[j]);
//                        System.out.println(inputArray[k]);
                        return false;
                    }
                } else {
                    k--;
                }

            } else {
                j++;
            }
        }
        return result;

    }
}
