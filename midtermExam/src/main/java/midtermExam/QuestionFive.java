package midtermExam;

/**
 * Consider the following code fragment:
 * 	if (x > 5) {
 * 		System.out.println("A");
 * 		if (x < 10) {
 * 			System.out.println("B")
 * 		}
 * 	}
 * 	else {
 * 		System.out.println("C")
 * 	}
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */

public class QuestionFive {
	
	/*
	 * For numbers 5-9, the code will print "A", with "B" on the next line.
	 * For numbers 10+, the code will only print "A".
	 * For numbers less than 5, the code will print "C".
	 */
	
	public static void main(String[] args) {
		System.out.println("If x is 4, then 'C' is printed.");
		System.out.println("If x is 5, then 'A B' is printed, with 'B' on a second line.");
		System.out.println("If x is 6, then 'A B' is printed, with 'B' on a second line.");
		System.out.println("If x is 9, then 'A B' is printed, with 'B' on a second line.");
		System.out.println("If x is 10, then 'A' is printed.");
		System.out.println("If x is 11, then 'A' is printed.");
		
	}

}
