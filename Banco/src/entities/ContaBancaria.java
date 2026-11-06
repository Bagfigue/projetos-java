package entities;

public class ContaBancaria {

	private String titular;
	private double numeroConta;
	private double saldo;
	
	
	public ContaBancaria () {
	}
	
	public ContaBancaria(String titular, double numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		
	}
	
	public ContaBancaria(String titular, double numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;		
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getNumeroConta() {
		return numeroConta;
	}
	
	public double Deposito (double deposito) {
		return saldo += deposito;
	}
	
	public double Saque (double saque) {
		return saldo -= saque + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ numeroConta
				+ ", titular: "
				+ titular
				+ ", saldo: $ "
				+ saldo;
					
	}
}
