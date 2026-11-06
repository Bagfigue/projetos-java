package entities;

public class Funcionario {
    
    private String nome;
    private String departamento;
    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String departamento, String cargo, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    
}