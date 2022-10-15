package Array;

public class Assi_2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		for (int i = 0; i < a.length/2; i++)
		{
			a[i]=a[i]+a[a.length-i-1];
			a[i]=a[i]-a[a.length-i-1];
			a[a.length-i-1]=a[i]-a[a.length-1-i];
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
			
		}

	}

}
