package module5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    
    // Recursive method to calculate product of 'count' numbers
	public static long calculateProduct(Scanner sc, int remaining) {
        long num = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter number " + (6 - remaining) + ": ");
            
            try {
                num = sc.nextLong();
                validInput = true;
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number (integer).");
                sc.nextLine();
            }
        }
        
        // Base case: only 1 number left to read
        if (remaining == 1) {
            return num;
        }
        
        // Recursive case: multiply current number by product of remaining numbers
        return num * calculateProduct(sc, remaining - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Recursive Calculator =====");
        System.out.println("Please enter five integers:\n");
        
        // Start recursion with 5 numbers to read
        long product = calculateProduct(scanner, 5);
        
        System.out.println("\nThe product of all five numbers is: " + product);
        
        scanner.close();
    }
}