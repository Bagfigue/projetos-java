package entities;

public class TV extends Produto {

    private int polegadas;
    private boolean smartTV;

    public TV(String marca, String modelo, double preco, int id,
              int polegadas, boolean smartTV) {

        super(marca, modelo, preco, id);

        this.polegadas = polegadas;
        this.smartTV = smartTV;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | " + polegadas + " polegadas"
                + " | SmartTV: " + smartTV;
    }
}