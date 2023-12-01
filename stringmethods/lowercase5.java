package stringmethods;

import java.util.Scanner;

public class lowercase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter capital letter: ");
        String word=sc.nextLine();
        String lower=word.toLowerCase();
        System.out.println(lower);
	}

}
