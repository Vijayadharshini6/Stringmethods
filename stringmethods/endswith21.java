package stringmethods;

import java.util.Scanner;

public class endswith21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String words = sc.nextLine();
        System.out.print("Enter a end letter: ");
        String end = sc.nextLine();
        boolean endswith = words.endsWith(end);
        if (endswith) {
            System.out.println("The string end with " + end);
        } 
        else {
            System.out.println("The string does not end with "+ end);
        }		
	}
	
}
