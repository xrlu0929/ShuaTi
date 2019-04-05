import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;

public class Solution {
    public int longestSequence(int[] array){
        ArrayList<Integer> sequence = new ArrayList<>();

        int global_max = 1;

        if (array.length == 0 || array.length == 1) {
            return array.length;
        }
        int[] dp = new int[array.length];
        dp[0] = 1;

        for(int i = 0; i < array.length; i++){
            dp[i] = 1;
            // retrospect!!
            for (int j = 0; j < i; j++) {
                //only when array[j] < array[i]
                // there will be necessity to update dp
                if (array[j] < array[i]) {
                    // find the possibly largest one
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            global_max = Math.max(global_max, dp[i]);

        }

        for(int i : dp){
            System.out.print(i + " ");
        }
        System.out.println();

        return global_max;
    }

    public static void main(String[] args) {
        Solution i = new Solution();
        int[] arr0 = new int[]{5, 2, 6, 3, 4, 7, 5};
        System.out.println("expected: " + 4);
        System.out.println(i.longestSequence(arr0));
    }
}
