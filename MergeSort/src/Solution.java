public class Solution {
    public static int[] mergeSort(int[] array) {
        // Write your solution here
        // corner case - 垫话
        if (array == null || array.length == 0 || array.length == 1) {
            return array;
        }
        // 入正活
        // helper to take temp int[]
        int[] helper = new int[array.length];

        mergeSort(array, helper, 0, array.length - 1);

        return array;


    }


    private static void mergeSort(int[] array, int[] helper, int left, int right){
        if (left >= right) return;

        int mid = left + (right - left)/2;

        // divide into
        mergeSort(array, helper, 0, mid);
        mergeSort(array, helper, mid+1, right);

        merge(array, helper, left, mid, right);

    }

    private static void merge(int[] array, int[] helper, int left, int mid, int right){
        // helper array
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        int leftIndex = left;
        int rightIndex = mid + 1;

        while(leftIndex <= mid && rightIndex <= right){
            if (helper[leftIndex] < helper[rightIndex]) {
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightIndex++];
            }
        }

        while(leftIndex <= mid){
            array[left++] = helper[leftIndex++];
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,9,0,1,3,8,4,9,3,-1};
        print(mergeSort(arr));
    }

    private static void print(int[] arr){
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}