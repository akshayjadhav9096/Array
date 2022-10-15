package Array;

import java.util.Iterator;

public class one__ {

	public static void main(String[] args) {
		
		int a[]= {2,5,7,8,9,1,3,100,99,11};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			
		}
		

	}

}
