package Array;

public class StaticBlock {
	
	static {
		System.out.println("i am in static block 2");
	}

static {
	System.out.println("i am in static block");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main method");
		
		
	}
	static {
		System.out.println("i am in static block");
	}

}
