package Array;

public class oneforLopassending {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,1,2,8,9,10};
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(j<a.length&&a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(j<a.length) {
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
