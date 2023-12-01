package stringmethods;

import java.util.Scanner;

public class split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter words: ");
		String words=sc.nextLine();		
		String[] splits = words.split(" ");	
		System.out.println("After split: ");
		for(String receive : splits) {
        System.out.println(receive);
		}
	}

}
