package factory;

import java.math.BigDecimal;


 
/**  
* @ClassName: Addition  
* @Description: �ӷ�
* @author weixing  
* @date 2018��5��23��  
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
