package Basics;

public class RollingString {
	public static void main(String[] args) {
		String s="abz";
		int i1 = 0;
		int j = s.length();
		char[] ch = s.toCharArray();
		System.out.println("before shift =" + s);
		System.out.println("after shift:");
		for(int i=0;i<ch.length;i++){
			
			
			int x= (int)ch[i];
			int y = (x+1);
			if(y>122){
				ch[i]='a';
			}else {
			ch[i] = (char)y;
			}
			System.out.print(ch[i]);
			
		}
		
		
		
	}

}
