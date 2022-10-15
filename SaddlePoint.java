package Array;

public class SaddlePoint {

	public static void main(String[] args) {
		
		int a[][]= {
				{6,3,1},
				{5,7,6},
				{9,8,6}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
			boolean rowmaichhota=true;
			for (int k = 0; k < a[i].length; k++)
			{
			int element=a[i][k];
			if(element<a[i][k])
				rowmaichhota=false;
			}
			
			boolean coloummaibada=true;
			for (int k = 0; k < a.length; k++)
			{
				int element=a[k][j];
			      if(element<a[i][j])
			    	  coloummaibada=false;
			}
			if(rowmaichhota==true&&coloummaibada==true)
				System.out.print(a[i][j]);

			
			}
			
		}

		
	}

}
