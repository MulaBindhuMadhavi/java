package financecalculator;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		FinanceCalculator calculator=new FinanceCalculator();
		System.out.println(calculator.CalculateSimpleInterest(1000.0,0.05,2.0));

	}

}
