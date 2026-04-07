/*
 * PREGUNTA 3 - CLASE BECARIO
 * 
 * Tipo de empleado: Becario
 * Características especiales:
 * - Trabaja en proyectos pero NO los gestiona
 * - Tiene un campo adicional: horasFormacion
 * - No recibe bonus por gestión de proyectos
 */
package exame1empresatecnologica;

/**
 *
 * @author Reinaldo Gil
 */
public class Becario extends Empleado {

    // CAMPOS ESPECÍFICOS DE BECARIO
    // Pregunta 3 - "Los becarios tienen un campo más que representa 
    //              el número de horas que deben recibir de formación"
    private int horasFormacion;

    /**
     * Constructor de Becario
     */
    public Becario(String nombre, double salarioBase) {
        super(nombre, salarioBase, TipoEmpleado.BECARIO);
        this.horasFormacion = 0; // Por defecto, 0 horas
    }

    /*  IGUAL QUE DESARROLLADOR - NO SOBRESCRIBE
     * 
     * Al igual que Desarrollador, Becario NO sobrescribe agregarProyecto()
     * 
     * COMPORTAMIENTO:
     * Cuando se llama a becario.agregarProyecto(proyecto):
     * - Se ejecuta la implementación vacía heredada de Empleado
     * - No pasa nada (comportamiento correcto)
     * 
     * RAZÓN:
     * Los becarios trabajan EN proyectos para aprender, pero NO los gestionan.
     * No necesitan lista de proyectos.
     * 
     * POLIMORFISMO EN ACCIÓN:
     * Proyecto.asignarEmpleado() llama a: empleado.agregarProyecto(this)
     * 
     * Si empleado es:
     * - Desarrollador -> ejecuta método vacío de Empleado -> no hace nada ?
     * - Becario       -> ejecuta método vacío de Empleado -> no hace nada ?
     * - JefeProyecto  -> ejecuta método sobrescrito -> añade a lista ?
     * 
     * Cada uno hace exactamente lo que debe hacer, sin que Proyecto
     * tenga que preguntar "¿qué tipo eres?" con instanceof.
     * 
     * CÓDIGO QUE NO ESCRIBIMOS (porque ya lo heredamos):
     * ---------------------------------------------------
     * @Override
     * public void agregarProyecto(Proyecto proyecto) {
     *     // Vacío - los becarios no gestionan proyectos
     * }
     * 
    // GETTERS Y SETTERS ESPECÍFICOS 
    /**
     * Obtener las horas de formación del becario
     */
    public int getHorasFormacion() {
        return horasFormacion;
    }

    /**
     * Establecer las horas de formación del becario
     */
    public void setHorasFormacion(int horasFormacion) {
        if (horasFormacion < 0) {
            System.out.println("ADVERTENCIA: Las horas de formación no pueden ser negativas");
            this.horasFormacion = 0;
        } else {
            this.horasFormacion = horasFormacion;
            System.out.println("Horas de formación de " + getNombre()
                    + " establecidas en: " + horasFormacion + "h");
        }
    }

    //  PREGUNTA 4 - IMPLEMENTACIÓN DE evaluar() 
    @Override
    public String evaluar() {
        return "Becario: " + getNombre()
                + " (ID: " + getIdentificador() + ")"
                + " - Horas de formación: " + horasFormacion + "h"
                + " - Salario: " + String.format("%.2f€", getSalarioNeto());
    }

    // SOBRESCRITURA DE toString() PARA INCLUIR HORAS
    /**
     * Sobrescribimos toString() para mostrar también las horas de formación
     */
    @Override
    public String toString() {
        // Llamamos al toString() de la clase base y añadimos las horas
        return super.toString() + " - Formación: " + horasFormacion + "h";
    }

    /* RESUMEN DE LA CLASE BECARIO 
     * 
     * CARACTERÍSTICAS DE ESTA CLASE:
     * 
     * 1. HEREDA de Empleado:
     *    Todos los campos básicos (id, nombre, salario, etc.)
     *     Métodos de categoría salarial y salario neto
     *     agregarProyecto() VACÍO (no gestiona proyectos)
     * 
     * 2. AÑADE campos específicos:
     *     horasFormacion (requisito del enunciado)
     * 
     * 3. SOBRESCRIBE métodos:
     *     evaluar() - implementación específica
     *     toString() - añade información de horas de formación
     * 
     * 4. NO SOBRESCRIBE:
     *     agregarProyecto() - usa implementación vacía heredada
     *    (esto es INTENCIONAL y CORRECTO)*/
}
