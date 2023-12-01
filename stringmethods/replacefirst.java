package stringmethods;
import java.util.Scanner;
public class replacefirst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter words: ");
        String words=sc.nextLine();
		String newText = words.replaceFirst("a", "i");
        System.out.println("Original Text: " + words);
        System.out.println("Modified Text: " + newText);
	}

}
