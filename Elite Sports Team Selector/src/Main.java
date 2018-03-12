
	import java.util.Scanner;
	public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("To be accepted to this team you need to fill out the form");
			
			System.out.println("How old are you?");
			int age1 = sc.nextInt();
		
			System.out.println("What is your gender?");
			char gender1 = sc.next().charAt(0);
		
			System.out.println("I have experience: true or false?");
			boolean experience1 = sc.nextBoolean();
		
			System.out.println("How much do you weight?");
			double weight1 = sc.nextDouble();
		
			if  (weight1 <= 60&& experience1 == true && age1 >= 15 && gender1 == 'W') {
				System.out.println("Good! You are accepted!");	
			} else {
				System.out.println("Unfortunately, you are not accepted");
			}
		
			}

		}

	}

