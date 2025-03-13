package csc372ct5;
import java.util.Scanner;


public class RecursionProduct {

	public static void main(String[] args) {

		// Get the numbers from the user
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		// Calculate the product of the numbers
		int product = product(numbers);

		// Display the product
		System.out.println("The product of the numbers is " + product);
	}

	// Recursive method to calculate the product of all numbers in an array
	// (This is better than having to copy the array / pass when we recurse )
	public static int product(int[] numbers, int startIndex) {
        if (startIndex == numbers.length) {
            return 1;
        } else {
            return numbers[startIndex] * product(numbers, startIndex + 1);
        }
    }

	// Convenience method to get product w/o having to pass the start index.
	public static int product(int[] numbers) {
		return product(numbers, 0);
	}
}
