package Basics;

import java.util.Scanner;

public class AddEvenNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int a  = scn.nextInt();
		int b  = scn.nextInt();
		int sum = 0;
		for(int i =a;i<=b;i++){
			if(i%3==0 && i%2==0){
				sum = sum + i;

			}
			System.out.println(sum);

		}

	}
}

