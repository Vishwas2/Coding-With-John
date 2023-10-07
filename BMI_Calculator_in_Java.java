import java.util.Scanner;

// Formula to calculate BMI : Weight(kg) / Height(m)^2
public class BMI_Calculator_in_Java {
    // Creating a function to calculate the BMI of the user
    public static void calculateBMI(double heightInMetres, double weightInKilograms) {
        double bmi = weightInKilograms / (Math.pow(heightInMetres, 2));
        System.out.println("The BMI is : " + bmi);
    }

    public static void main(String[] args) {
        System.out.println("This is a program which calculates your BMI.");
        System.out.print("Please enter your weight in kilograms : ");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.print("Please enter your height in metres : ");
        double height = scanner.nextDouble();
        // passing the entered values to the function to calculate BMI
        calculateBMI(height, weight);
        scanner.close();
    }
}
