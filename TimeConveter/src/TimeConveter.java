import java.util.Scanner;
public class TimeConveter {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a minutes");
		float minutes=scan.nextFloat();
		System.out.println(ConvertToHours(minutes));
		
	}
	public static double ConvertToHours(float minutes)
	{
		return minutes/60;
	}

}
