package Lab5;
import java.util.Scanner;

public class EvenNumbersSumArray {

    public static void main(String[] args) {
    	// Scanner object to take user input for array and number of array element
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();     // Number of array elements

        // Array 
        int[] num = new int[n];
        // Integer sum to store sum of even numbers in the array
        int sum = 0;

        System.out.println("Enter " + n + " numbers: ");
        // For loop to take input from user for n elements
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt(); 
        }

        System.out.println("Even numbers: ");
        // Printing even numbers from the array and also incrementing sum 
        for (int j = 0; j < n; j++) {
            if (num[j] % 2 == 0) {
                System.out.println(num[j]);
                sum += num[j];
            }
        }

        // Printing sum of even numbers in the array
        System.out.println("Sum of even numbers: " + sum);

        sc.close();
    }
}
