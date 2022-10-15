package Array;

public class RemoveOneelement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,98};
		int num=98;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
			{
				a[i]=0;
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=0)
			System.out.println(a[i]);
		}
	}

}
