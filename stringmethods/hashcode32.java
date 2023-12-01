package stringmethods;

import java.util.Scanner;

public class hashcode32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        int hashCode1=str1.hashCode();
        int hashCode2=str2.hashCode();
        System.out.println("Hash code for the first string: " + hashCode1);
        System.out.println("Hash code for the second string: " + hashCode2);

	}

}
