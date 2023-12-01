package stringmethods;

import java.util.Scanner;

public class concat16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String str1=sc.nextLine();
        System.out.println("Enter word 2: ");
        String str2=sc.nextLine();
		String result = str1.concat(str2);

        System.out.println("Concatenate String: " + result);
	}

}
