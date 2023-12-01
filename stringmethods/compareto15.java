package stringmethods;

import java.util.Scanner;
public class compareto15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String str1=sc.nextLine();
        System.out.println("Enter word 2: ");
        String str2=sc.nextLine();        
		int result = str1.compareTo(str2);
      if(result<0)
      {    	       
      System.out.println("The first string less than the second string.");
      }
     else if (result > 0) {
        System.out.println("The first string greater than the second string.");
    } else {
        System.out.println("The two strings are equal.");
    }
    }
}
