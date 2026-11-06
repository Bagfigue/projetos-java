package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		return salarioBruto - imposto;
	}
	
	public double aumentoSalario (double porcentagem) {
		return salarioBruto += salarioBruto * (porcentagem/100);
	}
	
	public String toString() {
		return nome + ", rebece: " + String.format("%.2f", salarioLiquido());
	}
	
}
