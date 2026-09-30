package sistemagestionempleados;

/**
 *
 * @author Reinaldo Gil
 */
public interface Empleable {
       /**
     * Calcula el salario bruto del empleado
     * @return Salario bruto mensual
     */
    double calcularSalarioBruto();
    
    /**
     * Calcula el salario neto después de impuestos
     * @return Salario neto mensual
     */
    double calcularSalarioNeto();
    
    /**
     * Obtiene información completa del empleado
     * @return String con datos del empleado
     */
    String obtenerInformacion();
    
    /**
     * Obtiene el nombre del empleado
     * @return Nombre del empleado
     */
    String getNombre();
    
    /**
     * Obtiene el ID del empleado
     * @return ID único del empleado
     */
    int getId();
}
