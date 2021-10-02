package SelfLearnArrayDelete;

import java.util.Scanner;

public class ArrayDeleteElement {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int n, x, flag = 1, loc = 0;
		
		System.out.println("Enter the number of elements you want in the array;");
		n = scnr.nextInt();
		int a [] = new int [n];
		
		System.out.println("Enter each elemnts: press enter after each entry");
		
		for (int i = 0; i <n; i++) {
			a[i] = scnr.nextInt();
		}
		
		System.out.println("Enter the element you want to delete:");
		x = scnr.nextInt();
		
        for (int i = 0; i < n; i++) {
        	if (a[i] == x) {
        		flag = 1;
        		loc = i;
        		break;
        				
        	}
        	else {
        		flag =0;
        	}
        }
	    if (flag ==1) {
	    	for(int i = loc + 1; i < n; i++) {
	    		a[i-1]= a[i];
	    	}
	    	System.out.print("After Deleting:");
	    	for (int i = 0; i < n - 2; i++) {
	    		System.out.println(a[i]+",");
	    	}
	    	System.out.println(a[n-2]);
	    }
	    else {
	    	System.out.println("Element not found");
	    }
	}

}
