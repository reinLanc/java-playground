/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Banco {

    //  COLECCIONES
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();

    // HashMap: NIF  Cliente (evita recorrer la lista entera en cada búsqueda)
    private static HashMap<String, Cliente> mapaClientes = new HashMap<>();

    // Contador para asignar números de cuenta (arranca en 1)
    private static int numSigCuenta = 1;

    private static double comisionMensual = 0.6;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            op = mostrarMenu();
            switch (op) {
                case 1:
                    ingreso();
                    break;
                case 2:
                    cargo();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    cambioPropietario();
                    break;
                case 5:
                    revisionMensual();
                    break;
                case 6:
                    nuevoCliente();
                    break;
                case 7:
                    nuevaCuenta();
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    cambiarComisionMensual();
                    break;
                case 10:
                    historialCuenta();
                    break;
                case 11:
                    informeResumen();
                    break;
            }
        } while (op != 0);
    }

    //  MENÚ 
    static int mostrarMenu() {
        System.out.println("\n=== BANCO ===");
        System.out.println(" 1. Ingresar dinero");
        System.out.println(" 2. Sacar dinero");
        System.out.println(" 3. Consultar saldo");
        System.out.println(" 4. Cambiar el cliente");
        System.out.println(" 5. Revisión mensual");
        System.out.println(" 6. Nuevo cliente");
        System.out.println(" 7. Nueva cuenta");
        System.out.println(" 8. Listar clientes y cuentas");
        System.out.println(" 9. Cambiar comisión mensual");
        System.out.println("10. Ver historial de movimientos");
        System.out.println("11. Informe resumen (matriz)");
        System.out.println(" 0. Salir");
        int op = teclado.nextInt();
        teclado.nextLine();
        return op;
    }

    //  CLIENTES 
    static void nuevoCliente() {
        System.out.print("NIF: ");
        String nif = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        if (mapaClientes.containsKey(nif)) {
            System.out.println("Ya existe un cliente con ese NIF.");
            return;
        }
        Cliente c = new Cliente(nif, nombre, apellidos);
        clientes.add(c);           // ArrayList
        mapaClientes.put(nif, c);  // HashMap
        System.out.println("Cliente creado correctamente.");
    }

    /**
     * Búsqueda O(1) gracias al HashMap. Antes era O(n) recorriendo el array.
     */
    static Cliente localizarCliente(String nif) {
        return mapaClientes.get(nif); // null si no existe
    }

    static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        // Iteramos con for-each sobre el ArrayList
        for (Cliente c : clientes) {
            System.out.println("NIF: " + c.getNIF()
                    + "   Nombre: " + c.getNombre()
                    + "   Apellidos: " + c.getApellidos()
                    + "   Puntos: " + c.getPuntos());
            listarCuentasCliente(c);
        }
    }

    static void listarCuentasCliente(Cliente cliente) {
        for (Cuenta cuenta : cuentas) {             // for-each sobre ArrayList
            if (cuenta.getCliente() == cliente) {
                String tipo = cuenta.getClass().getSimpleName();
                System.out.printf("   [%s] Cuenta nº%d  Saldo: %.2f€%n",
                        tipo, cuenta.getNumeroCuenta(), cuenta.getSaldo());
            }
        }
    }

    // CUENTAS 
    static void nuevaCuenta() {
        System.out.println("Tipo de cuenta:  1.Corriente  2.Vivienda  3.Fondo Inversión  4.Cancelar");
        int op = teclado.nextInt();
        teclado.nextLine();

        System.out.print("NIF del cliente: ");
        String nif = teclado.nextLine();
        Cliente cli = localizarCliente(nif); // búsqueda en HashMap O(1)
        if (cli == null) {
            System.out.println("El cliente no existe.");
            return;
        }

        System.out.print("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine();

        Cuenta nueva = null;
        switch (op) {
            case 1:
                nueva = new CuentaCorriente(saldo, numSigCuenta, cli);
                break;
            case 2:
                nueva = new CuentaVivienda(saldo, numSigCuenta, cli);
                break;
            case 3:
                nueva = new FI(saldo, numSigCuenta, cli);
                break;
            default:
                return;
        }
        cuentas.add(nueva);   // ArrayList — sin límite de tamaño
        numSigCuenta++;
        System.out.println("Cuenta nº" + nueva.getNumeroCuenta() + " creada correctamente.");
    }

    static Cuenta localizarCuenta(int numCta) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta() == numCta) {
                return c;
            }
        }
        return null;
    }

    //  OPERACIONES 
    static void ingreso() {
        System.out.print("Número de cuenta: ");
        int numCta = teclado.nextInt();
        teclado.nextLine();
        Cuenta c = localizarCuenta(numCta);
        if (c == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        System.out.print("Importe: ");
        double importe = teclado.nextDouble();
        teclado.nextLine();
        c.ingresar(importe);
        System.out.printf("Nuevo saldo: %.2f€%n", c.getSaldo());
    }

    static void cargo() {
        System.out.print("Número de cuenta: ");
        int numCta = teclado.nextInt();
        teclado.nextLine();
        Cuenta c = localizarCuenta(numCta);
        if (c == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        System.out.print("Importe: ");
        double importe = teclado.nextDouble();
        teclado.nextLine();
        c.retirar(importe);
        System.out.printf("Nuevo saldo: %.2f€%n", c.getSaldo());
    }

    static void consultarSaldo() {
        System.out.print("Número de cuenta: ");
        int numCta = teclado.nextInt();
        teclado.nextLine();
        Cuenta c = localizarCuenta(numCta);
        if (c == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        System.out.printf("Saldo: %.2f€%n", c.getSaldo());
    }

    static void cambioPropietario() {
        System.out.print("Número de cuenta: ");
        int numCta = teclado.nextInt();
        teclado.nextLine();
        Cuenta c = localizarCuenta(numCta);
        if (c == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        System.out.print("NIF del nuevo propietario: ");
        String nif = teclado.nextLine();
        Cliente cli = localizarCliente(nif);
        if (cli == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }
        c.setCliente(cli);
        System.out.println("Propietario actualizado.");
    }

    static void revisionMensual() {
        for (Cuenta c : cuentas) {   // for-each sobre ArrayList
            c.pagarInteres();
            c.aplicarComision(comisionMensual);
        }
        System.out.println("Revisión mensual aplicada a " + cuentas.size() + " cuentas.");
    }

    static void cambiarComisionMensual() {
        System.out.print("Nueva comisión mensual: ");
        comisionMensual = teclado.nextDouble();
        teclado.nextLine();
    }

    // HISTORIAL (LinkedList) 
    static void historialCuenta() {
        System.out.print("Número de cuenta: ");
        int numCta = teclado.nextInt();
        teclado.nextLine();
        Cuenta c = localizarCuenta(numCta);
        if (c == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }
        System.out.println("Historial cuenta nº" + numCta + " ");
        c.mostrarHistorial();   // recorre el LinkedList de movimientos
    }

    //INFORME RESUMEN (matriz String[][])
    /**
     * Genera una matriz bidimensional donde: - Filas  cada cliente - Columnas
     *  [ NIF | Corriente | Vivienda | FI | Total ]
     *
     * Esto demuestra el uso de una matriz (array 2D).
     */
    static void informeResumen() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        int numClientes = clientes.size();
        // Matriz: filas = clientes, columnas = [NIF, Corriente, Vivienda, FI, Total]
        String[][] matriz = new String[numClientes + 1][5];

        // Cabecera (fila 0)
        matriz[0][0] = "NIF";
        matriz[0][1] = "Corriente (€)";
        matriz[0][2] = "Vivienda (€)";
        matriz[0][3] = "F.Inversión (€)";
        matriz[0][4] = "TOTAL (€)";

        // Rellenar una fila por cliente
        for (int i = 0; i < numClientes; i++) {
            Cliente cli = clientes.get(i);   // acceso por índice en ArrayList
            double sumCorriente = 0, sumVivienda = 0, sumFI = 0;

            for (Cuenta c : cuentas) {
                if (c.getCliente() == cli) {
                    if (c instanceof CuentaCorriente) {
                        sumCorriente += c.getSaldo();
                    } else if (c instanceof CuentaVivienda) {
                        sumVivienda += c.getSaldo();
                    } else if (c instanceof FI) {
                        sumFI += c.getSaldo();
                    }
                }
            }

            matriz[i + 1][0] = cli.getNIF();
            matriz[i + 1][1] = String.format("%.2f", sumCorriente);
            matriz[i + 1][2] = String.format("%.2f", sumVivienda);
            matriz[i + 1][3] = String.format("%.2f", sumFI);
            matriz[i + 1][4] = String.format("%.2f", sumCorriente + sumVivienda + sumFI);
        }

        // Imprimir la matriz
        System.out.println("\n");
        for (String[] fila : matriz) {
            System.out.printf("%-15s %-15s %-13s %-17s %-12s%n",
                    fila[0], fila[1], fila[2], fila[3], fila[4]);
        }
        System.out.println("");
    }
}
