public class MergeTwoSorted {
    public static void main(String[] args) {
        System.out.println("iteratively");
        int[] a = {1,1,3,5};
        int[] b = {3,5,6};
        for (int i = 0; i < 7; i++) {
            System.out.print(merge(a,b)[i] + " ");
        }
        System.out.println();

        int[] c = {0, 1, 9};
        int[] d = {8};

        for (int i = 0; i < 4; i++) {
            System.out.print(merge(c,d)[i] + " ");
        }
        System.out.println();

        int[] e = {-7, 99, 100};
        int[] f = {103, 199};

        for (int i = 0; i < 5; i++) {
            System.out.print(merge(e,f)[i] + " ");
        }
        System.out.println();

        System.out.println("recursively sort an array");
        int[] one = {0, -88, 100, 88, 253, 3};
        int[] two = {2, 1, 0, -3};

        mergeSort_recur(one);
        mergeSort_recur(two);
        for (int i = 0; i< 6; i++) {
            System.out.print(one[i] + " ");
        }
        System.out.println();
        for (int i = 0; i< 4; i++) {
            System.out.print(two[i] + " ");
        }

//        sort_recur(one, 0, 5);
//        System.out.println();
//        sort_recur(two, 0, 3);3

    }

    public static int[] merge (int[] one, int[] two) {
        int size1 = one.length;
        int size2 = two.length;

        int[] result = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < size1 + size2) {

            if (j<size1 && k<size2)  {
                if(one[j] < two[k]) {
                    result[i] = one[j];
                    j++;
                } else {
                    result[i] = two[k];
                    k++;
                }
            } else if (j< size1 && k >=size2) {
                result[i] = one[j];
                j++;
            } else if (j >= size1 && k < size2) {
                result[i] = two[k];
                k++;
            }

            i++;
        }

        return result;
    }
    // Time O(m + n)
    // Space O(m + n)

    /**
     * mergeSort recursively
     * @param a
     * @return
     */

    public static int[] mergeSort_recur(int[] a) {

        if(a == null) {
            return a;
        }

        int[] helper = new int[a.length];
        mergeSort_recur(a, helper, 0, a.length - 1);
        return a;

    }

    private static void mergeSort_recur(int[] a, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort_recur(a, helper, left, mid);
        mergeSort_recur(a, helper, mid + 1, right);

        merge_recur(a, helper, left, mid, right);
    }

    private static void merge_recur(int[] in, int[] helper, int left, int mid, int right) {
        // copy in into helper
        for (int i = 0; i < in.length; i++) {
            helper[i] = in[i];
        }

        int leftIndex = left;
        int rightIndex = mid + 1;

        while(leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                in[left++] = helper[leftIndex++];
            } else {
                in[left++] = helper[rightIndex++];
            }
        }

        while(leftIndex <= mid) {
            in[left++] = helper[leftIndex++];
        }

        while(rightIndex <= right) {
            in[left++] = helper[rightIndex++];
        }
    }
}
