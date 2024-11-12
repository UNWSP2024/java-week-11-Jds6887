package harder1;

import java.util.Scanner;

public class DoubleFactorial {


    public static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1; 
        }
        return n * doubleFactorial(n - 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

     
        while (true) {
            System.out.print("Enter a positive integer less than 20: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 1 || number >= 20) {
                    System.out.println("Error: Please enter a number greater than 0 and less than 20.");
                } else {
                    break; 
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
            }
        }


        int result = doubleFactorial(number);
        System.out.println("The double factorial of " + number + " is: " + result);
        
        scanner.close();
    }
}