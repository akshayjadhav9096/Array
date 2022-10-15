package Array;

public class Addition_of_two_matrix {

	public static void main(String[] args) {
	
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{8,5,7}};
		
		int b[][]= {
				{5,6,7},
				{9,6,8},
				{4,6,7}};
		
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
