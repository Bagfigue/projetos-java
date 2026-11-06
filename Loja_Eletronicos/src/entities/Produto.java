package entities;

public class Produto {
	private String marca;
	private String modelo;
	private double preco;
	private int id;
	
	public Produto(String marca, String modelo, double preco, int id) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return marca + " " + modelo + " - R$ " + preco;
	}
		

}
