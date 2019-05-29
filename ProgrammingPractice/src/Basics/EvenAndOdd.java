package Basics;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = scn.nextInt();
		int r= i%2;
		if(r==0){
			System.out.println(i+"number is even");
		}else{
			System.out.println(i+ "odd");
		}
		
		
		
		
	}

}
