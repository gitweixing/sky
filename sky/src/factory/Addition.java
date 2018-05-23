package factory;

import java.math.BigDecimal;


 
/**  
* @ClassName: Addition  
* @Description: 加法
* @author weixing  
* @date 2018年5月23日  
*    
*/  
public class Addition extends Calculate {

	@Override
	public BigDecimal getCalculate() {
		BigDecimal result=new BigDecimal(0);
		result=super.getNumberA().add(super.getNumberB());
		return result;
	} 
	 
	
}
