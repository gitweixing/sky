 package factory;

import java.math.BigDecimal;

/**  
* @ClassName: Subtraction  
* @Description: ����
* @author weixing  
* @date 2018��5��23��  
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