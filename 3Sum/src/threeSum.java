import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] input1 = {1, 1, 4, 5, 2, 3, 0};
        int target1 = 4;

        List<List<Integer>> result = threeSum(input1, target1);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }

    public static List<List<Integer>>  threeSum (int[] input, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if (input == null || input.length == 0) {
            return result;
        }

        Arrays.sort(input);

        for (int i = 0; i < input.length - 2; i++){
            // -2 because the other two could be there
            if(i == 0 || input[i] > input[i - 1]){
                int j = i + 1;
                int k = input.length - 1;

                while (j < k) {
                    if (input[i] + input[j] + input[k] == target){
                        List<Integer> l = new ArrayList<>();
                        l.add(input[i]);
                        l.add(input[j]);
                        l.add(input[k]);
                        result.add(l);

                        j++;
                        k--;

                        //handle duplicate here
                        // can be duplicated in this way because it's sorted
                        // 这个 j 是重复的，不要担心j 和 i 位置上的数字是否重复
                        while(j<k && input[j] == input[j-1])
                            j++;
                        while(j<k && input[k]== input[k+1])
                            k--;

                    } else if( input[i] + input[j] + input[k]< target ){
                        j++;
                    } else{
                        k--;
                    }
                }

            }

        }

        return result;
    }
}
