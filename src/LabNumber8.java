import java.util.Arrays;
import java.util.Scanner;

public class LabNumber8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // To take in information about classmates
		String userInput;

		//userInput = sc.nextLine();


		// We need to create arrays containing the following information on classmates (name, hometown, favorite food, favorite hobby)

		String[] stuNames = {"Gale", "Christian", "Imran", "Christie", "Aja", "Chris"};
		String[] hometown = {"Detroit, MI", "Chicago, IL", "Hamtramck, MI", "Cleveland, OH", "Chattanooga, TN", "Rochester, NY", };
		String[] favFood = {"grapefruit", "pizza","roast chicken", "french fries", "lasagna", "spaghetti and meatballs"};
		String[] favHobby = {"coding", "firefly catching", "spelunking", "antique collecting", "ballroom dancing", "parkour"};
		String cont = "yes";

		while (cont.equalsIgnoreCase ("yes")) {
			System.out.println("Welcome to our Java class!"); // print out greeting
			System.out.println("\nStudents in the class: "); 

			for (int i = 0; i < hometown.length; i++) {
				System.out.println((i + 1) + ". " + stuNames[i]);  
			}


			int userOption = Validator.getInt(sc, "\nPick a student (enter the number of the student from list above): ", 1, stuNames.length);

			//userInput = sc.nextLine();

			System.out.println("\nWhat would you like to know about " + (stuNames[userOption -1]) + "?"  + " (enter hometown, food, or hobby)");

			userInput = sc.nextLine();

			if (userInput.equalsIgnoreCase("hometown")) {
				System.out.println(stuNames[userOption -1] + "'s hometown is " + hometown[userOption-1] + ".");
				
				
			}
				else if (userInput.equalsIgnoreCase("food")) {
					System.out.println(stuNames[userOption -1] + "'s favorite food is " + favFood[userOption-1] + ".");
					
				}
					else if (userInput.equalsIgnoreCase("hobby")) {
						System.out.println(stuNames[userOption -1] + "'s favorite hobby is " + favHobby[userOption-1] + ".");
						
					}
						else 
							System.out.println("Invalid response. Please enter hometown, food, or hobby");

			

					System.out.println("\nWhat else would you like to know about " + (stuNames[userOption -1]) + "?"  + " (enter hometown, food, or hobby)");

					System.out.println("Do you want to try another student? yes or no");
					
					cont = sc.nextLine();
		}

					//System.out.println("Learn something else about " + (stuNames[userOption -1]) + "."  + " (enter hometown, food, or hobby)");

					//System.out.println(hometown[userOption - 1]);
					//System.out.println(favFood[userOption - 1]);
					//System.out.println(favHobby[userOption - 1]);



				}
			}
		
	
