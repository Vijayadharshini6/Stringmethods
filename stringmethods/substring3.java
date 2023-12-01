package stringmethods;

import java.util.Scanner;

public class substring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String letters=text.substring(0,2);
        System.out.println("After substring: "+letters);
	}

}
