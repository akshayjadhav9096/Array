package Array;

import java.util.Iterator;

public class Transperoffarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,8,9};
		int b[]= new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
	

	}

}
