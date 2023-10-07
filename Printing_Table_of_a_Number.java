import java.util.Scanner;

public class Printing_Table_of_a_Number {
    // Creating a function to print out the multiplication table of a number n number of times
    public static void printTable(int number, int length) {
        for (int i = 1; i <= length; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a program which will print out the multiplication table of a number n number of times.");
        System.out.println("Enter the number whose multiplication table you want to print out : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter the length of the table : ");
        int length = scanner.nextInt();
        printTable(number, length);
        scanner.close();
    }
}
