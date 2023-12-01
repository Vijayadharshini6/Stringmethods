package stringmethods;

import java.util.Scanner;

public class intern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        String internedStr1=str1.intern();
        String internedStr2=str2.intern();
        boolean areInternedStringsEqual=internedStr1==internedStr2;
        if (areInternedStringsEqual) {
            System.out.println("The interned strings are the same.");
        } else {
            System.out.println("The interned strings are different.");
        }
	}

}
