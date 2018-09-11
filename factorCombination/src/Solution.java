import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinations(int target) {
        // Write your solution here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();

        factor(1, 2, target, list, result);
        return result;
    }

    private void factor(int product, int start, int n, List<Integer>list, List<List<Integer>>result) {

        if(start > n || product > n) {
            return;
        }

        if (product == n) {
            // hard point 1
            ArrayList<Integer> t = new ArrayList<Integer>(list);
            // if don't copy, add would be empty

            result.add(t);
            return;
        }

        for(int i = start; i < n; i++) {
            // don't have to be prime number
            if(i * product > n) {
                break;
            }
            if (n % i == 0) {
                // if 整除
                list.add(i);
                factor(i* product, i, n, list, result);

                // hard point 2
                // remove repetitive elements
                list.remove(list.size() - 1);
            }
        }
    }
}
