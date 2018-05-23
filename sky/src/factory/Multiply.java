package factory;

import java.math.BigDecimal;

/**  
* @Author weixng 
* @Time 2018年5月23日 下午1:20:26  
* @Version 1.0 
* <p>Description:</p> 乘法
*/
public class Multiply extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result=new BigDecimal(0);
		result=this.getNumberA().multiply(this.getNumberB());
		return result;
	}
	
	

}
