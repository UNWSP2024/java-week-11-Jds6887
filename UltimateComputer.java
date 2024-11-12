package harder1;

import java.util.Scanner;

public class UltimateComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getValidMenuChoice(scanner);

            switch (choice) {
                case 1:
                    displayApp();
                    break;
                case 2:
                    textArtApp();
                    break;
                case 3:
                    calculatorApp();
                    break;
                case 4:
                    binaryCalculatorApp();
                    break;
                case 5:
                    encouragementApp();
                    break;
                case 6:
                    diceApp();
                    break;
                case 7:
                    oppishApp();
                    break;
                case 8:
                    fibonacciApp();
                    break;
                case 9:
                    doubleFactorialApp();
                    break;
                case 10:
                    System.out.println("Exiting Ultimate Computer...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Ultimate Computer!");
        System.out.println("Please select an option:");
        System.out.println("1. Display APP");
        System.out.println("2. Text Art APP");
        System.out.println("3. Calculator APP");
        System.out.println("4. Binary Calculator APP");
        System.out.println("5. Encouragement APP");
        System.out.println("6. Dice APP");
        System.out.println("7. Oppish APP");
        System.out.println("8. Fibonacci APP");
        System.out.println("9. Double Factorial APP");
        System.out.println("10. Exit");
    }

    private static int getValidMenuChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    // The following methods are placeholders for the actual app implementations.
    // You would replace these with the code you've written for each app.

    private static void displayApp() {
        System.out.println("Displaying APP...");
    }

    private static void textArtApp() {
        System.out.println("Running Text Art APP...");
    }

    private static void calculatorApp() {
        System.out.println("Running Calculator APP...");
    }

    private static void binaryCalculatorApp() {
        System.out.println("Running Binary Calculator APP...");
    }

    private static void encouragementApp() {
        System.out.println("Running Encouragement APP...");
    }

    private static void diceApp() {
        System.out.println("Running Dice APP...");
    }

    private static void oppishApp() {
        System.out.println("Running Oppish APP...");
    }

    private static void fibonacciApp() {
        System.out.println("Running Fibonacci APP...");
    }

    private static void doubleFactorialApp() {
        System.out.println("Running Double Factorial APP...");
    }
}