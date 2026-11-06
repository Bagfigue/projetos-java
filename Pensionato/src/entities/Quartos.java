package entities;

public class Quartos {
   private String nome;
   private String email;

   
   public String getNome() {
	    return nome;
	}

	public String getEmail() {
	    return email;
	}
	
	
    public Quartos(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}