/*
 * EJERCICIO: SISTEMA DE GESTIÓN DE EMPLEADOS
 * 
 * Enunciado:
 * Crea un sistema de gestión de empleados de una empresa que tiene dos tipos
 * de trabajadores: empleados por horas y empleados con salario fijo.
 * 
 * Requisitos:
 * 1. Crear una interface "Empleable" con métodos para calcular salario
 * 2. Crear clases que implementen esta interface
 * 3. Usar métodos y atributos static para:
 *    - Contador automático de IDs de empleados
 *    - Salario mínimo de la empresa (compartido por todos)
 *    - Métodos de utilidad (calcular impuestos, formatear moneda, etc.)
 * 4. Crear un ArrayList con empleados mixtos
 * 5. Calcular nómina total, impuestos, estadísticas
 */
package sistemagestionempleados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleable> empleados = new ArrayList<>();

        System.out.println("===============================================================");
        System.out.println("     SISTEMA DE GESTION DE EMPLEADOS CON INTERFACE         ");
        System.out.println("===============================================================\n");

        // Mostramos información estática inicial
        System.out.println("INFORMACION GENERAL DE LA EMPRESA:");
        System.out.println("   - Salario minimo: " + Empleado.formatearEuros(Empleado.getSalarioMinimo()));
        System.out.println("   - IRPF: 15% | Seguridad Social: 6.35%");
        System.out.println();

        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    anadirEmpleadoPorHoras(teclado, empleados);
                    break;
                case 2:
                    anadirEmpleadoFijo(teclado, empleados);
                    break;
                case 3:
                    listarEmpleados(empleados);
                    break;
                case 4:
                    mostrarNominaMensual(empleados);
                    break;
                case 5:
                    mostrarEstadisticas(empleados);
                    break;
                case 6:
                    modificarSalarioMinimo(teclado);
                    break;
                case 7:
                    demostrarConceptosStatic();
                    break;
                case 8:
                    continuar = false;
                    System.out.println("\nHasta luego!");
                    break;
                default:
                    System.out.println("\nOpcion no valida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n===============================================================");
        System.out.println("                         MENU                               ");
        System.out.println("===============================================================");
        System.out.println("  1. Anadir empleado por horas                             ");
        System.out.println("  2. Anadir empleado fijo                                  ");
        System.out.println("  3. Listar todos los empleados                            ");
        System.out.println("  4. Mostrar nomina mensual                                ");
        System.out.println("  5. Ver estadisticas                                      ");
        System.out.println("  6. Modificar salario minimo                              ");
        System.out.println("  7. Demostracion de conceptos (STATIC & INTERFACE)        ");
        System.out.println("  8. Salir                                                 ");
        System.out.println("===============================================================");
        System.out.print("Selecciona una opcion: ");
    }

    private static void anadirEmpleadoPorHoras(Scanner teclado, ArrayList<Empleable> empleados) {
        System.out.println("\n--- NUEVO EMPLEADO POR HORAS ---");

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Departamento: ");
        String departamento = teclado.nextLine();

        System.out.print("Horas trabajadas este mes: ");
        int horas = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Tarifa por hora: ");
        double tarifa = teclado.nextDouble();
        teclado.nextLine();

        EmpleadoPorHoras empleado = new EmpleadoPorHoras(nombre, departamento, horas, tarifa);
        empleados.add(empleado);

        System.out.println("\nEmpleado anadido correctamente.");
        System.out.println("  ID asignado: " + empleado.getId());
    }

    private static void anadirEmpleadoFijo(Scanner teclado, ArrayList<Empleable> empleados) {
        System.out.println("\n--- NUEVO EMPLEADO FIJO ---");

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Departamento: ");
        String departamento = teclado.nextLine();

        System.out.print("Salario mensual: ");
        double salario = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Bonificacion (% sobre salario): ");
        double bonificacion = teclado.nextDouble();
        teclado.nextLine();

        EmpleadoFijo empleado = new EmpleadoFijo(nombre, departamento, salario, bonificacion);
        empleados.add(empleado);

        System.out.println("\nEmpleado anadido correctamente.");
        System.out.println("  ID asignado: " + empleado.getId());
    }

    private static void listarEmpleados(ArrayList<Empleable> empleados) {
        System.out.println("\n===============================================================");
        System.out.println("               LISTADO DE EMPLEADOS                         ");
        System.out.println("===============================================================\n");

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        for (Empleable emp : empleados) {
            System.out.println(emp.obtenerInformacion());
            System.out.println();
        }

        System.out.println("Total de empleados: " + empleados.size());
    }

    private static void mostrarNominaMensual(ArrayList<Empleable> empleados) {
        System.out.println("\n===============================================================");
        System.out.println("                  NOMINA MENSUAL                            ");
        System.out.println("===============================================================\n");

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        double totalBruto = 0;
        double totalDeducciones = 0;
        double totalNeto = 0;

        System.out.println("ID    Nombre                    Bruto        Deducciones    Neto");
        System.out.println("-----------------------------------------------------------------------");

        for (Empleable emp : empleados) {
            double bruto = emp.calcularSalarioBruto();
            double neto = emp.calcularSalarioNeto();
            double deducciones = bruto - neto;

            System.out.printf("%-5d %-20s %10s   %10s   %10s%n",
                    emp.getId(),
                    emp.getNombre(),
                    Empleado.formatearEuros(bruto),
                    Empleado.formatearEuros(deducciones),
                    Empleado.formatearEuros(neto));

            totalBruto += bruto;
            totalDeducciones += deducciones;
            totalNeto += neto;
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-26s %10s   %10s   %10s%n",
                "TOTALES:",
                Empleado.formatearEuros(totalBruto),
                Empleado.formatearEuros(totalDeducciones),
                Empleado.formatearEuros(totalNeto));
    }

    private static void mostrarEstadisticas(ArrayList<Empleable> empleados) {
        System.out.println("\n===============================================================");
        System.out.println("                    ESTADISTICAS                            ");
        System.out.println("===============================================================\n");

        System.out.println("Datos generales:");
        System.out.println("   - Total de empleados: " + Empleado.getTotalEmpleados());
        System.out.println("   - Salario medio: " + Empleado.formatearEuros(Empleado.calcularSalarioMedio()));
        System.out.println("   - Salario minimo empresa: " + Empleado.formatearEuros(Empleado.getSalarioMinimo()));

        if (!empleados.isEmpty()) {
            double salarioMasAlto = 0;
            double salarioMasBajo = Double.MAX_VALUE;
            String empleadoMasAlto = "";
            String empleadoMasBajo = "";

            for (Empleable emp : empleados) {
                double salario = emp.calcularSalarioBruto();
                if (salario > salarioMasAlto) {
                    salarioMasAlto = salario;
                    empleadoMasAlto = emp.getNombre();
                }
                if (salario < salarioMasBajo) {
                    salarioMasBajo = salario;
                    empleadoMasBajo = emp.getNombre();
                }
            }

            System.out.println("\nRangos salariales:");
            System.out.println("   - Salario mas alto: " + Empleado.formatearEuros(salarioMasAlto)
                    + " (" + empleadoMasAlto + ")");
            System.out.println("   - Salario mas bajo: " + Empleado.formatearEuros(salarioMasBajo)
                    + " (" + empleadoMasBajo + ")");
        }
    }

    private static void modificarSalarioMinimo(Scanner teclado) {
        System.out.println("\n--- MODIFICAR SALARIO MINIMO ---");
        System.out.println("Salario minimo actual: " + Empleado.formatearEuros(Empleado.getSalarioMinimo()));

        System.out.print("Nuevo salario minimo: ");
        double nuevoSalario = teclado.nextDouble();
        teclado.nextLine();

        Empleado.setSalarioMinimo(nuevoSalario);

        System.out.println("\nSalario minimo actualizado: " + Empleado.formatearEuros(Empleado.getSalarioMinimo()));
        System.out.println("  (Afectara a los nuevos empleados que se den de alta)");
    }

    private static void demostrarConceptosStatic() {
        System.out.println("\n===============================================================");
        System.out.println("          DEMOSTRACION: STATIC & INTERFACE                  ");
        System.out.println("===============================================================\n");

        System.out.println("CONCEPTOS DE STATIC:");
        System.out.println("   1. Atributos static (compartidos por todas las instancias):");
        System.out.println("      - contadorId: genera IDs unicos automaticamente");
        System.out.println("      - salarioMinimo: valor comun para todos los empleados");
        System.out.println("      - totalEmpleados: contador global");

        System.out.println("\n   2. Metodos static (se pueden llamar sin crear objetos):");
        System.out.println("      - Empleado.formatearEuros(1500) -> " + Empleado.formatearEuros(1500));
        System.out.println("      - Empleado.getSalarioMinimo() -> " + Empleado.formatearEuros(Empleado.getSalarioMinimo()));
        System.out.println("      - Empleado.calcularDeducciones(2000) -> " + Empleado.formatearEuros(Empleado.calcularDeducciones(2000)));

        System.out.println("\n   3. Ventajas de static:");
        System.out.println("      - Un solo valor compartido por todos (ahorro de memoria)");
        System.out.println("      - Acceso sin necesidad de crear objetos");
        System.out.println("      - Util para constantes, contadores y utilidades");

        System.out.println("\nCONCEPTOS DE INTERFACE:");
        System.out.println("   1. Define un contrato (metodos que deben implementarse):");
        System.out.println("      - calcularSalarioBruto()");
        System.out.println("      - calcularSalarioNeto()");
        System.out.println("      - obtenerInformacion()");

        System.out.println("\n   2. Polimorfismo:");
        System.out.println("      - ArrayList<Empleable> puede contener EmpleadoPorHoras y EmpleadoFijo");
        System.out.println("      - Tratamos diferentes tipos de empleados de forma uniforme");

        System.out.println("\n   3. Ventajas de interfaces:");
        System.out.println("      - Flexibilidad: multiples clases pueden implementar la misma interface");
        System.out.println("      - Desacoplamiento: el codigo no depende de la implementacion concreta");
        System.out.println("      - Contratos claros: sabemos que metodos estan disponibles");
    }
}
