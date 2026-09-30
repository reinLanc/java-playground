/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaviones;

/**
 *
 * @author Reinaldo Gil
 */
public class Pista {

    private int numero;
    private Avion avionActual;

    public Pista(int numero) {
        this.numero = numero;
        this.avionActual = null;
    }

    public int getNumero() {
        return numero;
    }

    public Avion getAvion() {
        return avionActual;
    }

    public void setAvion(Avion avion) {
        this.avionActual = avion;
    }

    public boolean estaLibre() {
        return avionActual == null;
    }

    @Override
    public String toString() {
        if (estaLibre()) {
            return String.format("Pista %d: Libre", numero);
        } else {
            return String.format("Pista %d: [%s] %s => %s (%d pasajeros)",
                    numero,
                    avionActual.getId(),
                    avionActual.getAerolinea(),
                    avionActual.getDestino(),
                    avionActual.getPasajeros());
        }
    }
}
