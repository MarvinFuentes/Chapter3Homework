/**
 * @class: TrianglePerimeter
 * @aurthor: Marvin Fuentes
 * @course: ITEC2140 section4
 * @written: February 9, 2023
 * This program will determine if you are underweight, normal, overweight, or obese
 * by entering your height in inches and weight in pounds. The program will automatically
 * convert lbs to kgs and inches to meters.
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // Read the weight and height of user.
        System.out.print("Enter your weight in pounds:");
        // Prompt to enter weight.
        double lbs = input.nextDouble(); // Input as a decimal.
        System.out.print("Enter your height in inches:");
        // Prompt to enter height.
        double height = input.nextDouble(); // Input as a decimal.
        double kg = (lbs * 0.4536);
        // Conversion formula for pounds to kilograms.
        double meters = (height * 0.0254);
        // Conversion formula for inches to meters.
        double bmi = (kg / (meters * meters)); // Formula for BMI.
        if (bmi < 18.5){ // First if statement to determine if user is underweight.
            System.out.print("Underweight");
            // Print out underweight if statement is true.
        }
        else if (18.5 <= bmi && bmi < 25.0){
            // Else if to determine if user is normal and not continuing if statements.
            System.out.print("Normal"); // Print out Normal if statement is true.
        }
        else if (25.0 <= bmi && bmi < 30.0){
            // Else if to determine if user is overweight and not continuing if statements.
            System.out.print("Overweight"); // Print out overweight if statement is true
        }
        else { // Else statement to lastly determine if the user is obese.
            System.out.println("Obese"); // Print out obese if statement is true.
        }
    }
}
