package exercises;

import java.util.Scanner;

public class alic {
    public static void main(String[] args) {
        String alice;
        boolean found;
        String word;
        Scanner in;

        alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        in = new java.util.Scanner(System.in);
        System.out.println("Enter search word: ");
        word = in.next();

        found = alice.contains(word);

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }



    }
}
