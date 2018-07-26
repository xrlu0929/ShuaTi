import java.util.HashMap;

public class intersectArray {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] a = {1, 1 , 3};
        int[] b = {1, 1, 2, 2, 1, 1};
        for(int e: intersectArray(a, b)) {
            System.out.println(e);
        }

    }

    public static int[] intersectArray(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> intersectMap = new HashMap<Integer, Integer>();
        Integer count = 1;
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) { // if has
                count = map1.get(Integer.valueOf(nums1[i])) + 1;
            } else {
                count = 1;
            }
            map1.put(nums1[i], count);
            System.out.println("map1");
            System.out.println(map1.entrySet());
        }


        for (int j = 0; j < nums2.length; j++) {
            if (map2.containsKey(nums2[j])) { // if has
                count = map2.get(Integer.valueOf(nums2[j])) + 1;
            } else {
                count = 1;
            }
            map2.put(nums2[j], count);
            System.out.println("map2");
            System.out.println(map2.entrySet());

        }

        /**
         * check keys and compare,
         * find the smallest size and put it into intersection part
         * return
         */

//        int result_size = 0;
//        for (Integer e : intersectMap.keySet()){
//            result_size = result_size + intersectMap.get(e)/2;
//            System.out.println("result size");
//            System.out.println(result_size);
//        }
//
//
//        int[] result = new int[result_size];
//        int i = 0;
//        for (Integer e : intersectMap.keySet()) {
//            //result[i] = e;
//            //System.out.println(intersectMap);
//            intersectMap.put(e, intersectMap.get(e) / 2);
//            for(int j = 0; j < (intersectMap.get(e) )/2; j++) {
//                //System.out.println(i);
//                result[i] = e;
//                //System.out.println(e);
//                i++;
//            }
//            //System.out.println(intersectMap);
//
//        }
//        System.out.println(intersectMap);
        int[] result = {1, 2};
        return result;
    }

    // Time: O(4n)
    // Space: O(n)
}
