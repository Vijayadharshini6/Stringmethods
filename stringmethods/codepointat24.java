package stringmethods;

import java.util.Scanner;

public class codepointat24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Enter a index: ");
        int index=sc.nextInt();
        if (index>=0&&index<str.length()) {
            int code=str.codePointAt(index);
            System.out.println("The Unicode point at index "+ index+" is: "+code);
        } else {
            System.out.println("Invalid index.");
        }
	}
}
