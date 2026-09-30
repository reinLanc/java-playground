/*
Crear un sistema de gestión de reservas para un hotel usando ArrayList y HashSet. 
El hotel tiene habitaciones de diferentes tipos (Simple, Doble, Suite). Cada reserva 
tiene un código único, nombre del huésped, tipo de habitación, número de noches
y fecha de entrada. El sistema debe:

Registrar nuevas reservas (validar que no exista el código)
Cancelar reservas por código
Calcular el costo total de una reserva según tarifas por tipo
Listar todas las reservas activas
Mostrar estadísticas: total recaudado y habitaciones más reservadas
 */
package poosistemahotel;

import java.time.LocalDate;

/**
 *
 * @author Reinaldo Gil
 */
public class POOSistemaHotel {

    public static void main(String[] args) {
        GestionHotel hotel = new GestionHotel();

        // Registrar reservas
        hotel.registrarReserva(new Reserva("R001", "Pedro Martínez",
                TipoHabitacion.SUITE, 3, LocalDate.of(2026, 2, 10)));
        hotel.registrarReserva(new Reserva("R002", "Ana Silva",
                TipoHabitacion.DOBLE, 5, LocalDate.of(2026, 2, 15)));
        hotel.registrarReserva(new Reserva("R003", "Luis Gómez",
                TipoHabitacion.SIMPLE, 2, LocalDate.of(2026, 2, 20)));
        hotel.registrarReserva(new Reserva("R004", "Carmen López",
                TipoHabitacion.DOBLE, 4, LocalDate.of(2026, 2, 25)));
        hotel.registrarReserva(new Reserva("R005", "Miguel Torres",
                TipoHabitacion.SUITE, 7, LocalDate.of(2026, 3, 1)));

        // Intentar duplicar código
        System.out.println();
        hotel.registrarReserva(new Reserva("R003", "Otro Huésped",
                TipoHabitacion.SIMPLE, 1, LocalDate.of(2026, 3, 5)));

        hotel.listarReservasActivas();
        hotel.mostrarEstadisticas();

        // Cancelar una reserva
        System.out.println();
        hotel.cancelarReserva("R002");

        hotel.listarReservasActivas();
        hotel.mostrarEstadisticas();

    }

}
