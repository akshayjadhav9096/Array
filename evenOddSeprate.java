package Array;

public class evenOddSeprate {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int evenindex=0;
		for (int i = 0; i < a.length; i++) 
		{
		if(a[i]%2==0)
		{
			System.out.print(a[i]);
			evenindex++;
		}
		}
		System.out.println();
		int b[]= new int [a.length-evenindex];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=0)
				b[index++]=a[i];
				System.out.print(b[i]);
		}

	}

}
