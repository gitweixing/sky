package factory;

import java.math.BigDecimal;


/**  
* @ClassName: Multiply  
* @Description: 乘法
* @author weixing  
* @date 2018年5月23日  
*    
*/  
public class Multiply extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result=new BigDecimal(0);
		result=this.getNumberA().multiply(this.getNumberB());
		return result;
	}
	
	

}
