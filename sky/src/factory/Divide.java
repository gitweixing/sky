package factory;

import java.math.BigDecimal;

/**  
* @Author weixng 
* @Time 2018��5��23�� ����1:22:31  
* @Version 1.0 
* <p>Description:</p> ����
*/
public class Divide extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result =new BigDecimal(0);
		result=this.getNumberA().divide(this.getNumberB());
		return result;
	}

	
	
}
