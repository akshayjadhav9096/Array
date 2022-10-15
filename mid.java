package Array;

public class mid {

	public static void main(String[] args) {
	
		int a[]= {3,4,5,7,9,1,4};
		int num=5;
		
		int min=0;
		int max=a.length-1;
		
		while(true)
		{
			int mid=(max+min)/2;
			
			if(a[mid]==num) {
				System.out.println(mid);
			break;
			}
			else if(num>a[mid])
				min=mid+1;
			else {
				max=mid-1;		
			}
		}
	}
}
