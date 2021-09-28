package Ass2;
import java.util.Scanner;
//Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.
public class Ascii_value {

	public static void main(String[] args) {
			System.out.println("Enter any value from 0 to 255:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			char c = (char)a;
			System.out.println("Equivalent Character of "+a+" is " +c);			
			sc.close();

	}

}
