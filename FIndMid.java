package Array;

public class FIndMid {

	public static void main(String[] args) {
	
		int a[]= {3,1,2,4,5,7,8,10};
		int min=0;
		int num=7;
		int max=a.length-1;
		
		while(true) {
		int mid=(max+min)/2;
		
		if(a[mid]==num) {
			System.out.println(mid);
		break;
		}
		else if(num>a[mid])
		{
			min=mid+1;
		}
		else
		{
			max=mid-1;
		}
		}
	}

}
