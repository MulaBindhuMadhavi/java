import java.util.Scanner;
public class HalveIt {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		double num=scan.nextDouble();
		System.out.printf("%.2f",HalveTheNumber(num));
		scan.close();

	}
	public static double HalveTheNumber(double num)
	{
		return num/2;
	}

}
