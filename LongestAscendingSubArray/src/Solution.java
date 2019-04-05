public class Solution {
    public int longest(int[] array) {
        // Write your solution here
        // corner case
        if (array.length == 0 || array.length == 1){
            return array.length;
        }
        // use 1 here to be consistance with dp[0] = 1;
        int global_max = 1;
        int[] dp = new int[array.length];
        dp[0] = 1;
        for(int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]){
                dp[i] = dp[i-1] + 1;
                if (dp[i] > global_max){
                    global_max = dp[i];
                }

//                System.out.println("global_max" + global_max);
            } else {
                dp[i] = 1;
            }
        }

//        for(int i: dp){
//            System.out.println(i);
//        }


        return global_max;
    }

    public static void main(String[] args) {
        Solution i = new Solution();
        int[] arr0 = new int[]{1,2,2,3,3,4,5,6,6,7};
        System.out.println("expected: " + 4);
        System.out.println("result: " + i.longest(arr0));

        int[] arr1 = new int[]{1,1,1,1};
        System.out.println("expected: " + 1);
        System.out.println("result: " + i.longest(arr1));
    }
}
