package payCalculator;
import java.math.BigDecimal;


public class RegularPay extends PayCalculator {

	public RegularPay(BigDecimal payRate) {
		super(payRate);
	}

	@Override
	BigDecimal computePay(double hour) {
		return payRate.multiply(new BigDecimal(hour));
	}

	@Override
	public String toString() {
		return "RegularPay [payRate=" + payRate + "]";
	}

}
