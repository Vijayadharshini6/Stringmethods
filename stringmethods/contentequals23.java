package stringmethods;

import java.util.Scanner;

public class contentequals23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub error
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter a string 2: ");
        String str2 = sc.nextLine();
        boolean equal=str1.contentEquals(str2);		
        if (equal) {
            System.out.println("The content of two String is equal.");
        } else {
            System.out.println("The content of two String is not equal.");
        }
    }

}
