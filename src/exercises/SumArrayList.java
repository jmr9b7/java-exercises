package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class SumArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(sumEven(vals));

    }

    public static int sumEven(ArrayList<Integer> sumList) {

        int sum = 0;

        for (Integer val : sumList) {
            if(val % 2 == 0){
            sum += val;
            }
        }
        return sum;
    }
}
