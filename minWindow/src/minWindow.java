

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Given a string S and a string T,
 * find the minimum window in S which will contain all the characters in T
 *
 * Input: S = “ADOBECODEBANC”
 *
 *           T = “ABC”
 *
 * Output: “BANC”
 */

public class minWindow {
    public static void main(String[] args) {
//        System.out.println(minWindow("ADOBECODEBANC","ABC") );

//        System.out.println(minWindow("ADOBECODEBANC","OA") );
        System.out.println(minWindow("ABCFDEB","BD") );
    }

    public static String minWindow(String source, String target)  {
        String result = "";
        // map for target
        HashMap<Character, Integer> t = new HashMap<>();

        if(source == null || source.length() == 0) {
            return result;
        }

        if(target.length() > source.length()){
            return result;
        }

        for (int n = 0; n < target.length(); n++) {
            char c = target.charAt(n);
            if (t.containsKey(c)) {
                t.put(c, t.get(c) + 1);
            } else {
                t.put(c , 1);
            }
        }
        //System.out.println(t);

        // map cannot have duplicated key
        // map for source
        HashMap<Character, Integer> map = new HashMap<>();
        int left  = 0;
        int minLen = source.length();

        // the total of mapped characters
        int count = 0;

        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);

            if ( t.containsKey(c) ) {

                if (map.containsKey(c)) {
                    System.out.println(c);
                    if(map.get(c) < t.get(c)) {
                        count++; //首次or进入后不会超过t count
                    }
                    map.put(c, map.get(c)+1);

                } else {
                   map.put(c, 1);
                   count++;
                }
            }
             System.out.println(map);
            // if all target items have been covered in source string
            // by pass the leftover without target items
            System.out.println(count);
            if (count == target.length()) {
                System.out.println("enter if");
                char sc = source.charAt(left);
                while (!map.containsKey(sc) || map.get(sc) > t.get(sc)) {
                    if (map.containsKey(sc) && map.get(sc) > t.get(sc)) {
                        map.put(sc, map.get(sc) - 1); //吐掉 扣除重复的
                    }
                    left++; // 如果map里没有 跳过
                    sc = source.charAt(left);
                }

                if (i - left + 1 < minLen) {
                    result = source.substring(left, i + 1);
                    minLen = i - left + 1;
                }
            }

            System.out.print("after if ");
            System.out.print(count);
            System.out.println();

        }

        System.out.println(map);

        return result;
    }
}
