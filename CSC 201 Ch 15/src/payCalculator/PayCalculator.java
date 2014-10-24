package payCalculator;
import java.math.BigDecimal;


public abstract class PayCalculator {
	private double hour;
	protected BigDecimal payRate = new BigDecimal(0);
	public PayCalculator(BigDecimal payRate)
	{
		this.payRate=payRate;
	}
	
	abstract BigDecimal computePay(double hour);

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public BigDecimal getPayRate() {
		return payRate;
	}

	public void setPayRate(BigDecimal payRate) {
		this.payRate = payRate;
	}
}
