package Basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
	public static void main(String[] args){
		String[] str = {"java","selenium","kamini","python","java"};
		Set<String> set = new HashSet<String>();
		for(String store : str){
			if(set.add(store) ==false){
				System.out.println(store);

			}

		}
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		
	}

}
