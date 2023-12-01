package stringmethods;

import java.util.Scanner;

public class copyvalueof22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        char[] ch=word.toCharArray();        
        String str = String.copyValueOf(ch);
        System.out.println("New string created : " + str);                 
	}	
}
