package util;

public class CalculosConversao {
	
	
	public static final double IOF = 0.06;
	
	public static double Conversor( double quantidade, double valorDolar) {
		return quantidade * valorDolar *(1+IOF);
	}

}
