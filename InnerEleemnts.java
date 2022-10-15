package Array;

public class InnerEleemnts {

	public static void main(String[] args) {
	
		int a[][]= {{1,2,3,4},
					{1,2,3,4},
					{1,2,3,4},
					{1,2,3,4,}
		};
		
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = 0; j < a[i].length; j++) 
		{
			if(i!=0&&j!=0&&j!=3&&i!=3)
				System.out.print(a[i][j]);
				
		}	
		System.out.println();
		}

	}

}
