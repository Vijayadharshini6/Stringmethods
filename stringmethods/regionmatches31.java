package stringmethods;

import java.util.Scanner;

public class regionmatches31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = sc.nextLine();
	        System.out.print("Enter the starting index the first string: ");
	        int toffset1 = sc.nextInt();
	        sc.nextLine();  
	        System.out.print("Enter the second string: ");
	        String str2 = sc.nextLine();
	        System.out.print("Enter the starting index the second string: ");
	        int toffset2 = sc.nextInt();
	        System.out.print("Enter the length of the region to compare: ");
	        int len = sc.nextInt();
	        boolean matches = str1.regionMatches(toffset1, str2, toffset2, len);
	        if (matches) {
	            System.out.println("The specified regions strings match.");
	        } else {
	            System.out.println("The specified regions strings do not match.");
	        }
	}

}
