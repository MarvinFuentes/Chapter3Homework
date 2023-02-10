/**
 * @class: TrianglePerimeter
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: February 9, 2023
 * This program will find the perimeter of any triangle that is
 * reasonable nonetheless the program will prompt you with invalid input.
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read all sides of the triangle.
        System.out.print("Enter length of side a of Triangle:");
        // Prompt to enter dimension for side a.
        int a = input.nextInt();
        // Input as an integer.
        System.out.print("Enter length of side b of Triangle:");
        // Prompt to enter dimension for side b.
        int b = input.nextInt();
        // Input as an integer.
        System.out.print("Enter length of side c of triangle:");
        // Prompt to enter dimension for side c.
        int c = input.nextInt();
        // Input as an integer.
        if ( a >= b + c || b >= a + c || c >= b + a) {
            // Declaring an if statement to determine id the triangle is valid.
            System.out.print("Invalid input");
            // Print out "Invalid input" if statement is true.
        }
        else {
            // Else statement if statement isn't true.
            int p = (a + b + c);
            // Formula for finding the perimeter of a triangle.
            System.out.print("Perimeter of triangle:" + p);
            // Print out "perimeter of triangle" plus the perimeter of the triangle.
        }
    }
}
