package basic;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
Double num1,num2,result;
Scanner input=new Scanner(System.in);
System.out.println("Choose an operator:+,-,*,or /");
operator=input.next().charAt(0);
System.out.println("Enter first num");
num1=input.nextDouble();
System.out.println("Enter second num");
num2=input.nextDouble();
switch (operator) {
case'+':
	result=num1+num2;
	System.out.println(num1+"+"+num2+"="+result);
	break;
case'-':
	result=num1-num2;
	System.out.println(num1+"-"+num2+"="+result);
	break;
case'*':
	result=num1*num2;
	System.out.println(num1+"*"+num2+"="+result);
	break;
case'/':
	result=num1/num2;
	System.out.println(num1+"/"+num2+"="+result);
	break;
	default:
		System.out.println("Invalid operator!");
		break;
}
input.close();
	}

}
