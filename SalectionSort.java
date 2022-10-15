package Array;

public class SalectionSort {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,3,1,0};
		for (int i = 0; i < a.length-1; i++) 
		{
			int smal=i;
			for (int j = i+1; j < a.length; j++) 
			{
			if(a[smal]>a[j]) {
				smal=j;
			}
			int temp=a[smal];
			a[smal]=a[i];
			a[i]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
