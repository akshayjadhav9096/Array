package Array;

public class Find_max {

	public static void main(String[] args) {
		int a[]= {4,2,1,55,6,66,7,88,99};
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
