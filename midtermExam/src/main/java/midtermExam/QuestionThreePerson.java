package midtermExam;

/**
 * Create an abstract class Person with attributes name and ssn.
 * Create a subclass Student that inherits from Person and has attributes
 * 		studentID and areaOfStudy.
 * Create constructors that properly use the keyword 'this' and 'super'
 * @author Samuel Shapiro <samuel.shapiro123@gmail.com>
 *
 */
public abstract class QuestionThreePerson {
	private String name;
	private String ssn;
	
	public QuestionThreePerson() {
		this("John Doe", "000-000-0000");
	}
	
	public QuestionThreePerson(String name, String ssn) {
		super();
		this.setName(name);
		this.setSsn(ssn);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
