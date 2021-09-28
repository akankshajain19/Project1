package Ass2;
import java.util.*;
//Write a program to print out all Armstrong numbers between 1 and
//500. If sum of cubes of each digit of the number is equal to the
//number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
public class Armstrong_No {

	public static void main(String[] args) {
		
		for(int i=1;i<=500;i++) {
			double sum=0;
			int temp,digit;
			int num=i;
			temp=num;
			while(num!=0) {
				digit = num%10;
				sum = sum+(digit*digit*digit);
				num=num/10;				
			}			
//			int l = String.valueOf(i).length();
//			for(int j=1;j<=l;j++) {
//				digit = num%10;
//				sum = sum+Math.pow(digit, 3);
//				num=num/10;			
//			}
			if(sum==temp)
				System.out.println(sum+" is an armstrong no.");
			}
	}
}



