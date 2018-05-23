package factory;

import java.math.BigDecimal;

public class Calculate {
	private BigDecimal numberA;
	private BigDecimal numberB;
	public BigDecimal getNumberA() {
		return numberA;
	}
	public void setNumberA(BigDecimal numberA) {
		this.numberA = numberA;
	}
	public BigDecimal getNumberB() {
		return numberB;
	}
	public void setNumberB(BigDecimal numberB) {
		this.numberB = numberB;
	}
	
	public BigDecimal getCalculate() {
		
		BigDecimal result=new BigDecimal(0);
		return result;
	}
	
}
