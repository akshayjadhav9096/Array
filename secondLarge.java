package Array;

public class secondLarge {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,6,7,7,77,88};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			}
		}
		System.out.println(a[a.length-2]);
	}

}
