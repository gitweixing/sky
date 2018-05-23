 package factory;

import java.math.BigDecimal;


/**  
* @ClassName: Subtraction  
* @Description: 减法 
* @author weixing  
* @date 2018年5月23日  
*    
*/  
public class Subtraction extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result = new BigDecimal(0);
		result=this.getNumberA().subtract(this.getNumberB());
		return result;
	}
 
	
} 