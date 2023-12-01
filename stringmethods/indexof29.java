package stringmethods;

import java.util.Scanner;

public class indexof29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input=sc.nextLine();
	        System.out.print("Enter a character its index: ");
	        String check=sc.nextLine();
	        int index=input.indexOf(check);
	        if (index==-1) {
	            System.out.println("The character is not found in the entered string.");
	        } else {
	            System.out.println("The index of " + check + " in the entered string is: " + index);
	        }
	}

}
