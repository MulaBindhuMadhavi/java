package string;
import java.util.Scanner;
public class Stringjoin {
	
	public static void main(String[]args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a 2 strings");
		String str1=scan.next();
		String str2=scan.next();
		String res=joinStrings(str1,str2);
	    System.out.println(res);
	}
	public static String joinStrings(String str1, String str2)
	{
	  return str1+str2;
	}

}
