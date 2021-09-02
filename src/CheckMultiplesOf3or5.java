// Tangan, Mayvelline
// W1D3 - Problem 2

public class CheckMultiplesOf3or5 {

	public static void main(String[] args) {
		int number = 15;
		
		//display conditions

		if (number % 3 == 0 || number % 5 == 0) {
			System.out.println("Is the number " + number + " either a multiple of 3 or 5? true");
		}
		else {
			System.out.println("Is the number " + number + " either a multiple of 3 or 5? false");
		}
	}

}
