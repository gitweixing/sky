package factory;

import java.math.BigDecimal;

/**  
* @Author weixng 
* @Time 2018��5��23�� ����1:20:26  
* @Version 1.0 
* <p>Description:</p> �˷�
*/
public class Multiply extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result=new BigDecimal(0);
		result=this.getNumberA().multiply(this.getNumberB());
		return result;
	}
	
	

}
