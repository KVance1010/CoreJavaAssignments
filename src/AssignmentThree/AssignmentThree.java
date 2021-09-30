package AssignmentThree;

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

	public static void main(String[] args) {
		AssignmentThree s1 = new AssignmentThree("John", 24, 'S', 'M', 80, 90, 100);
		AssignmentThree s2 = new AssignmentThree("Mary", 30, 'S', 'F', 60, 40);
		AssignmentThree s3 = new AssignmentThree ("Pete", 40, 'S', 'M', 70, 75);
		AssignmentThree s4 = new AssignmentThree ("Ray ", 35, 'S', 'M', 100, 100, 100);
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
