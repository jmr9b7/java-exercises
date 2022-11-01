package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        int[] vals = {1, 1, 2, 3, 5, 8};

        printArray(vals);

    }

    public static void printArray(int[] sumList) {

        for (int val : sumList){
            System.out.println(val);
        }
    }
}
