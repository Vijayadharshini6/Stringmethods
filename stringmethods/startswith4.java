package stringmethods;

import java.util.Scanner;

public class startswith4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String words = sc.nextLine();
	        System.out.print("Enter a start letter: ");
	        String start = sc.nextLine();
	        boolean startsWith = words.startsWith(start);
	        if (startsWith) {
	            System.out.println("The string starts with " + start);
	        } 
	        else {
	            System.out.println("The string does not start with "+ start);
	        }
	}

}
