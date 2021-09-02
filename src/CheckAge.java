// Tangan, Mayvelline
// W1D3 - Problem 1

import java.util.Scanner;
public class CheckAge {

	public static void main(String[] args) {
		// get the data for age
		Scanner inputAge = new Scanner(System.in);
		System.out.print("Age: ");
		String inputAgeString = inputAge.next();
		
		// parse the input to string
		int age = Integer.parseInt(inputAgeString);
		
		//display conditions
		if (age >= 0 && age <18) {
			System.out.println("minor? true");
			System.out.println("adult? false");
			System.out.println("senior? false");
		}
		else if (age >= 18 && age < 60) {
			System.out.println("minor? false");
			System.out.println("adult? true");
			System.out.println("senior? false");
		}
		else if (age >= 60){
			System.out.println("minor? false");
			System.out.println("adult? false");
			System.out.println("senior? true");
		}
	}
}

