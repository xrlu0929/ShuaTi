import java.util.ArrayList;

public class maxString {
    public static void main(String[] args) {
        System.out.println("start");
        String a = "abccbaabccba";
        System.out.println("Expected 2");
        System.out.println( maxSubstring(a));

        String b = "abcabcabcabc";
        System.out.println("Expected 4");
        System.out.println(maxSubstring(b));
    }

    public static int maxSubstring(String input) {
        int length = input.length();
        char[] inputArray = input.toCharArray();
        System.out.println(length);


        for(int i = length; i > 0; i-- ) {
            // potentional sublength
            int subLength;

            ArrayList<Character> temp = new ArrayList<>();

            if (length % i == 0) {
                System.out.println(i);
                subLength = length / i;
                System.out.println(subLength);

                for (int j = 0; j < subLength; j++) {
                    temp.add(inputArray[j]);
                }

                System.out.println(temp);
                // go and see next character -> compare with this first one

                // go and see the next string of the same length -> compare
            }



        }

        return input.length();
    }
}
