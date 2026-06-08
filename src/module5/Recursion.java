package module5;

import java.util.Scanner;

public class Recursion {
    
    // Recursive method to calculate product of 'count' numbers
    public static int calculateProduct(Scanner sc, int remaining) {
        // Base case: only 1 number left to read
        if (remaining == 1) {
            System.out.print("Enter number " + (6 - remaining) + ": ");
            return sc.nextInt();
        }
        
        // Recursive case: read current number and multiply by product of remaining numbers
        System.out.print("Enter number " + (6 - remaining) + ": ");
        int num = sc.nextInt();
        
        return num * calculateProduct(sc, remaining - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Recursive Calculator =====");
        System.out.println("Please enter five integers:\n");
        
        // Start recursion with 5 numbers to read
        int product = calculateProduct(scanner, 5);
        
        System.out.println("\nThe product of all five numbers is: " + product);
        
        scanner.close();
    }
}