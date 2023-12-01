package stringmethods;

import java.util.Scanner;

public class repaceall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter words: ");
        String words=sc.nextLine();
		String newText = words.replaceAll("e", "y");
        System.out.println("Original Text: " + words);
        System.out.println("Modified Text: " + newText);
	}

}
