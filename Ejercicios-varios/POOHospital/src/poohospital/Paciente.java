/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poohospital;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 2: todo paciente tiene gravedad (1-10) y debe calcular su coste
// La gravedad se usara como clave del TreeMap para ordenar automaticamente
abstract class Paciente extends Persona {

    protected int gravedad;   // 1 = leve, 10 = critico
    protected String numeroHistorial;

    public Paciente(String nombre, int edad,
            String historial, int gravedad) {
        super(nombre, edad);
        this.numeroHistorial = historial;
        this.gravedad = gravedad;
    }

    // Cada subclase final aplica su propia formula: sin instanceof
    public abstract double calcularCoste();

    // Cada rama intermedia describe el tipo de atencion
    public abstract String getTipoAtencion();

    public int getGravedad() {
        return gravedad;
    }

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public String resumen() {
        return "[" + getTipoAtencion() + "] " + nombre
                + " | Gravedad: " + gravedad
                + " | Coste: " + String.format("%.2f", calcularCoste()) + " EUR";
    }
}
