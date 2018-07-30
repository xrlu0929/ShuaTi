/**
 * Given a non-empty string s,
 * you may delete at most one character.
 * Judge whether you can make it a palindrome.
 *
 * The string will only contain lowercase characters a-z.
 * The maximum length of the string is 50000.
 */
public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("9099"));
        System.out.println(palindrome("90988"));
    }

    public static boolean palindrome (String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                int j = input.length() - 1 - i;
                return (palindromeRange(input, i+1, j) ||
                        palindromeRange(input, i, j-1));
            }
        }
        return true;
    }

    public static boolean palindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }
}
