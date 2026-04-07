/*
 * PREGUNTA 2 - CLASE PROYECTO
 * 
 * Los proyectos tienen los siguientes campos:
 * a. Código de tipo entero.
 * b. Nombre de tipo cadena.
 * c. Duración en meses.
 * 
 * Se programará un método en la clase Proyecto que recibirá el código de un 
 * empleado con el propósito de asociarlo al proyecto. Hará dos tareas:
 * 
 * a. Registrará al empleado para que pase a formar parte del proyecto. (1 punto)
 * 
 * b. Como los empleados pueden trabajar en varios proyectos, se añadirá el proyecto 
 *    a la lista de proyectos en los que trabaja el empleado. (1,5 puntos)
 * 
 * c. Se adaptará el método para que pueda indicar si el empleado actúa como jefe del
 *    proyecto. Si el proyecto ya tenía jefe, el método no podrá ejecutarse y avisará 
 *    al usuario del modo que se considere más conveniente. (1 punto)
 */
package exame1empresatecnologica;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class Proyecto {

    // PREGUNTA 2 - CAMPOS DEL PROYECTO
    private int codigo;
    private String nombre;
    private int duracionMeses;

    //  PREGUNTA 2.a - LISTA DE EMPLEADOS DEL PROYECTO
    private ArrayList<Empleado> empleadosAsignados;

    // PREGUNTA 2.c - JEFE DEL PROYECTO
    private JefeProyecto jefe;

    /**
     * Constructor del Proyecto
     *
     * @param codigo código del proyecto
     * @param nombre nombre del proyecto
     * @param duracionMeses duración en meses
     */
    public Proyecto(int codigo, String nombre, int duracionMeses) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMeses = duracionMeses;
        this.empleadosAsignados = new ArrayList<>();
        this.jefe = null;
    }

    /**
     * PREGUNTA 2.a y 2.b - METODO PARA ASIGNAR EMPLEADO AL PROYECTO
     *
     * Registrará al empleado para que pase a formar parte del proyecto. Como
     * los empleados pueden trabajar en varios proyectos, se añadirá el proyecto
     * a la lista de proyectos en los que trabaja el empleado.
     *
     * @param empleado el empleado a asignar
     * @return true si se asignó correctamente, false si ya estaba asignado
     */
    public boolean asignarEmpleado(Empleado empleado) {
        // Verificar si el empleado ya está asignado
        if (empleadosAsignados.contains(empleado)) {
            System.out.println("El empleado " + empleado.getNombre()
                    + " ya esta asignado al proyecto " + nombre);
            return false;
        }

        // PREGUNTA 2.a - REGISTRAR EMPLEADO EN EL PROYECTO
        empleadosAsignados.add(empleado);

        // PREGUNTA 2.b - ANADIR PROYECTO A LA LISTA DEL EMPLEADO
        empleado.agregarProyecto(this);

        // EXPLICACIÓN DETALLADA DE ESTA LÍNEA:
        // - "empleado" es de tipo Empleado (la clase base)
        // - Pero en REALIDAD puede ser un Desarrollador, Becario o JefeProyecto
        // - Cuando llamamos a agregarProyecto(this):
        //   * Si empleado es realmente un Desarrollador -> ejecuta método vacío de Empleado
        //   * Si empleado es realmente un Becario -> ejecuta método vacío de Empleado  
        //   * Si empleado es realmente un JefeProyecto -> ejecuta método sobrescrito
        // - Java resuelve automáticamente qué versión del método ejecutar
        // - Esto se llama "enlace dinámico" o "dynamic binding"
        // - NO necesitamos saber el tipo concreto
        // - NO necesitamos instanceof
        // - NO necesitamos casting
        // 
        // RESULTADO: código más limpio, más corto, más mantenible y más profesional
        System.out.println("Empleado " + empleado.getNombre()
                + " asignado al proyecto " + nombre);
        return true;
    }

    /**
     * PREGUNTA 2.c - METODO PARA ASIGNAR JEFE AL PROYECTO
     *
     * Se adaptará el método para que pueda indicar si el empleado actúa como
     * jefe del proyecto. Si el proyecto ya tenía jefe, el método no podrá
     * ejecutarse y avisará al usuario del modo que se considere más
     * conveniente.
     *
     * @param jefe el jefe de proyecto a asignar
     * @return true si se asignó como jefe, false si ya había jefe o no es
     * JefeProyecto
     */
    public boolean asignarJefe(JefeProyecto jefe) {
        // Verificar si ya hay un jefe asignado
        if (this.jefe != null) {
            System.out.println("ERROR: El proyecto " + nombre
                    + " ya tiene un jefe asignado (" + this.jefe.getNombre() + ")");
            System.out.println("No se puede ejecutar la operacion.");
            return false;
        }

        // Asignar el jefe
        this.jefe = jefe;

        // También añadirlo como empleado del proyecto
        asignarEmpleado(jefe);

        System.out.println(jefe.getNombre() + " asignado como JEFE del proyecto " + nombre);
        return true;
    }

    /**
     * PREGUNTA 6 - METODO PARA IMPRIMIR TODOS LOS EMPLEADOS DEL PROYECTO
     *
     * Ampliar la funcionalidad de la clase Proyecto para que, mediante un
     * método, permita imprimir todos los empleados que forman parte de él.
     */
    public void imprimirEmpleados() {
        System.out.println("\n========================================");
        System.out.println("PROYECTO: " + nombre + " (Codigo: " + codigo + ")");
        System.out.println("Duracion: " + duracionMeses + " meses");
        System.out.println("========================================");

        /* if (jefe != null) {
            System.out.println("\nJEFE DEL PROYECTO:");
            System.out.println("  " + jefe.toString());
        }*/
        System.out.println("\nEMPLEADOS ASIGNADOS (" + empleadosAsignados.size() + "):");

        if (empleadosAsignados.isEmpty()) {
            System.out.println("  No hay empleados asignados.");
        } else {
            for (Empleado emp : empleadosAsignados) {
                System.out.println("  " + emp.toString());
            }
        }
        System.out.println("========================================\n");
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public JefeProyecto getJefe() {
        return jefe;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    @Override
    public String toString() {
        return "Proyecto{"
                + "codigo=" + codigo
                + ", nombre='" + nombre + '\''
                + ", duracion=" + duracionMeses + " meses"
                + ", empleados=" + empleadosAsignados.size()
                + ", jefe=" + (jefe != null ? jefe.getNombre() : "Sin asignar")
                + '}';
    }
}
