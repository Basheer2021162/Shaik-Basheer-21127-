package basic;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
boolean isPrime=true;
Scanner scan=new Scanner(System.in);
System.out.println("Enter any num:");
int num=scan.nextInt();
scan.close();
for (int i=2;i<=num/2;i++)
{
	temp=num%i;
	if(temp==0)
	{
		isPrime=false;
		break;
	}
}
if(isPrime)
	System.out.println(num+"is a Prime num");
else
	System.out.println(num+"is not a Prime num");
	}

}
