public class MergeTwoSorted {
    public static void main(String[] args) {
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

    public static int[] merge_recur() {
        return new int[]{1, 1};
    }
}
