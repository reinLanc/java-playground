package examepoocolec;
// Clase abstracta que representa un vehículo genérico de la flota espacial.
// Al ser abstracta, no se puede instanciar directamente: obliga a crear subclases.

public abstract class Vehiculo {

    // Atributos comunes a todos los vehículos
    private String matricula;
    private String modelo;
    private double nivelCombustible;

    // Constructor: inicializa todos los atributos al crear un vehículo
    public Vehiculo(String matricula, String modelo, double nivelCombustible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.nivelCombustible = nivelCombustible;
    }

    // Método abstracto: cada subclase DEBE implementarlo a su manera.
    // Reduce el combustible según el tipo de vehículo.
    public abstract void viaxar(double distancia);

    // Método de preparación antes de cada misión.
    // Por defecto no hace nada: los vehículos normales no necesitan preparación.
    // Las subclases combativas lo sobreescriben para activar escudos.
    // Así evitamos usar instanceof en el Main.
    public void prepararMision() {
        // vacío intencionalmente
    }

    // --- Getters y Setters ---
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(double nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }
}
