/*
 * PREGUNTA 3 - CLASE JEFE PROYECTO
 * 
 * Tipo de empleado: Jefe de proyecto
 * Características especiales:
 * - Gestiona múltiples proyectos (tiene lista de proyectos)
 * - Si gestiona más de 3 proyectos, recibe bonus de 500€
 */
package exame1empresatecnologica;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class JefeProyecto extends Empleado {

    // CAMPOS ESPECÍFICOS DE JEFE PROYECTO 
    // Pregunta 2.b - Lista de proyectos que gestiona
    private ArrayList<Proyecto> proyectosGestionados;

    /**
     * Constructor de JefeProyecto
     */
    public JefeProyecto(String nombre, double salarioBase) {
        super(nombre, salarioBase, TipoEmpleado.JEFE_PROYECTO);
        this.proyectosGestionados = new ArrayList<>();
    }

    /* MÉTODO SOBRESCRITO - CLAVE DEL POLIMORFISMO
     * 
     * PREGUNTA 2.b - SOBRESCRITURA DEL MÉTODO agregarProyecto()
     * 
     * Este es el método que hace que el polimorfismo funcione.
     * 
     * CONTEXTO:
     * La clase base Empleado define agregarProyecto() con implementación vacía.
     * Desarrollador y Becario heredan esa implementación vacía (no hacen nada).
     * JefeProyecto SOBRESCRIBE el método con su propia lógica.
     * 
     * FLUJO DE EJECUCIÓN:
     * 1. En Proyecto.asignarEmpleado() se llama a:
     *    empleado.agregarProyecto(this);
     * 
     * 2. Si empleado es un JefeProyecto:
     *    - Java invoca ESTE método (el sobrescrito)
     *    - NO invoca el método vacío de la clase base
     *    - Esto es polimorfismo dinámico (dynamic dispatch)
     * 
     * 3. Este método:
     *    - Añade el proyecto a proyectosGestionados
     *    - Verifica si gestiona más de 3 proyectos
     *    - Si es así, aplica el bonus de 500€
     * 
    /**
     * Sobrescribe el método de la clase base para añadir el proyecto a la lista
     * de proyectos gestionados por este jefe.
     *
     * También aplica el bonus de 500€ si gestiona más de 3 proyectos.
     *
     * @param proyecto el proyecto a añadir
     */
    @Override  // ANOTACIÓN IMPORTANTE: indica que sobrescribe método de clase base
    public void agregarProyecto(Proyecto proyecto) {
        // Verificar que el proyecto no esté ya en la lista
        if (proyectosGestionados.contains(proyecto)) {
            System.out.println("  [INFO] El proyecto '" + proyecto.getNombre()
                    + "' ya está en la lista de " + getNombre());
            return;
        }

        // PREGUNTA 2.b - AÑADIR PROYECTO A LA LISTA 
        proyectosGestionados.add(proyecto);
        System.out.println("  [?] Proyecto '" + proyecto.getNombre()
                + "' añadido a la lista de proyectos gestionados por " + getNombre());

        // PREGUNTA 3 - APLICAR BONUS SI GESTIONA MÁS DE 3 PROYECTOS 
        // "Si los jefes gestionan más de tres proyectos, tienen un bonus de 500€ en el salario"
        if (proyectosGestionados.size() > 3) {
            // Solo aplicar el bonus una vez (cuando alcanza 4 proyectos)
            if (proyectosGestionados.size() == 4 && this.bonus == 0) {
                setBonus(500.0);
                System.out.println("  [???] ¡BONUS APLICADO! " + getNombre()
                        + " ahora gestiona " + proyectosGestionados.size()
                        + " proyectos. Bonus: +500€");
            } else if (proyectosGestionados.size() > 4) {
                System.out.println("  [?] " + getNombre() + " gestiona "
                        + proyectosGestionados.size() + " proyectos (Bonus: 500€)");
            }
        } else {
            System.out.println("  [INFO] " + getNombre() + " gestiona "
                    + proyectosGestionados.size() + " proyecto(s). "
                    + "Necesita gestionar más de 3 para recibir bonus.");
        }
    }

    /**
     * Getter para la lista de proyectos gestionados
     */
    public ArrayList<Proyecto> getProyectosGestionados() {
        return proyectosGestionados;
    }

    /**
     * Método para mostrar información de los proyectos gestionados
     */
    public void mostrarProyectosGestionados() {
        System.out.println("\n--- Proyectos gestionados por " + getNombre() + " ---");
        if (proyectosGestionados.isEmpty()) {
            System.out.println("  No gestiona ningún proyecto.");
        } else {
            for (int i = 0; i < proyectosGestionados.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + proyectosGestionados.get(i).getNombre());
            }
            System.out.println("  Total: " + proyectosGestionados.size() + " proyectos");
            if (proyectosGestionados.size() > 3) {
                System.out.println("  ? Bonus activo: +500€");
            }
        }
        System.out.println("---------------------------------------------------\n");
    }

    // PREGUNTA 4 - IMPLEMENTACIÓN DE evaluar() 
    @Override
    public String evaluar() {
        return "Jefe de Proyecto: " + getNombre()
                + " (ID: " + getIdentificador() + ")"
                + " - Gestiona " + proyectosGestionados.size() + " proyecto(s)"
                + (proyectosGestionados.size() > 3 ? " [CON BONUS]" : "");
    }
}
