package temp;
import java.util.Scanner;
public class TemperatureConverterAppp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter f ");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		System.out.printf("%.2f",tc.convertTFahrenheitToCelsius(fahrenheit));
		scan.close();

	}

}
