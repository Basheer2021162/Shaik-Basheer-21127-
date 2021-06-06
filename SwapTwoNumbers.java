package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=120,second=220;
		System.out.println("--Before Swap--");
		System.out.println("first num="+first);
		System.out.println("Second num="+second);
		int temporary=first;
		first=second;
		second=temporary;
		System.out.println("--After Swap--");
		System.out.println("First num="+first);
		System.out.println("Second num="+second);
	}

}
