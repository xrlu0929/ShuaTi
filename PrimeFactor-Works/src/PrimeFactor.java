import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String[] args) {
        //System.out.println(primeFactor(8));
        System.out.println(primeFactor(3));
//        System.out.println(primeFactor(9));
//        System.out.println(primeFactor(12));
//        System.out.println(primeFactor(8));
//
//        System.out.println(primeFactor(99));
//        System.out.println(primeFactor(9797));
    }

    public static List<Integer> primeFactor(int target) {
        List<Integer> res = new ArrayList<>();
        int origin = target;
        int current = 2;
        while (target > 1) {
            int temp = target % current;
            if (temp != 0) {
                int next = nextPrime(origin, current);
                //target = target / next;
                if (next == current) {
                    res.add(next);
                    return res;
                }
                current = next;
            } else {
                res.add(current);
                //System.out.println(temp);
                target = target / current;
            }
        }
        //System.out.println(res);
        return res;
    }

    private static boolean primeCheck(int target) {
        if (target == 1) {
            return false;
        }
        if (target == 2) {
            return true;
        }

        for (int i = 2; i < target; i++) {
            if (target % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int nextPrime(int origin, int current) {
        int res = current;

        boolean loop = true;

        int i = current + 1;

        while (i <= origin && loop) {
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    break;
                }

                System.out.println("should stop here " + i);

                res = i;

                if (res != current) {
                    loop = false;
                }

            }
            i++;


        }
        System.out.println("result " + res);

        return res;

    }
}
