import java.util.*;
public class ValidBraces {
    public static void main(String[] args) {
        System.out.println(isValid("{}[]"));

        System.out.println(isValid("{[}]"));
        System.out.println(isValid("[{}]"));

        //the one not working if I use peek();
        System.out.println(isValid("{[{]}}"));
    }

    public static boolean isValid(String s) {
        char arr[] = s.toCharArray();
        // don't use real Set, because Set
        Stack<Character> set = new Stack();
        for (Character ch : arr) {
            if (ch == '{' || ch == '[' || ch == '(') {
                set.push(ch);
            } else if (ch == ']') {
                if (set.isEmpty() || set.search('[') == -1) {
//                    System.out.println(set.peek());
                    return false;
                }
                set.pop();
            } else if (ch == ')') {
                if (set.isEmpty() ||  set.search('(') == -1) {
                    //System.out.println(set.peek());
                    return false;
                }
                set.pop();
            } else if (ch == '}') {
                if (set.isEmpty() ||  set.search('{') == -1) {
                    //System.out.println(set.peek());
                    return false;
                }
                set.pop();
            }
        }
        return set.size() == 0;
    }

}
