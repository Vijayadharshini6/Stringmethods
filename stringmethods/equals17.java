package stringmethods;

import java.util.Scanner;

public class equals17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String str1=sc.nextLine();
        System.out.println("Enter word 2: ");
        String str2=sc.nextLine();
		boolean result=str1.equals(str2);
        System.out.println("String are equal: " + result);
	}

}
