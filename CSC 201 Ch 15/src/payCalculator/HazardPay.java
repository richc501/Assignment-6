package payCalculator;

import java.math.BigDecimal;

public class HazardPay extends PayCalculator{

	public HazardPay(BigDecimal payRate) {
		super(payRate);
	}

	@Override
	BigDecimal computePay(double hour) {
		return payRate.multiply(new BigDecimal(1.5).multiply(new BigDecimal(hour)));
	}
	
	@Override
	public String toString() {
		return "HazardPay [payRate=" + payRate + "]";
	}
	
}
