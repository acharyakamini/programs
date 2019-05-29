package Basics;

public class SortingArray {

	public static void main(String[] args) {
		int[] a = {3,10,1,5,2};
		for(int i : a ){
			System.out.println(i);
		}
		int temp=0;
		for(int i = 0;i<=a.length-2;i++){
			for(int j =0; j <=a.length-2;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println("after sorting");
		for(int i : a){
			System.out.println(i);
	}

}

}
