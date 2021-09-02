/* Tangan, Mayvelline
 * WID3 - Problem 3
 */

import java.util.Scanner;

public class FullNamee {

	public static void main(String[] args) {
		// ask to enter first name
		Scanner fString = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = fString.next();
		
		// ask to enter last name
		Scanner lString = new Scanner(System.in);
		System.out.print("Enter last name: ");
		String lastName = lString.next();
		
		// concatenate and display
		System.out.println("Your full name is " + firstName + " " + lastName);
	}

}
