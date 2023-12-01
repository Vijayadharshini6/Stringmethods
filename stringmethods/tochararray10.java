package stringmethods;

import java.util.Scanner;
public class tochararray10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word: ");
        String word=sc.nextLine();
        char[] singleletter=word.toCharArray();
        for(char character:singleletter)
        {
        	 System.out.println(character);	
        }
	}

}
