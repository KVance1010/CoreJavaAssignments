package ClassExpInheritance;

public class SingleInheritance extends Teacher{
	
	String mainSubject = "Physics";
	

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
		

	}
}

