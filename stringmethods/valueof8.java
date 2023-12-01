package stringmethods;

import java.util.Scanner;

public class valueof8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        String numstr=sc.next();
		Integer number = Integer.valueOf(numstr);
        System.out.println("Converted Integer: " + number);
	
	}

}
