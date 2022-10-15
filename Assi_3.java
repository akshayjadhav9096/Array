package Array;

public class Assi_3 {

	public static void main(String[] args) {
		
		int a[]= {1,1,2,3,4,5,6,7,8,9};
		int num=1;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num)
			{
				a[i]=0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			System.out.println(a[i]);
		}
		
		
	}

}
