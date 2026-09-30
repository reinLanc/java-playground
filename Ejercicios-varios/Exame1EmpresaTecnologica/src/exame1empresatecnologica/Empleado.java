/*
 * PREGUNTA 1 - CLASE EMPLEADO (CLASE BASE)
 * 
 * Esta es la clase base abstracta de la que heredan:
 * - Desarrollador
 * - JefeProyecto  
 * - Becario
 */
package exame1empresatecnologica;

/**
 *
 * @author Reinaldo Gil
 */
public abstract class Empleado {

    // PREGUNTA 1 - CAMPOS DEL EMPLEADO 
    // 1.a - Identificador automático secuencial
    private int identificador;
    private static int contadorId = 1;

    // 1.b - Nombre obligatorio
    private String nombre;

    // 1.c - Salario base
    private double salarioBase;

    // Pregunta 3 - Tipo de empleado
    private TipoEmpleado tipo;

    // Pregunta 3 - Bonus para jefes
    protected double bonus;

    // Enumeración de tipos
    public enum TipoEmpleado {
        DESARROLLADOR,
        JEFE_PROYECTO,
        BECARIO
    }

    /**
     * Constructor de Empleado
     */
    public Empleado(String nombre, double salarioBase, TipoEmpleado tipo) {
        this.identificador = contadorId++;
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.tipo = tipo;
        this.bonus = 0.0;
    }

    // GETTERS Y SETTERS
    public int getIdentificador() {
        return identificador;
    }

    // NO hay setter para identificador (no puede cambiarse)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // PREGUNTA 1.c - CATEGORÍA SALARIAL
    public String getCategoriaSalarial() {
        if (salarioBase < 1500) {
            return "baja";
        } else if (salarioBase >= 1500 && salarioBase <= 2500) {
            return "media";
        } else {
            return "alta";
        }
    }

    // PREGUNTA 1.d - SALARIO NETO 
    public double getSalarioNeto() {
        double porcentajeRetencion;
        String categoria = getCategoriaSalarial();

        switch (categoria) {
            case "baja":
                porcentajeRetencion = 0.05;
                break;
            case "media":
                porcentajeRetencion = 0.12;
                break;
            case "alta":
                porcentajeRetencion = 0.20;
                break;
            default:
                porcentajeRetencion = 0.0;
        }

        double retencion = salarioBase * porcentajeRetencion;
        return salarioBase - retencion + bonus;
    }

    /* NUEVO MÉTODO POLIMÓRFICO
     * 
     * PREGUNTA 2.b - MÉTODO PARA AÑADIR PROYECTO A LA LISTA DEL EMPLEADO
     * 
     * Este método es la CLAVE para eliminar el uso de instanceof en Proyecto.
     * 
     * CONCEPTO:
     * En lugar de que la clase Proyecto pregunte "¿eres un JefeProyecto?"
     * mediante instanceof, ahora Proyecto simplemente llama a este método
     * en TODOS los empleados:
     * 
     *     empleado.agregarProyecto(this);
     * 
     * Y cada tipo de empleado decide qué hacer:
     * 
     * - Empleado (clase base): NO HACE NADA (implementación vacía)
     *   Porque la mayoría de empleados no gestionan proyectos
     * 
     * - Desarrollador: HEREDA la implementación vacía
     *   No sobrescribe el método
     *    No hace nada cuando se le asigna a un proyecto
     *    Comportamiento correcto: los desarrolladores trabajan en proyectos
     *      pero no los gestionan
     * 
     * - Becario: HEREDA la implementación vacía  
     *    No sobrescribe el método
     *    No hace nada cuando se le asigna a un proyecto
     *   Comportamiento correcto: los becarios trabajan en proyectos
     *    pero no los gestionan
     * 
     * - JefeProyecto: SOBRESCRIBE el método con su propia lógica
     *    Añade el proyecto a su ArrayList<Proyecto> proyectosGestionados
     *    Aplica bonus si gestiona más de 3 proyectos
     *    Comportamiento correcto: los jefes SÍ gestionan proyectos
     * 
     * VENTAJA PRINCIPAL:
    
     * La clase Proyecto NO necesita saber qué tipo específico de empleado es.
     * Solo llama a agregarProyecto() y cada empleado hace lo que le corresponde.
     * 
     * Esto es POLIMORFISMO en su forma más pura.
     * 
  
     * Método para añadir un proyecto a la lista del empleado.
     *
     * IMPLEMENTACIÓN POR DEFECTO: No hace nada
     *
     * Razón: La mayoría de empleados (Desarrollador, Becario) no gestionan
     * proyectos, solo trabajan en ellos. Por tanto, la implementación por
     * defecto es vacía.
     *
     * Solo los empleados que SÍ gestionan proyectos (como JefeProyecto)
     * sobrescribirán este método con su propia lógica.
     *
     * @param proyecto el proyecto a añadir (si aplica)
     */
    public void agregarProyecto(Proyecto proyecto) {
        // IMPLEMENTACIÓN VACÍA POR DEFECTO 
        // 
        // No hace nada. Esto es intencional.
        // 
        // Los Desarrolladores y Becarios heredarán esta implementación vacía,
        // lo cual es correcto porque ellos no mantienen una lista de proyectos.
        // 
        // Solo JefeProyecto sobrescribirá este método para añadir el proyecto
        // a su ArrayList<Proyecto> proyectosGestionados.
        //
        // NOTA: También se podría hacer este método abstracto, obligando a todas
        // las subclases a implementarlo. Pero eso forzaría a Desarrollador y Becario
        // a escribir un método vacío explícitamente, lo cual es redundante.
        // Esta implementación vacía por defecto es más elegante.
    }

    //  PREGUNTA 4 - MÉTODO evaluar() 
    public abstract String evaluar();

    //  PREGUNTA 5 - toString() 
    @Override
    public String toString() {
        String tipoStr;
        switch (tipo) {
            case DESARROLLADOR:
                tipoStr = "Desarrollador";
                break;
            case JEFE_PROYECTO:
                tipoStr = "Jefe de Proyecto";
                break;
            case BECARIO:
                tipoStr = "Becario";
                break;
            default:
                tipoStr = "Desconocido";
        }

        return String.format("%s - Código: %d - Nombre: %s - Salario Neto: %.2f€",
                tipoStr, identificador, nombre, getSalarioNeto());
    }
}
