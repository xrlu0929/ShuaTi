public class reverse {
    public static void main(String[] args) {
        System.out.println(reverseWords("Ethan loves Anna") );
        //System.out.println(reverseWords("Fang ") );
        System.out.println(reverseWords(" an  apple ") );
    }
    public static String reverseWords(String input) {
        // Write your solution here
        // reverse reverse

        // remove all leading/duplicate/ending spaces
        String input0 = input.trim().replaceAll("\\s+", " ");
        char[] inputArray = input0.toCharArray();

        for(int i = 0; i <  input0.length() / 2 ; i++) {
            char temp = inputArray[i] ;
            inputArray[i] = inputArray[input0.length()-1 - i];
            inputArray[input0.length() -1 - i] = temp;
        }

        int left = 0;
        for(int i = 0; i < input0.length(); i++) {
            if(inputArray[i] == ' ') {
                //System.out.println(left);
                reverse(inputArray, left, i-1);
                left = i + 1;
                //System.out.println(left);
            }
            //System.out.println(left);
            //System.out.println(new String(inputArray));

            if(i == input0.length() - 1){
//                System.out.println("最后一个character");
//                System.out.println(left);
//                System.out.println(i);
                reverse(inputArray, left, i);

//                System.out.println(new String(inputArray));
            }
        }

        String b = new String(inputArray);
        return b.trim();
    }

    private static void reverse (char[] in, int i, int j) {

        for (int k = i; k < (j + i + 1) /2; k++) {
            char temp = in[k] ;
            in[k] = in[j + i - k];
            in[j + i - k] = temp;
        }
    }
}
