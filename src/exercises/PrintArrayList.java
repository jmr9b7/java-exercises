package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintArrayList {

    public static void main(String[] args) {
        ArrayList<String> vals = new ArrayList<>(Arrays.asList("London", "Tokyo", "New York"));

        printFive(vals);

    }

    public static void printFive(ArrayList<String> wordList) {
        for (String word : wordList){
            if (word.length() == 5) {
                System.out.println(word);
            }
        }

    }
}
