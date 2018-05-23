package factory;

import java.math.BigDecimal;
import java.util.Scanner;



/**  
* @ClassName: Factory  
* @Description: 计算机工厂模式  
* @author weixing  
* @date 2018年5月23日  
*    
*/  
public class Factory {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		BigDecimal numberA=sc.nextBigDecimal();
		System.out.println("请输入运算符号:");
		String symbol=sc.next();
		System.out.println("请输入一个数:");
		BigDecimal numberB=sc.nextBigDecimal();
		
		Calculate calculate=createCalulate(symbol);
		calculate.setNumberA(numberA);
		calculate.setNumberB(numberB);
		BigDecimal result= calculate.getCalculate();
		System.out.println(result);

	}
	public static Calculate createCalulate(String symbol) {
		Calculate calculate=null;
		switch (symbol) {
		case "+":
			calculate=new Addition();
			break;
		case "-":
			calculate=new Subtraction();
			break;
		case "*":
			calculate=new Multiply();
			break;
		case "/":
			calculate=new Divide();
			break;

		default:
			System.out.println("未知运算符！");
			break;
		}
		return calculate;
		
	}
	
	

}
