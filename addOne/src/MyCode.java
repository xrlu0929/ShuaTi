class MyCode {
    public static int[] add_one(int[] input) {
        // assumption: input is not null, length >0
        // corner case
        boolean flag = false;
        for (int i = input.length - 1; i >=0; i--) {
            if (input[i] == 9) {
                flag = false;
            } else {
                flag = true;
                break;
            }
        }
        if (!flag) {
            // input is 999 type
            int[] result = new int[input.length + 1];
            result[0] = 1;
            return result;
        }

        /*
         * traveral generic
         */

        for (int i = input.length - 1; i >=0; i--) {
            if(input[i] == 9 ) {
                input[i] = 0;
//                input[i - 1] += input[i - 1] + 1;
            } else {
                input[i] = input[i] + 1;
                break;
            }
        }

        return input;
    }
    private static void printArray (int[] input) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int[] one = new int[]{1,1,9};
        int[] two = new int[]{1,1,1};
        int[] three = new int[]{1,9, 9,9};
        int[] four = new int[]{9,9,9};

        printArray(add_one(one));
        printArray(add_one(two));
        printArray(add_one(three));
        printArray(add_one(four));

    }
}