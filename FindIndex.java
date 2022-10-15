package Array;

public class FindIndex {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,9};
		int num=1;
		
		for (int i = 0; i < a.length; i++) 
		{
		
			if(a[i]==num)
				System.out.println(i);
		}
	}

}
