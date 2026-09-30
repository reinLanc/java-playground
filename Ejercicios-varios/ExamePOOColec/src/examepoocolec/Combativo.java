/*
* Interfaz que deben implementar los vehículos con capacidades de combate.
* Define el contrato: cualquier clase que implemente Combativo DEBE tener activarEscudos().
 */
package examepoocolec;

/**
 *
 * @author Reinaldo Gil
 */
public interface Combativo {

    // Método que activa los escudos de energía del vehículo de combate
    void activarEscudos();
}
