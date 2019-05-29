package Basics;

import java.awt.print.Book;

public class ShiftString {
	public static void main(String[] args){
		int i;
		String s1="abcd";
		String s2= "";
		for(i=0;i>=s1.length();i++){
			s2=s2+s1.charAt(i);
		}
		s2=s2+s1.charAt(0);
		System.out.println(s2);


	}
}
