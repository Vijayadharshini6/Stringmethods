package stringmethods;

import java.util.Scanner;

public class equalsignorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 20
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1=sc.nextLine();
        System.out.println("Enter String2: ");
        String str2=sc.nextLine();
		 if(str1.equalsIgnoreCase(str2)) 
		 {
	            System.out.println("The strings are equal.");
	     } else {
	            System.out.println("The strings are not equal.");
	     }
	}
}
