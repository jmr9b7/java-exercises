package exercises;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float x;
        float y;
        float area;
        Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter x length: ");
        x = in.nextFloat();
        System.out.println("Enter y length: ");
        y = in.nextFloat();

        area = x * y;

        System.out.println("Area is: " + area);

    }
}
