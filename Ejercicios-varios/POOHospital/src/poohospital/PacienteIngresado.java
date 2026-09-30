/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poohospital;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 3b: paciente ingresado; agrega coste diario de cama
abstract class PacienteIngresado extends Paciente {
    protected int    diasIngreso;
    protected double costePorDia;

    public PacienteIngresado(String nombre, int edad,
                             String historial, int gravedad,
                             int dias, double costePorDia) {
        super(nombre, edad, historial, gravedad);
        this.diasIngreso  = dias;
        this.costePorDia  = costePorDia;
    }

    @Override
    public String getTipoAtencion() { return "Ingresado"; }
}
