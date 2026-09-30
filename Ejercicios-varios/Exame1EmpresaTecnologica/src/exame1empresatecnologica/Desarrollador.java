/*
 * PREGUNTA 3 - CLASE DESARROLLADOR
 * 
 * Tipo de empleado: Desarrollador
 * Características:
 * - Trabaja en proyectos pero NO los gestiona
 * - No tiene lista de proyectos
 * - No recibe bonus por gestión de proyectos
 */
package exame1empresatecnologica;

/**
 *
 * @author Reinaldo Gil
 */
public class Desarrollador extends Empleado {

    /**
     * Constructor de Desarrollador
     */
    public Desarrollador(String nombre, double salarioBase) {
        super(nombre, salarioBase, TipoEmpleado.DESARROLLADOR);
    }

    /* NO SOBRESCRIBE agregarProyecto() 
     * 
     * IMPORTANTE: Esta clase NO sobrescribe el método agregarProyecto()
     * 
     * CONSECUENCIA:
     * Cuando se llama a desarrollador.agregarProyecto(proyecto), se ejecuta
     * la implementación VACÍA de la clase base Empleado.
     * 
     * RAZÓN:
     * Los desarrolladores trabajan EN proyectos, pero NO los gestionan.
     * Por tanto, no necesitan mantener una lista de proyectos.
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. En Proyecto.asignarEmpleado() se hace:
     *    empleado.agregarProyecto(this);
     * 
     * 2. Si empleado es un Desarrollador:
     *    - Java busca el método agregarProyecto() en Desarrollador
     *    - NO lo encuentra (no está sobrescrito)
     *    - Java sube en la jerarquía a la clase padre Empleado
     *    - Encuentra agregarProyecto() en Empleado
     *    - Ejecuta la implementación vacía (no hace nada)
     * 
     * 3. Resultado: No pasa nada, que es exactamente lo que queremos


    // PREGUNTA 4 - IMPLEMENTACIÓN DE evaluar() */
    @Override
    public String evaluar() {
        return "Desarrollador: " + getNombre()
                + " (ID: " + getIdentificador() + ")"
                + " - Salario: " + String.format("%.2f€", getSalarioNeto());
    }

    /* NOTA ADICIONAL SOBRE HERENCIA 
     * 
     * Esta clase Desarrollador es un ejemplo perfecto de cómo la herencia
     * y el polimorfismo simplifican el código.
     * 
     * LO QUE HEREDA DE EMPLEADO:
     * --------------------------
     *  Todos los campos (identificador, nombre, salarioBase, tipo, bonus)
     *  Todos los getters y setters
     *  getCategoriaSalarial()
     *  getSalarioNeto()
     *  agregarProyecto() - IMPLEMENTACIÓN VACÍA (esto es clave)
     *  toString()
     * 
     * LO QUE SOBRESCRIBE:
     *  evaluar() - Implementación específica para Desarrollador
     * 
     * LO QUE AÑADE:
     * (Nada adicional en este caso - es una clase simple)
     * 
     * RESULTADO:
     * Una clase muy simple y limpia que reutiliza todo el código de la
     * clase base y solo añade/modifica lo específico.
     * 
     * Esto es el PRINCIPIO DRY (Don't Repeat Yourself) en acción. */
}
