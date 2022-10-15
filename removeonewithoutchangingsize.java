package Array;

public class removeonewithoutchangingsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int num=8;
		int index=0;
		int []b= new int[a.length-1];
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=num)
			{
				b[index++]=a[i];
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
