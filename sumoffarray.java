package Array;

public class sumoffarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,4,6,7,788};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			
		}
			System.out.println(sum);
			double avg=sum/a.length;
			System.out.println(avg);
			
	}

}
