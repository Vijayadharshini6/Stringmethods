package stringmethods;

import java.util.Scanner;

public class offsetbycodepoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str=sc.nextLine();
	        System.out.print("Enter the current index in the string: ");
	        int current=sc.nextInt();
	        System.out.print("Enter the number of code points to offset: ");
	        int codePointsOffset=sc.nextInt();
	        int newIndex=str.offsetByCodePoints(current,codePointsOffset);
	        System.out.println("New index after offset: " + newIndex);

	}

}
