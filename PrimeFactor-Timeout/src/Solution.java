import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> factors(int target) {
        // Write your solution here
        List<Integer> result = new ArrayList<>();

        List<Integer> primeList = primeList(target);
        int i = 0;
        while (i < primeList.size()) {
            int temp = primeList.get(i);
            if (target % temp == 0) {
                result.add(temp);
                target = target / temp;
            }  else {
                i++;
            }
        }
        return result;
    }

    private List<Integer> primeList (int input) {
        List<Integer> result = new ArrayList<>();
        result.add(2);

        for (int i = 2; i <= input; i++) {
            for (int j = 2; j <= input/2; j++) {
                if (i % j == 0) { break;}
                if( !result.contains(i) ) {
                    result.add(i);
                }
            }
        }
        return result;

    }
}