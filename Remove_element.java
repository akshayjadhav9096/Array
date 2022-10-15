package Array;

public class Remove_element {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int num=1;
		int count=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]==num)
			count++;
		
	}
	int b[]= new int[a.length-count];
	int index=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]!=num)
			b[index++]=a[i];
				
	}
	for (int i = 0; i < b.length; i++) 
	{
	System.out.println(b[i]);
	}

	}

}
