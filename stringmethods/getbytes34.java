package stringmethods;

import java.nio.charset.Charset;
import java.util.Scanner;

public class getbytes34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str=sc.nextLine();
	        System.out.print("Enter a character : ");
	        String charsetName=sc.nextLine();
	        byte[] byteArray=str.getBytes(Charset.forName(charsetName));
	        System.out.print("Encoded bytes: ");
	        for (byte b : byteArray) {
	            System.out.print(b + " ");
	        }
	}

}
