package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class StudentIDHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newID = in.nextInt();
            System.out.println(newID);
            if (!newID.equals(00)) {
                System.out.print("Student Name: ");
                String newName = in.next();
                students.put(newID, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newID.equals(0));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");

        }

    }

}
