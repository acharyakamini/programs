package Basics;

import java.util.Scanner;

public class CompareBiggestNos {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int i = scn.nextInt();
		System.out.println("Enter 2nd num");
		int j = scn.nextInt();
		if(i>j){
			System.out.println("i+"+ "is bigger");
		}else if(j>i){
			System.out.println("j="+ "is bigger");
		}else{
			System.out.println( "i and j are same");
		}
		
		
	}
	

}
