import java.util.Scanner;

public class GymCalc {

	public static void main(String[] args) {

		
		int menu_input;
		
		do {
			menu_input = menu();
			if(menu_input == 1) {
				//what is the weight on EACH SIDE
				do {
					System.out.print("Enter TOTAL weight: ");
					
				} while();
			}
			else if(menu_input == 2) {
				//what is the TOTAL weight
				
			}
			
		}while(menu_input != 3);
		

	}
	
	public static int menu() {
		
		char input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\nWhat would you like to know?");
			System.out.println("=====================");
			System.out.println("1) weight on EACH SIDE");
			System.out.println("2) TOTAL weight");
			System.out.println("3) EXIT");
			System.out.print("User input: ");
			input = scanner.next().charAt(0);
			
			if(input != '1' && input != '2' && input != '3')
				System.out.println("\nERROR. Invalid user input.");
			
		}while(input != '1' && input != '2' && input != '3');
		
		scanner.close();
		int input_int = input - '0';
		return input_int;
		
	}
	
	public static double determineTotalWeight() {
		
		
		double eachSide;
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.print("Enter weight on EACH SIDE: ");
		eachSide = scanner.nextDouble();
		if(eachSide % 2.5 != 0)
			System.out.println("ERROR. Invalid input. Weight needs to be divisible by 2.5");
		
		}while(eachSide % 2.5 != 0.0);
		
		
		scanner.close();
		return (eachSide * 2.0) + 45;
	}
	
	public static double determineEachSide() {
		
		double total;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Enter weight on EACH SIDE: ");
			total = scanner.nextDouble();
			if(total % 5 != 0)
				System.out.println("ERROR. Invalid input. Total weight needs to be divisible by 5");
			
			}while(total % 5.0 != 0.0);
		
		scanner.close();
		return (total - 45) / 2.0;
	}

}