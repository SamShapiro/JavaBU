package midtermExam;
/**
 * Overriding and Overloading
 * 
 * Write a program that defines an abstract class with both abstract and non-abstract
 * methods. Define another class that inherits from this class and shows how to do both 
 * overloading and overriding with both types of methods.
 * 
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public abstract class QuestionTwo {
	
	private int num1;
	private int num2;
	
	
	public QuestionTwo(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	public abstract void helloWorld(); //abstract method for base class
	
	public int doMath(int num1, int num2) { //non-abstract method for base class
		int sum = num1 + num2;
		return sum;
	}
	
	//getters and setters for both variables
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	
	public int getNum2() {
		return num2;
	}
	
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}