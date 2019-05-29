package Basics;

public class SwapUsing3rdVariable {
	public static void main(String[] args){
		char c = 'a';
		char d = 'b';
		char e = c ;
		c= d;
		d= e;

		System.out.println("c="+ c);
		System.out.println("d="+ d);
	}
}
