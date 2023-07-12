package double1;
import java.util.Scanner;
public class Double {
	public static int doubleNumber(int num)
	{
	return num*2;
	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println(doubleNumber(num));
		//System.out.println(res);
	}

 }
