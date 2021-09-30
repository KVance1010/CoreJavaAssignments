/**
 * 
 */
package CoreJavaAssignments;

/**
 * @author Kyle Vance
 *
 */
import java.util.Scanner;

public class CoreJavaAssignments {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int usersChoice;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please pick which assignment you would like to see:  ");
		System.out.println("                  Options");
		System.out.println("\n1: String Statements");
		System.out.println("2: Student Objects");
		System.out.println("3: DataTypesProgram");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.print("Please type you nunber of the option you would like:   ");
		usersChoice = scnr.nextInt();
		
		
	switch(usersChoice) {
	case 1:
		StringStatement assingmentOne = new StringStatement();
		assingmentOne.stringStatements();
		break;
	case 2:
		AssignmentThree s1 = new AssignmentThree("John", 24, 'S', 'M', 80, 90, 100);
		AssignmentThree s2 = new AssignmentThree("Mary", 30, 'S', 'F', 60, 40);
		AssignmentThree s3 = new AssignmentThree ("Pete", 40, 'S', 'M', 70, 75);
		AssignmentThree s4 = new AssignmentThree ("Ray ", 35, 'S', 'M', 100, 100, 100);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
		break;
	case 3:
		DataTypesProgram.typeCastExample();
		break;
	case 4:
		
		break;
    case 5:
		
		break;
    case 6:
		
		break;
    case 7:
	
	    break;
    case 8:
	
	    break;
    case 9:
	
	    break;
    case 10:
		
		break;
	}
	}

}
