import java.util.ArrayList;
import java.util.Collections;

public class maxString {
    public static void main(String[] args) {
        System.out.println("start");
        String a = "abccbaabccba";
        System.out.println("Expected 2");
        System.out.println("Result: " + maxSubstring(a));

        String b = "abcabcabcabc";
        System.out.println("Expected 4");
        System.out.println("Result: " + maxSubstring(b));
    }

    public static int maxSubstring(String input) {
        int length = input.length();
        char[] inputArray = input.toCharArray();
        //System.out.println(length);
        ArrayList<Integer> resultSet = new ArrayList<>();


        for(int i = length; i > 0; i-- ) {
            // potentional sublength
            int subLength;

            ArrayList<Character> temp = new ArrayList<>();

            if (length % i == 0) {
                //System.out.println(i);
                subLength = length / i;
                //System.out.println(subLength);

                for (int j = 0; j < subLength; j++) {
                    temp.add(inputArray[j]);
                }

                // System.out.println(temp);
                // go and see next character -> compare with this first one

                // go and see the next string of the same length -> compare
//                System.out.println("----");
//                System.out.println(temp);
                //System.out.println(checkLoop(temp, inputArray));
                resultSet.add(checkLoop(temp, inputArray));

                System.out.println(resultSet);
            }

            // find the largest one in resultSet


        }

        Collections.sort(resultSet);
        Collections.reverse(resultSet);

        return resultSet.get(0);
    }

    private static int checkLoop (ArrayList<Character> temp, char[] master) {
        int loop = 1;
        boolean endloop = false;
        while (loop < master.length / temp.size()  && !endloop) {
            for (int i = 0; i < temp.size() ; i++) {
                if (!temp.get(i).equals(master[i + (temp.size() * loop)])) {
                    endloop = true;
                }
            }
            loop++;
//            System.out.println("loop = " + loop);
//            System.out.println("end of for loop");
        }

        return loop;
    }
}
