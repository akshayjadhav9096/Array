package Array;

public class Secondlarg {

	public static void main(String[] args) {
		
		int a[]= {1,22,33,44,11,77,44,8,9};
		
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

