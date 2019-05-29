package Basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int n= scn.nextInt();
		int flag=1;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=0;
				break;
			}
		}if(flag==1){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
		
		
	}
	
	
	

}
