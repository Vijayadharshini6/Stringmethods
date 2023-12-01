package stringmethods;


import java.util.Scanner;

public class chatat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word: ");
		String word=sc.next();		
		char firstChar=word.charAt(0); 		             
        System.out.println("First character: "+firstChar);
	}

}
