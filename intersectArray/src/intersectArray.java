import java.util.HashMap;

public class intersectArray {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] a = {1, 1,4,5};
        int[] b = {1, 1,4,5,4,4};
        for(int e: intersectArray(a, b)) {
            System.out.println(e);
        }

        for(int e: a) {
            System.out.println(e);
        }

    }

    public static int[] intersectArray(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> intersectMap = new HashMap<Integer, Integer>();
        Integer count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (!map1.containsKey(nums1[i])) {
                count = map1.get(Integer.valueOf(nums1[i])) + 1;

                map1.put(nums1[i], count);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map1.containsKey(nums2[j]) && !intersectMap.containsKey(nums2[j])) {
                count = intersectMap.get(Integer.valueOf(nums2[j])) + 1;
                intersectMap.put(nums2[j], count);
            }
        }

        int[] result = new int[intersectMap.size()];

        int i = 0;
        for (Integer e : intersectMap.keySet()) {
            result[i] = e;
            i++;
        }

        return result;
    }
}
