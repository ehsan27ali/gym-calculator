import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		char menuInput_char;
		int menuInput_int;
		double eachSide, total;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			
			do {
				System.out.println("\n\nWhat would you like to know?");
				System.out.println("=====================");
				System.out.println("1) weight on EACH SIDE");
				System.out.println("2) TOTAL weight");
				System.out.println("3) EXIT");
				System.out.print("User input: ");
				menuInput_char = scanner.next().charAt(0);
				
				if(menuInput_char != '1' && menuInput_char != '2' && menuInput_char != '3') {
					System.out.println("\nERROR. Invalid user input.");
					scanner.nextLine();
				}
				
			}while(menuInput_char != '1' && menuInput_char != '2' && menuInput_char != '3');
			
			//scanner.nextLine();
			menuInput_int = menuInput_char - '0';
			
			
			System.out.println("You have selected option: " + menuInput_int);
			
			if(menuInput_int == 1) {
				System.out.println("yup, 1");
				//what is the weight on EACH SIDE
				do {
					
					System.out.print("Enter TOTAL weight: ");
					total = scanner.nextDouble();
					
					if((total % 5 != 0) || (total < 45.0)) {
						System.out.print("\nERROR. Invalid input. ");
						if(total % 5 != 0)
							System.out.print("TOTAL weight needs to be divisible by 5");
						else
							System.out.print("TOTAl weight needs to be OVER 45.0 lbs");
						
						scanner.nextLine();
					}

				}while((total % 5 != 0) || (total < 45.0));
				eachSide = determineEachSide(total);
				System.out.println("Weight on EACH SIDE: " + eachSide + " lbs");

			}
			else if(menuInput_int == 2) {
				System.out.println("yup, 2");
				//what is the TOTAL weight
				//total = determineTotalWeight();
				//System.out.println("TOTAL weight: " + total + " lbs");
				//eachSide = (total - 45.0) / 2.0;
			}
			else{
				System.out.println("You have selected to EXIT.");
				break;
			}
			
			
		}while(menuInput_int != 3);
		
		
		
		
		
		
		
		
		
		/*
		do {
			menu_input = menu();
			if(menu_input == 1) {
				//what is the weight on EACH SIDE
				eachSide = determineEachSide();
				System.out.println("Weight on EACH SIDE: " + eachSide + " lbs");

			}
			else if(menu_input == 2) {
				//what is the TOTAL weight
				total = determineTotalWeight();
				System.out.println("TOTAL weight: " + total + " lbs");
				eachSide = (total - 45.0) / 2.0;
			}
			else{
				System.out.println("You have selected to EXIT.");
				break;
			}
			determinePlates(eachSide);
			
			
		}while(menu_input != 3);
		*/
		scanner.close();
		System.out.println("Program terminated.");
		
	}
	
	/*
	public static int menu() {
		
		char input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("\n\nWhat would you like to know?");
			System.out.println("=====================");
			System.out.println("1) weight on EACH SIDE");
			System.out.println("2) TOTAL weight");
			System.out.println("3) EXIT");
			System.out.print("User input: ");
			input = scanner.next().charAt(0);
			
			if(input != '1' && input != '2' && input != '3') {
				System.out.println("\nERROR. Invalid user input.");
				scanner.nextLine();
			}
			
		}while(input != '1' && input != '2' && input != '3');
		
		scanner.nextLine();
		scanner.close();
		int input_int = input - '0';
		return input_int;
		
	}
	*/
	
	/*
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
		return (eachSide * 2.0) + 45.0;
	}
	*/
	
	public static double determineEachSide(double total) {
		
		return (total - 45.0) / 2.0;
	}

	/*
	public static void determinePlates(double eachSide){
		
		int num45s = 0, num25s = 0, num10s = 0, num5s = 0, num2point5s = 0;
		
		while(eachSide > 0.0){
			if(eachSide >= 45.0){
				num45s++;
				eachSide -= 45.0;
			}
			else if(eachSide >= 25.0){
				num25s++;
				eachSide -= 25.0;
			}
			else if(eachSide >= 10.0){
				num10s++;
				eachSide -= 10.0;
			}
			else if(eachSide >= 5.0){
				num5s++;
				eachSide -= 5.0;
			}
			else{
				num2point5s++;
				eachSide -= 2.5;
			}
		}


		System.out.print("\n===========PLATES ON EACH SIDE===========");
		if(num45s > 0)
			System.out.print("\n45lb plates: " + num45s);
		if(num25s > 0)
			System.out.print("\n25lb plates: " + num25s);
		if(num10s > 0)
			System.out.print("\n10lb plates: " + num10s);
		if(num5s > 0)
			System.out.print("\n5lb plates: " + num5s);
		if(num2point5s > 0)
			System.out.print("\n2.5lb plates: " + num2point5s);
		
		System.out.println();
		System.out.println("*all weights shown are considering a 45lb bar");


	}
	*/

}
