package edu.dsa.chap2;

public class SortedArrayCheck {
	
	public static int isSortedArray(int index,int a[]){
		System.out.println(a[index-1]+" : "+a[index-2]);
		if(a.length==1 )return 1;
		else{
			return(a[index-1]<=a[index-2])?0:isSortedArray(index-1,a);
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr={1,2,0,3,4};
		System.out.println(isSortedArray(5, arr));
	}

}
