package Array;

public class transperarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= new int [a.length];
		int index=0;
		for (int i = 0; i < b.length; i++) 
		{
			b[index++]=a[i];
			
		}
		for (int j = 0; j < b.length; j++) {
			
		
		System.out.println(b[j]);
	}
	}
}
