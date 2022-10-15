package Array;

public class CountOfElememt {

	public static void main(String[] args) {
		int a[]= {1,2,2,2,2,2,2,2,2,2,3,4,5,6,7,8};
		int num=2;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				count++;
			
		}
		System.out.println(count);

	}

}
