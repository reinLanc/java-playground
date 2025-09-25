package ud5_1_2;

public class vehiculo {

    public String modelo;
    private double potencia;
    private boolean cRuedas;

    vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public void ponPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public double muestraPotencia() {
        return potencia;
    }

    public void ponTracción(boolean tracción) {
        cRuedas = tracción;
    }

    public boolean dameTraccion() {
        return cRuedas;
    }

    public boolean cRuedas() {

        return cRuedas;

    }

    public String imprimir() {
        if (dameTraccion()) {
            return "Modelo: " + modelo + " Potencia: "
                    + muestraPotencia() + " Tracción cuatro ruedas";
        } else {
            return "Modelo: " + modelo + " Potencia: "
                    + muestraPotencia() + " Sin tracción cuatro ruedas";
        }
    }
}
