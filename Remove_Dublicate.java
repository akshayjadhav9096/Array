package Array;

public class Remove_Dublicate {

	public static void main(String[] args) {
		
		
		int a[]= {1,1,2,2,2,2,3,3,3,3,4,4,4};
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			
			for (int j = i+1; j < a.length; j++)
			{
			if(a[i]==a[j])	
				count++;
			}
			if(count==0)
				System.out.println(a[i]);
		}

	}

}
