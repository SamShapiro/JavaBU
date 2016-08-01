package midtermExam;

public class QuestionThreeStudent extends QuestionThreePerson {
	
	private int studentId;
	private String areaOfStudy;

	public QuestionThreeStudent() {
		super();
		this.studentId = 999;
		this.areaOfStudy = "General Study";
	}

	public QuestionThreeStudent(String name, String ssn) {
		super(name, ssn);
		this.studentId = 999;
		this.areaOfStudy = "General Study";
	}
	
	public QuestionThreeStudent(String name, String ssn, int studentId, String areaOfStudy) {
		super(name, ssn);
		this.setStudentId(studentId);
		this.setAreaOfStudy(areaOfStudy);
	}

	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	public String getAreaOfStudy() {
		return areaOfStudy;
	}
	public void setAreaOfStudy(String areaOfStudy) {
		this.areaOfStudy = areaOfStudy;
	}

}
