package ClassExpInheritance;

public class Teacher {
	
	private String designation = "Teacher";
	private String collegeName = "Beginnerbook";
    
	public Teacher() {}
	
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
}
