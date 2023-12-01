package stringmethods;

import java.util.Scanner;

public class getchars33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString=sc.nextLine();
	        System.out.print("Enter the starting index: ");
	        int startIndex=sc.nextInt();
	        System.out.print("Enter the ending index: ");
	        int endIndex=sc.nextInt();
	        if (startIndex<0||endIndex>inputString.length()||startIndex>endIndex) 
	        {
	            System.out.println("Invalid.");	            
	            return;
	        }
	        char[] charArray=new char[endIndex-startIndex];
	        inputString.getChars(startIndex,endIndex,charArray,0);
	        System.out.print("Copied characters: ");
	        System.out.println(charArray);

	}

}
