package basic;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int base=3, exponent=4;
long result=1;
while (exponent!=0) {
	result*=base;
	--exponent;
}
System.out.println("Answer="+ result);
	}

}
