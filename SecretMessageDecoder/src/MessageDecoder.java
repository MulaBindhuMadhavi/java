import java.util.Scanner;
public class MessageDecoder {
	public int decodeCharacter(char ch)
	{
		return (int)ch;
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		MessageDecoder md=new MessageDecoder();
		System.out.println(md.decodeCharacter(ch));
		
	}
}
