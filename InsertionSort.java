package Array;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[]= {4,2,6,7,1,0,3};
		for (int i = 1; i < a.length; i++) 
		{
			int current=a[i];
			int j=i-1;
			
			while(j>=0&&current<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
 			a[j+1]=current;
		}
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[i]);	
		}
	}
}
