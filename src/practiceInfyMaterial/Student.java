package practiceInfyMaterial;

public class Student {
	int StudentId;
	String name;
	float qualifyingExamMarks;
	char residentialStatus;
	int YearofEngineering;
	

	public int getStudentId() {
		return StudentId;
	}


	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}


	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}


	public char getResidentialStatus() {
		return residentialStatus;
	}


	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}


	public int getYearofEngineering() {
		return YearofEngineering;
	}


	public void setYearofEngineering(int yearofEngineering) {
		YearofEngineering = yearofEngineering;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.setStudentId(1001);
		st1.setName("jacob");
		st1.setQualifyingExamMarks(80);
		st1.setResidentialStatus('H');
		st1.setYearofEngineering(2018);
		System.out.println("StudentId :"+st1.getStudentId());
		System.out.println("Student Name :"+st1.getName());
		System.out.println("Qulaifying Exam Marks :"+st1.getQualifyingExamMarks());
		System.out.println("Residential status :"+st1.getResidentialStatus());
		System.out.println("year of Engineering :"+st1.getYearofEngineering());

	}

}
