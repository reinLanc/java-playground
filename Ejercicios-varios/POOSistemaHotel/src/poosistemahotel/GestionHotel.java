/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosistemahotel;

/**
 *
 * @author Reinaldo Gil
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionHotel {

    private List<Reserva> reservas;
    private Set<String> codigosUsados; // Para validación rápida

    public GestionHotel() {
        reservas = new ArrayList<>();
        codigosUsados = new HashSet<>();
    }

    public boolean registrarReserva(Reserva reserva) {
        if (codigosUsados.contains(reserva.getCodigo())) {
            System.out.println("ERROR: El código de reserva ya existe");
            return false;
        }

        reservas.add(reserva);
        codigosUsados.add(reserva.getCodigo());
        System.out.println("Reserva registrada exitosamente: " + reserva.getCodigo());
        return true;
    }

    public boolean cancelarReserva(String codigo) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getCodigo().equals(codigo)) {
                Reserva cancelada = reservas.remove(i);
                codigosUsados.remove(codigo);
                System.out.println("Reserva cancelada: " + cancelada);
                return true;
            }
        }
        System.out.println("No se encontró la reserva con código: " + codigo);
        return false;
    }

    public void listarReservasActivas() {
        System.out.println("\n=== RESERVAS ACTIVAS ===");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas");
            return;
        }

        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS DEL HOTEL ===");

        if (reservas.isEmpty()) {
            System.out.println("No hay datos para mostrar");
            return;
        }

        // Calcular total recaudado
        double totalRecaudado = 0;
        int[] conteoTipos = new int[TipoHabitacion.values().length];

        for (Reserva reserva : reservas) {
            totalRecaudado += reserva.calcularCosto();
            conteoTipos[reserva.getTipo().ordinal()]++;
        }
        //investigar decimalFormat()
        System.out.printf("Total recaudado: $%.2f\n", totalRecaudado);
        System.out.println("\nReservas por tipo de habitación:");

        for (TipoHabitacion tipo : TipoHabitacion.values()) {
            int conteo = conteoTipos[tipo.ordinal()];
            System.out.printf("  %s: %d reservas\n", tipo, conteo);
        }

        // Encontrar tipo más reservado
        int maxIndex = 0;
        for (int i = 1; i < conteoTipos.length; i++) {
            if (conteoTipos[i] > conteoTipos[maxIndex]) {
                maxIndex = i;
            }
        }

        TipoHabitacion masReservado = TipoHabitacion.values()[maxIndex];
        System.out.printf("\nTipo más reservado: %s (%d reservas)\n",
                masReservado, conteoTipos[maxIndex]);
    }
}
