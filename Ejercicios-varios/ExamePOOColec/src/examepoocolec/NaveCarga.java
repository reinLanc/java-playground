/*
 *  NaveCarga hereda de Vehiculo.
*  Es un vehículo de transporte: eficiente pero no combativo.
*  No sobreescribe prepararMision() porque no tiene escudos que activar.
 *
 */
package examepoocolec;

/**
 *
 * @author Reinaldo Gil
 */
public class NaveCarga extends Vehiculo {

    // Atributo propio de NaveCarga (no está en la clase padre)
    private int capacidadeCarga;

    // Constructor: llama al constructor del padre con super() y añade capacidadeCarga
    public NaveCarga(String matricula, String modelo, double nivelCombustible, int capacidadeCarga) {
        super(matricula, modelo, nivelCombustible); // Inicializa atributos heredados
        this.capacidadeCarga = capacidadeCarga;
    }

    // Implementación obligatoria del método abstracto viaxar()
    // Una nave de carga consume 1 unidad de combustible por km
    @Override
    public void viaxar(double distancia) {
        double combustibleConsumido = distancia * 1; // 1 unidad/km
        setNivelCombustible(getNivelCombustible() - combustibleConsumido);

        // Muestra: tipo de nave, modelo y combustible restante tras el viaje
        System.out.println("Tipo: Nave de Carga | Modelo: " + getModelo()
                + " | Combustible restante: " + getNivelCombustible() + " unidades");
    }

    // Getter y setter de capacidadeCarga
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
