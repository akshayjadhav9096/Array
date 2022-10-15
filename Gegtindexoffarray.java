package Array;

public class Gegtindexoffarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int num=3;
		int count=0;
		for (int i = 0; i < a.length; i++){
			if(a[i]==num) {
				count++;
				System.out.println(i);
		}}
		if(count==0)
				System.out.println("not found");
			
				
		
		

	}

}
