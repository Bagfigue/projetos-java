package entities;

public class Laptop extends Produto {

    private int memoriaRAM;
    private String processador;

    public Laptop(String marca, String modelo, double preco, int id,
                  int memoriaRAM, String processador) {

        super(marca, modelo, preco, id);

        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | RAM: " + memoriaRAM + "GB"
                + " | Processador: " + processador;
    }
}