package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner in;

        radius = 0;
        while (radius <= 0) {
            in = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            radius = in.nextFloat();
        }
        area = Math.PI * radius * radius;

        System.out.println("The area of a circle of radius "+radius+" is: "+area);
    }
}
