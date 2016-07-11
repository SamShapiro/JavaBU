package compare;

import java.util.Scanner;

public class Comparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first string: ");
		String first = scanner.nextLine();
		System.out.print("Please enter your second string: ");
		String second = scanner.nextLine();
		
		scanner.close();
		
		int compareResult = first.compareTo(second);
		
		if (compareResult == 0) {
			System.out.println("first string is equal to second string");
		}
		else if (compareResult > 0) {
			System.out.println("first string is less than second string");
		}
		else if (compareResult < 0) {
			System.out.println("first string is greater than second string");
		}
	}
}
