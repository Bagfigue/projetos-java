package entities;

public class Smartphone extends Produto {

    private int armazenamento;
    private int cameraMP;

    public Smartphone(String marca, String modelo, double preco, int id,
                      int armazenamento, int cameraMP) {

        super(marca, modelo, preco, id);

        this.armazenamento = armazenamento;
        this.cameraMP = cameraMP;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public int getCameraMP() {
        return cameraMP;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Armazenamento: " + armazenamento + "GB"
                + " | Câmera: " + cameraMP + "MP";
    }
}