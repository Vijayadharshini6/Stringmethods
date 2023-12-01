package stringmethods;
import java.util.Scanner;
public class replace12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter words: ");
        String words=sc.nextLine();
		String newText = words.replace("a", "i");
        System.out.println("Original Text: " + words);
        System.out.println("Modified Text: " + newText);
	}
}
