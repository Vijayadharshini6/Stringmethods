package stringmethods;

import java.util.Scanner;

public class lastindexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input=sc.nextLine();
	        System.out.print("Enter a character its last index: ");
	        String last=sc.nextLine();
	        int lastIndex=input.lastIndexOf(last);
	        if (lastIndex==-1) {
	            System.out.println("The character is not found in the entered string.");
	        } else {
	            System.out.println("The last index of " + last + " in the entered string is: " + lastIndex);
	        }

	}

}
