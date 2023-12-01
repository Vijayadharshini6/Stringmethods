package stringmethods;

import java.util.Scanner;

public class trim9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word: ");
        String word=sc.nextLine();
        String removespace=word.trim();
        System.out.println(removespace);
	}

}
