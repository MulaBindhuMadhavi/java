package Arithamtic1;

public class ArithamticOperation {
	public static int subtractNumber(int num1,int num2)
	{
		//System.out.println("subtractNumber:"+(num1-num2));
		return num1-num2;
	}
	public static int multiplyNumber(int num1,int num2)
	{
		//System.out.println("subtractNumber:"+(num1-num2));
		return num1*num2;
	}
	public static double divideNumber(int num1,int num2)
	{
		//System.out.println("subtractNumber:"+(num1-num2));
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2)
	{
		//System.out.println("subtractNumber:"+(num1-num2));
		return num1%num2;
	}
	public static void main(String[]args)
	{
		int res1=subtractNumber(20,5);
		int res2=multiplyNumber(4,5);
		double res3=divideNumber(20,4);
		int res4=findRemainder(10,3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.printf("%.2f\n" ,res3);
		System.out.println(res4);
	}

}
