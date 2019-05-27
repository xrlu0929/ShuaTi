import java.util.ArrayList;

public class swapVowels {
    public static String reverseVowels(String word) {
        // swap
        char[] arr = word.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if(!isVowel(arr[i])){
                i++;
                continue;
            }
            if(!isVowel(arr[j])){
                j--;
                continue;
            }
//             if (isVowel(arr[i]) && isVowel(arr[j])){
//                 System.out.println("swap");
//                 // Ahha!
//                 // This does not work because
//                 // i and j may not in the same deducted index when isVowel
//                 swap(arr, i, j);
//             } else {
//                 System.out.println("keep moving");
//                 i++;
//                 j--;
//                 continue;
//             }
//
            swap(arr, i, j);
            i++;
            j--;


//            continue;
        }
        // return word;
        return new String(arr);

    }

    private static void swap(char[] s, int left, int right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    private static boolean isVowel(char c){
//        ArrayList<Character> vowList = new ArrayList<Character>();
//        vowList.add('a');
//        vowList.add('e');
//        vowList.add('i');
//        vowList.add('o');
//        vowList.add('u');
//        vowList.add('A');
//        vowList.add('E');
//        vowList.add('I');
//        vowList.add('O');
//        vowList.add('U');
//        if (vowList.contains(c)){return true;}
//        return false;
        
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        int i = 0;
        while(i < 10){
            if(c == vowels[i]) {
                return true;
            }
            i++;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("word palace"));
        System.out.println("Expect: werd palaco");
    }


}
