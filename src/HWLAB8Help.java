
import java.util.Scanner;
public class HWLAB8Help {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Get some info on classmates
		
		// Create arrays of info (names, favorite food, hometown)
		// array 1 = names
		String[] stuNames = {"Grant", "Chirpia"};
		// array 2 = hometown
		String[] hometown = {"HoneyBee Market", "Grand Circus Park"};
		// array 3 = favorite food
		String[] food = {"Candy", "Cake"};
	
		

				System.out.println("Welcome to my app!");
		
				System.out.println("\nPick a student: ");
		// give user a list of people to choose from
		// populate a "for loop" with a list of students
		
		for (int i = 0; i < hometown.length; i++) {
			System.out.println((i + 1) + ". " + stuNames[i]);
		}
		
		int userOption = Validator.getInt(scan, "\nPick a student: ", 1, stuNames.length);
				
				// match the number a user selects to a student's info
				// show food match for selection
				System.out.println(food[userOption - 1]);
	}
	}
