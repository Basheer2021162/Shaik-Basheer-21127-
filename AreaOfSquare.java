package basic;
import java.util.Scanner;
public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of square:");
		Scanner scanner=new Scanner (System.in);
		double side =scanner.nextDouble();
		double area=side*side;
		System.out.println("Area of Square is:"+area);
		scanner.close();

	}

}
