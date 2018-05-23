package factory;

import java.math.BigDecimal;

/**  
* @Author weixng 
* @Time 2018年5月23日 下午1:22:31  
* @Version 1.0 
* <p>Description:</p> 除法
*/
public class Divide extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result =new BigDecimal(0);
		result=this.getNumberA().divide(this.getNumberB());
		return result;
	}

	
	
}
