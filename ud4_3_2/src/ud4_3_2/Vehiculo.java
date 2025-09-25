/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4_3_2;

/**
 *
 * @author gilguerei
 */
public class Vehiculo {
     String modelo;
    double potencia;
    boolean cRuedas;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public void ponPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double damePotencia() {
        return potencia;
    }

    public void ponTracción(boolean tracción) {
        cRuedas = tracción;
    }

    public boolean dameTraccion() {
        return cRuedas;
    }

    public String muestraVehículo() {
        if (cRuedas == true) {
            return "Modelo: " + modelo + " Potencia: "
                    + potencia + " Tracción cuatro ruedas";
        } else {
            return "Modelo: " + modelo + " Potencia: "
                    + potencia + " Sin tracción cuatro ruedas";
        }
    }
}
