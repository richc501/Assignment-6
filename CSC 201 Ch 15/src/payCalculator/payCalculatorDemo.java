package payCalculator;

import java.math.BigDecimal;

public class payCalculatorDemo {

	public static void main(String[] args) {
		BigDecimal payRate = new BigDecimal(10);
		RegularPay pay1 = new RegularPay(payRate);
		HazardPay pay2 = new HazardPay(payRate);
		System.out.println(pay1.computePay(10));
		System.out.println(pay2.computePay(10));
	}

}
