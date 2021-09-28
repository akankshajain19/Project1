package Ass2;
import java.util.Scanner;
//Write a program in java to find the sum of the even and odd digits of the number which is given as input.
public class Even_odd {

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = String.valueOf(n).length();
		int even=0,odd=0;
		for(int i=0;i<=l;i++) {
			int r =n%10;
			if(r%2==0) {
				even = even+r;
				n=n/10;
			}
			else {
				odd=odd+r;
				n=n/10;
			}
		}
		System.out.println("Sum of even: "+even);
		System.out.println("Sum of odd number: "+odd);
		sc.close();
	}

}
