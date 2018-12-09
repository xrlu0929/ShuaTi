//
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean go = true;
        int loop_no = 0;

        List<String> input = new ArrayList();


        while(go) {
            //line_no = in.nextInt();
            //System.out.print("line_no: "+line_no);
            loop_no ++;
            String a = in.next();
            input.add(a);
//            System.out.print("input: "+input);
//            System.out.print("loop: "+loop_no);

            if(loop_no > Integer.parseInt(input.get(0)) * 2 ) {
                go = false;
            }

        }
        List<Integer> number = new ArrayList();
        List<String> element = new ArrayList();
        System.out.println();
        for (int i = 1; i < input.size(); i++) {
            if (i%2 != 0) {// ODD
                number.add(Integer.parseInt(input.get(i)));
//                System.out.print(number);
            } else {
                element.add((input.get(i)));
//                System.out.print(element);
            }
        }
        // for A B C
        List<Integer> element_total = new ArrayList<>(3);
// element_total
       for(int m=0; m < 3; m++){
           element_total.add(0);
        }

//        System.out.println('\n' + "RESULT");
        for(int k = 0; k < number.size(); k++){
            number.get(k);
//            System.out.println("number: " + number.get(k));
            for (int e = 0; e < element.get(k).length(); e++) {
                sortAdd(element.get(k).charAt(e), number.get(k), element_total);
            }

        }

        // element_total
//        System.out.println("element_total FINAL: ");
//        for (int i = 0; i<3; i++){
//            System.out.print(element_total.get(i)+" ");
//
//        }
        int result = Math.min(Math.min(element_total.get(0), element_total.get(1)), element_total.get(2));

        System.out.println("FINAL: ");
        if(result == 0){
            System.out.println(-1);
        }else {
            System.out.println(result);
        }

    }

    static private void sortAdd(Character a, Integer b, List<Integer> element_total){
        switch (a){
            case 'A': element_total.set(0, element_total.get(0)+b); break;
            case 'B': element_total.set(1, element_total.get(1)+b); break;
            case 'C': element_total.set(2, element_total.get(2)+b); break;
        }
//        for (int i = 0; i<3; i++){
//            System.out.println("element_total: "+element_total.get(i));
//        }

    }
}