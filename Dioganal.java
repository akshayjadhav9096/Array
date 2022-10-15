package Array;

public class Dioganal {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{5,7,8}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(j-i==0||j+i==2)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(" ");
			}
			System.out.println ();

		}
		
	}

}
