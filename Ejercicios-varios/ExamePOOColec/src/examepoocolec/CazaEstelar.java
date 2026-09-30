/*
* CazaEstelar hereda de Vehiculo E implementa la interfaz Combativo.
* Al implementar Combativo, está obligada a definir el método activarEscudos().
 */
package examepoocolec;

/**
 *
 * @author Reinaldo Gil
 */
public class CazaEstelar extends Vehiculo implements Combativo {

    // Constructor: solo necesita los atributos de la clase padre (no tiene extras)
    public CazaEstelar(String matricula, String modelo, double nivelCombustible) {
        super(matricula, modelo, nivelCombustible); // Inicializa atributos heredados
    }

    // Implementación de viaxar() para CazaEstelar
    // Un caza de combate consume 2 unidades de combustible por km
    @Override
    public void viaxar(double distancia) {
        double combustibleConsumido = distancia * 2; // 2 unidades/km
        setNivelCombustible(getNivelCombustible() - combustibleConsumido);

        // Muestra: tipo de nave, modelo y combustible restante tras el viaje
        System.out.println("Tipo: Nave de Combate | Modelo: " + getModelo()
                + " | Combustible restante: " + getNivelCombustible() + " unidades");
    }

    // Implementación del método de la interfaz Combativo
    // Muestra un mensaje indicando que los escudos están al 100%
    @Override
    public void activarEscudos() {
        System.out.println("Escudos de energia de " + getModelo() + " activados al 100%.");
    }

    /* Sobreescribimos prepararMision() del padre (que estaba vacío).
     Ahora sí hace algo: activa los escudos antes de viajar.
     Gracias a esto, el Main puede llamar a prepararMision() en todos los
     vehículos sin necesidad de saber si son Combativos o no (sin instanceof).*/
    @Override
    public void prepararMision() {
        activarEscudos();
    }
}
