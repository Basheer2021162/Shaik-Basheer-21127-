package basic;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=371,originalnum,remainder,result=0;
originalnum=num;
while (originalnum !=0)
{
	remainder=originalnum%10;
	result+=Math.pow(remainder,3);
	originalnum/=10;
}
if (result == num)
	System.out.println (num + "is an Armstrong num.");
	else
		System.out.println(num + "is not an Armstrong num.");
		
	
	
	
	}

}
