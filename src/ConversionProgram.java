import java.util.Scanner;

public class ConversionProgram {

	public static void main(String[] args) {
		
		//Variables
		
		double meters;
		int sentinel = 4;
		int choice;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your distance in meters:");
		meters = keyboard.nextDouble();
		
		while( meters < 0 ) {
			System.out.println("Invalid choice, Reenter a valid choice");
			meters = keyboard.nextDouble();
		}
		
		menu();
		
		choice = keyboard.nextInt();
		
		while( choice != sentinel ) {
			if(choice == 1) {
				showKilometers(meters);
			}
			else if( choice == 2 ) {
				showInches( meters );
			}
			else if( choice == 3 ) {
				showFeet( meters );
			}
			else {
				System.out.println("Invalid choice, Reenter a valid choice");
			}
			menu();
			choice = keyboard.nextInt();
		}
		System.out.print("Thank you, the program will now end");
	}
	
	public static void menu() {
		System.out.println("1. Convert to kilometers\n2. Convert to inches\n3. Convert to feet\n4. Quit the program\n");
	}
	
	public static void showKilometers(double meters) {
		double kilometers;
		
		kilometers = meters * 0.001;
		
		System.out.printf( "\n%.1f meters is %.1f kilometers.\n", meters, kilometers );
	}
	
	public static void showInches(double meters) {
		double inches;
		
		inches = meters * 39.37;
		
		System.out.printf( "\n%.1f meters is %.1f inches.\n", meters, inches );
	}
	
	public static void showFeet(double meters) {
		double feet;
		
		feet = meters * 3.281;
		
		System.out.printf( "\n%.1f meters is %.1f feet.\n", meters, feet );
	}

}
