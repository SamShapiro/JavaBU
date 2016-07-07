package second;

public class SecondHello {
	private int age;
	
	public static void main(String[] args) {
		SecondHello secondHello = new SecondHello();
		secondHello.setAge(88);
		System.out.format("Hello World, I am %d years old.", secondHello.getAge());
	}
	
	private int getAge() {
		return this.age;
	}
	private void setAge(int _age) {
		this.age = _age;
	}
}