package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	try(Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the first number");
		
int a = sc.nextInt();

System.out.println("Enter the second number");

int b = sc.nextInt();

System.out.println("Now calculating the sum");

int c = a + b;

System.out.println("First number is:" + a);
System.out.println("Second number is:" + b);
System.out.println("Sum is:" + c); 
}
	}
}
