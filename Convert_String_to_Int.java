import java.util.InputMismatchException;
import java.util.Scanner;

public class Convert_String_to_Int {
    public static void main(String[] args) {
        System.out.println("This is a program that takes a String as input and converts it into integer(if possible).");
        System.out.print("Enter the String : ");
        // using scanner class to take a string input from the user
        Scanner scanner = new Scanner(System.in);
        try {
            String stringInput = scanner.nextLine();
            int integer = Integer.parseInt(stringInput);
            System.out.println("The converted integer is : " + integer);
        } catch (InputMismatchException iME) {
            System.out.println("Please give valid input");
        } catch (Exception e) {
            System.out.println("Unable to convert entered string to integer");
        }
        scanner.close();
    }
}
