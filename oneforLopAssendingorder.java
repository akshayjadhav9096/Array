package Array;

public class oneforLopAssendingorder {

	public static void main(String[] args) {
	
		int a[]= {3,1,2,6,8,9,5};
		int j=0;
		for (int i = 0; i < a.length; i++)
		{
				if(j < a.length&&a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(j<a.length)
				{
					j++;i--;
			}
				else
					j=0;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
