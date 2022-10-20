package exercises;

import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        float miles;
        float gallons;
        float mpg;
        Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter miles: ");
        miles= in.nextFloat();
        System.out.println("Enter gallons: ");
        gallons = in.nextFloat();

        mpg = miles / gallons;

        System.out.println("MPG is: " + mpg);

    }


}
