package stringmethods;

import java.util.Scanner;
public class subsequence11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word: ");
        String word=sc.nextLine();
        CharSequence subsequence = word.subSequence(3,5);
        String subsequenceString = subsequence.toString();
        System.out.println("Original Text: " + word);
        System.out.println("Subsequence: " + subsequenceString);
	}
}
