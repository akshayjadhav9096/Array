package Array;

public class Min {

	public static void main(String[] args) {
		
		int a[]= {4,3,2,1,6,7,8,9};
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<min)
			min=a[i];
			
		}
		System.out.println(min);
	}

}
