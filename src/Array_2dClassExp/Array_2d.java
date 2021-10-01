package Array_2dClassExp;

public class Array_2d {

	public static void main(String[] args) {
		int  [][] arr = {{1,2},{3,4}};        // for row
		for (int i = 0; i < 2; i++) {         // for column 
		    for (int j = 0; j < 2; j++) {
			    System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}

	}

}
