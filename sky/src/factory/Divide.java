package factory;

import java.math.BigDecimal;


/**  
* @ClassName: Divide  
* @Description: 除法
* @author weixing  
* @date 2018年5月23日  
*    
*/  
public class Divide extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result =new BigDecimal(0);
		result=this.getNumberA().divide(this.getNumberB());
		return result;
	}

	
	
}
