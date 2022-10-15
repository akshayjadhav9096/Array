package Array;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		if(a.length==b.length)
		{
			for (int i = 0; i < b.length; i++)
			{
				
				if(a[i]!=b[i])
				count++;
			}
				if(count==0)
					System.out.println("equal");
				
				else
					System.out.println("not same");	
		}
		else
		System.out.println("length not same");
	}

}
