package midtermExam;

/**
 * Non-abstract class to inherit QuestionTwo
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public class QuestionTwoInherit extends QuestionTwo {

	private int num3;
	
	public QuestionTwoInherit(int num1, int num2, int num3) {
		super(num1, num2);
		setNum3(num3);
	}

	@Override
	public void helloWorld() { //overrides abstract method
		System.out.println("Hello, World!");
	}
	
	public void helloWorld(int num) { //overloads abstract method
		for (int i = 0; i < num; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	@Override
	public int doMath(int num1, int num2) { //overrides non-abstract method
		int product = num1 * num2;
		return product;
	}
	
	public int doMath(int num1, int num2, int num3) { //overloads non-abstract method
		int sum = num1 + num2 + num3;
		return sum;
	}

	//getter and setter for subclass's variable
	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

}
