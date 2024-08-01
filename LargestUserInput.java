package Lab5;
import java.util.Scanner;

public class LargestUserInput {

	public static void main(String[] args) {
		// Scanner Object to take input from user
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user for integer a, b and c
		System.out.println("Enter int a :");
		int a = sc.nextInt();
		
		System.out.println("Enter int b :");
		int b = sc.nextInt();
		
		System.out.println("Enter int c :");
		int c = sc.nextInt();
		
		sc.close();

		// Comparing a , b and c using if else statement and comparison operator &&
		System.out.println("The Largest Input is : ");
		if (a > b && a > c) {
			System.out.println(a);
		} 
		else if(b > a && b > c ) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
