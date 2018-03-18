import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		runDemoOop();
		runDemoOop2();
	}
	
	private static void runDemoOop() {
		System.out.println("Running Demo - Object Oriented - Single record...");
		
		Selector selector = new Selector("Tamara", "Jovanovic", 2, true);
		
		System.out.println("=============================================");
		System.out.println("Name: " + selector.getName());
		System.out.println("Surname: " + selector.getSurname());
		System.out.println("Years of expirience: " + selector.getYearsOfExperience());
		System.out.println("Is available: " + selector.getIsAvailable());
		System.out.println("=============================================");
		
	}
	
	private static void runDemoOop2() {
		System.out.println("Running Demo - Object Oriented - Multiple records...");
		
		Selector selectors[] = new Selector[3];
		
		selectors[0] = new Selector("Petar", "Petrovic", 2, true);
		selectors[1] = new Selector("Marija", "Marjanovic", 3, true);
		selectors[2] = new Selector("Jovan", "Jovanovic", 12, false);
		
		for(int i = 0; i < 3; i++)
		{
			Selector selector = selectors[i];
			
			System.out.println("=============================================");
			System.out.println("Name: " + selector.getName());
			System.out.println("Surname: " + selector.getSurname());
			System.out.println("Year of Birth: " + selector.getYearsOfExperience());
			System.out.println("Is employed fulltime: " + selector.getIsAvailable());
			System.out.println("=============================================");
		}
	}
}
