package stringmethods;

import java.util.Scanner;

public class matches30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        System.out.print("Enter a regular expression to match against the string: ");
	        String regex = sc.nextLine();
	        boolean match = str.matches(regex);
	        if (match) {
	            System.out.println("The entered string matches the specified regular expression.");
	        } else {
	            System.out.println("The entered string does not match the specified regular expression.");
	        }
	}

}
