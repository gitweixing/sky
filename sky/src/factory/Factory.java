package factory;

import java.math.BigDecimal;
import java.util.Scanner;


/**  
* @ClassName: Factory  
* @Description: ���������ģʽ 
* @author weixing  
* @date 2018��5��23��  
*    
*/  
public class Factory {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����:");
		BigDecimal numberA=sc.nextBigDecimal();
		System.out.println("�������������:");
		String symbol=sc.next();
		System.out.println("������ڶ�����:");
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
			System.out.println("δ֪�������");
			break;
		}
		return calculate;
		
	}
	
	

}
