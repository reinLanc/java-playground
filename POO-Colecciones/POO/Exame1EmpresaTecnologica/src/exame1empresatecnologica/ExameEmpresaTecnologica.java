/*
 * EXAMEN DE PROGRAMACION - PROGRAMA PRINCIPAL
 * 
 * PREGUNTA 6 - METODO main()
 * En el método main() crear un proyecto y asignarle varios empleados. 
 * Debe tener uno o más desarrolladores, un jefe y un becario.
 * 
 * Ampliar la funcionalidad de la clase Proyecto para que, mediante un método, 
 * permita imprimir todos los empleados que forman parte de él. 
 * Llamar a este método para comprobar la salida.
 */
package exame1empresatecnologica;

/**
 *
 * @author Reinaldo Gil
 */
public class ExameEmpresaTecnologica {

    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println("     SISTEMA DE GESTION DE EMPLEADOS Y PROYECTOS");
        System.out.println("=======================================================\n");

        // CREAR EMPLEADOS (PREGUNTA 1 y 3) 
        System.out.println(">>> CREANDO EMPLEADOS...\n");

        // Crear desarrolladores
        Desarrollador dev1 = new Desarrollador("Ana García", 2800.0);
        System.out.println("? Creado: " + dev1);

        Desarrollador dev2 = new Desarrollador("Carlos Ruiz", 2200.0);
        System.out.println("? Creado: " + dev2);

        Desarrollador dev3 = new Desarrollador("Laura Martínez", 1800.0);
        System.out.println(" Creado: " + dev3);

        // Crear jefe de proyecto
        JefeProyecto jefe1 = new JefeProyecto("Pedro López", 3500.0);
        System.out.println(" Creado: " + jefe1);

        // Crear becario
        Becario becario1 = new Becario("María Fernández", 1200.0);
        becario1.setHorasFormacion(40); // Pregunta 3: horas de formación
        System.out.println(" Creado: " + becario1);

        // DEMOSTRAR CATEGORÍAS SALARIALES (PREGUNTA 1.c) 
        System.out.println("\n>>> CATEGORÍAS SALARIALES (Pregunta 1.c):");
        System.out.println("  " + dev1.getNombre() + " - Salario: " + dev1.getSalarioBase()
                + "€ - Categoría: " + dev1.getCategoriaSalarial());
        System.out.println("  " + dev2.getNombre() + " - Salario: " + dev2.getSalarioBase()
                + "€ - Categoría: " + dev2.getCategoriaSalarial());
        System.out.println("  " + dev3.getNombre() + " - Salario: " + dev3.getSalarioBase()
                + "€ - Categoría: " + dev3.getCategoriaSalarial());
        System.out.println("  " + jefe1.getNombre() + " - Salario: " + jefe1.getSalarioBase()
                + "€ - Categoría: " + jefe1.getCategoriaSalarial());
        System.out.println("  " + becario1.getNombre() + " - Salario: " + becario1.getSalarioBase()
                + "€ - Categoría: " + becario1.getCategoriaSalarial());

        //DEMOSTRAR SALARIO NETO (PREGUNTA 1.d) 
        System.out.println("\n>>> SALARIOS NETOS CON RETENCIONES (Pregunta 1.d):");
        System.out.println("  " + dev1.getNombre() + " - Base: " + dev1.getSalarioBase()
                + "€ - Neto: " + String.format("%.2f€", dev1.getSalarioNeto()));
        System.out.println("  " + dev2.getNombre() + " - Base: " + dev2.getSalarioBase()
                + "€ - Neto: " + String.format("%.2f€", dev2.getSalarioNeto()));
        System.out.println("  " + jefe1.getNombre() + " - Base: " + jefe1.getSalarioBase()
                + "€ - Neto: " + String.format("%.2f€", jefe1.getSalarioNeto()));
        System.out.println("  " + becario1.getNombre() + " - Base: " + becario1.getSalarioBase()
                + "€ - Neto: " + String.format("%.2f€", becario1.getSalarioNeto()));

        // CREAR PROYECTO (PREGUNTA 2) 
        System.out.println("\n>>> CREANDO PROYECTO...\n");
        Proyecto proyecto1 = new Proyecto(101, "Sistema de Gestión Empresarial", 12);
        System.out.println("? Proyecto creado: " + proyecto1 + "\n");

        //ASIGNAR JEFE AL PROYECTO (PREGUNTA 2.c)
        System.out.println(">>> ASIGNANDO JEFE AL PROYECTO (Pregunta 2.c)...\n");
        proyecto1.asignarJefe(jefe1);

        // ASIGNAR EMPLEADOS AL PROYECTO (PREGUNTA 2.a y 2.b) 
        // Aquí es donde se usa el POLIMORFISMO en lugar de instanceof
        System.out.println("\n>>> ASIGNANDO EMPLEADOS AL PROYECTO (Pregunta 2.a y 2.b)...\n");

        /*  POLIMORFISMO EN ACCIÓN 
         * 
         * Cada llamada a asignarEmpleado() internamente hace:
         *     empleado.agregarProyecto(this);
         * 
         * - Para dev1, dev2, dev3: ejecuta Empleado.agregarProyecto() (vacío)
         * - Para jefe1: ejecuta JefeProyecto.agregarProyecto() (añade a lista)
         * - Para becario1: ejecuta Empleado.agregarProyecto() (vacío)
         * 
         * ¡SIN USAR instanceof! Java decide automáticamente qué método ejecutar.*/
        proyecto1.asignarEmpleado(dev1);
        proyecto1.asignarEmpleado(dev2);
        proyecto1.asignarEmpleado(dev3);
        proyecto1.asignarEmpleado(becario1);

        // INTENTAR ASIGNAR OTRO JEFE (DEBE FALLAR - PREGUNTA 2.c) 
        System.out.println("\n>>> PROBANDO RESTRICCIÓN: Intentar asignar otro jefe...\n");
        JefeProyecto jefe2 = new JefeProyecto("Roberto Sánchez", 3800.0);
        proyecto1.asignarJefe(jefe2); // Debe fallar porque ya hay jefe

        // CREAR MÁS PROYECTOS PARA DEMOSTRAR BONUS (PREGUNTA 3) 
        System.out.println("\n>>> CREANDO MÁS PROYECTOS PARA DEMOSTRAR BONUS...\n");

        Proyecto proyecto2 = new Proyecto(102, "App Móvil Corporativa", 6);
        Proyecto proyecto3 = new Proyecto(103, "Portal Web Cliente", 8);
        Proyecto proyecto4 = new Proyecto(104, "Sistema CRM", 10);

        // Asignar el mismo jefe a múltiples proyectos
        proyecto2.asignarJefe(jefe1);
        proyecto3.asignarJefe(jefe1);
        proyecto4.asignarJefe(jefe1);

        /* BONUS AUTOMÁTICO (PREGUNTA 3)
         * 
         * Al asignar jefe1 a más de 3 proyectos, el método 
         * JefeProyecto.agregarProyecto() automáticamente:
         * 
         * 1. Añade el proyecto a proyectosGestionados
         * 2. Verifica si size() > 3
         * 3. Si es así, aplica bonus de 500€
         * 
         * Esto se hace automáticamente gracias al polimorfismo.
         * NO necesitamos código especial aquí.
         **/
        // VERIFICAR BONUS DEL JEFE (PREGUNTA 3) 
        System.out.println("\n>>> VERIFICANDO BONUS DEL JEFE (Pregunta 3):\n");
        jefe1.mostrarProyectosGestionados();
        System.out.println("Salario neto del jefe (con bonus): "
                + String.format("%.2f€", jefe1.getSalarioNeto()));

        // MÉTODO evaluar() (PREGUNTA 4)
        System.out.println("\n>>> EVALUACIÓN DE EMPLEADOS (Pregunta 4):\n");
        System.out.println("  " + dev1.evaluar());
        System.out.println("  " + jefe1.evaluar());
        System.out.println("  " + becario1.evaluar());

        //  IMPRIMIR EMPLEADOS DEL PROYECTO (PREGUNTA 5 y 6) 
        // Pregunta 5: toString() muestra tipo, código, nombre y salario neto
        // Pregunta 6: imprimirEmpleados() muestra todos los empleados del proyecto
        proyecto1.imprimirEmpleados();

        // DEMOSTRAR QUE LOS IDs SON AUTOMÁTICOS Y SECUENCIALES 
        System.out.println("\n>>> IDs AUTOGENERADOS EN SECUENCIA (Pregunta 1.a):\n");
        System.out.println("  dev1 - ID: " + dev1.getIdentificador());
        System.out.println("  dev2 - ID: " + dev2.getIdentificador());
        System.out.println("  dev3 - ID: " + dev3.getIdentificador());
        System.out.println("  jefe1 - ID: " + jefe1.getIdentificador());
        System.out.println("  becario1 - ID: " + becario1.getIdentificador());
        System.out.println("  jefe2 - ID: " + jefe2.getIdentificador());

        //  PRUEBAS ADICIONALES
        System.out.println("\n>>> PRUEBAS ADICIONALES:\n");

        // Intentar añadir el mismo empleado dos veces
        System.out.println("Intentar añadir el mismo empleado dos veces:");
        proyecto1.asignarEmpleado(dev1);

        // Demostrar validación de nombre vacío (Pregunta 1.b)
        System.out.println("\nIntentar crear empleado sin nombre (debe fallar):");
        try {
            Empleado empleadoInvalido = new Desarrollador("", 2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("  ? ERROR CAPTURADO: " + e.getMessage());
        }

        System.out.println("\n=======================================================");
        System.out.println("                  FIN DEL PROGRAMA");
        System.out.println("=======================================================");
    }
}
