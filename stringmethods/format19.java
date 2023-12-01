package stringmethods;

import java.util.Scanner;

public class format19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Height: ");
        float height=sc.nextFloat();
        String formatStr = String.format("Name: %s, Age: %d, Height: %.2f feet", name, age, height);
        System.out.println(formatStr);
	}

}
