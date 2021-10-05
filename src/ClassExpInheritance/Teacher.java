package ClassExpInheritance;

public class Teacher {
	private String designation = "Teacher";
	private String collegeName = "Beginnerbook";
    
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	void does() {
		System.out.println("Physics");
	}

	public class SingleInheritance extends Teacher{
		String mainSubject = "Physics";
	}

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
		

	}
}

