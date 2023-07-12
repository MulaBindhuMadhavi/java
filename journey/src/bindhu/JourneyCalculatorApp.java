package bindhu;

import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		System.out.println(jc.CalculateDistance(speed,time));
		scan.close();
	}
}
