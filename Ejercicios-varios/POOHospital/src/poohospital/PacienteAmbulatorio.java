/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poohospital;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 3a: paciente que no ocupa cama; agrega tarifa base de consulta
abstract class PacienteAmbulatorio extends Paciente {
    protected double tarifaConsulta;

    public PacienteAmbulatorio(String nombre, int edad,
                               String historial, int gravedad,
                               double tarifaConsulta) {
        super(nombre, edad, historial, gravedad);
        this.tarifaConsulta = tarifaConsulta;
    }

    @Override
    public String getTipoAtencion() { return "Ambulatorio"; }
}

