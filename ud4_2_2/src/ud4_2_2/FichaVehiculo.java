package ud4_2_2;
import java.time.LocalDateTime;
public class FichaVehiculo {

    private String modelo;
    private String matricula;
    private LocalDateTime instanteEntrada;

    FichaVehiculo(String modelo, String matricula, LocalDateTime instanteEntrada) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.instanteEntrada = instanteEntrada;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the instanteEntrada
     */
    public LocalDateTime getInstanteEntrada() {
        return instanteEntrada;
    }

    /**
     * @param instanteEntrada the instanteEntrada to set
     */
    public void setInstanteEntrada(LocalDateTime instanteEntrada) {
        this.instanteEntrada = instanteEntrada;
    }
}
