package CoreJavaAssignments;

public class AssignmentThree {
	
	String name;
	int age;
	char section;
	char gender;
	int subjectOne = 0;
	int subjectTwo = 0;
	int subjectThree = 0;
	   
	public AssignmentThree(String name, int age, char section, char gender, int subjectOne, int subjectTwo, int subjectThree){
	    this.name = name;
		this.age = age;
		this.section = section;
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		this.subjectThree = subjectThree;
	}
	public AssignmentThree(String name, int age, char section, char gender, int subjectTwo, int subjectThree){
	    this.name = name;
		this.age = age;
		this.section = section;
		this.subjectTwo = subjectTwo;
		this.subjectThree = subjectThree;
		   
	   
	}
	public void display() {
		int totalMarks = (subjectOne + subjectTwo + subjectThree);
		double testResults = totalMarks / 3.0;
		System.out.println(name +" " +age + " " + gender + " " + section + " " + testResults);
	}
	   	   
}
