package exercises;

import java.util.Scanner;

public class HelloPerson {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();
        System.out.println("Hello, " + name + "!");
    }
}
