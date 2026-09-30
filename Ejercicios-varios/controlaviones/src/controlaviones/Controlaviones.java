/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlaviones;

/**
 *
 * @author Reinaldo Gil
 */
public class Controlaviones {

    public static void main(String[] args) {

        // Crear aeropuerto con 5 pistas
        AeropuertoController aeropuerto = new AeropuertoController(5);

        System.out.println("SISTEMA DE CONTROL DE AVIONES DEL AEROPUERTO");


        // ESCENARIO: Múltiples aviones llegando
        System.out.println(">>> FASE 1: LLEGADA DE AVIONES <<<\n");

        aeropuerto.registrarAvion("AA100", "American Airlines", "New York",
                TipoAvion.NACIONAL, 150);
        aeropuerto.registrarAvion("UA200", "United Airlines", "Miami",
                TipoAvion.NACIONAL, 180);
        aeropuerto.registrarAvion("IB300", "Iberia", "Madrid",
                TipoAvion.INTERNACIONAL, 200);
        aeropuerto.registrarAvion("BA400", "British Airways", "Londres",
                TipoAvion.INTERNACIONAL, 220);
        aeropuerto.registrarAvion("AF500", "Air France", "París",
                TipoAvion.INTERNACIONAL, 190);

        System.out.println("\n>>> FASE 2: ASIGNACIÓN DE PISTAS <<<\n");
        System.out.println("(Nota: Los aviones internacionales tienen prioridad)\n");

        aeropuerto.asignarPistas();
        aeropuerto.mostrarEstadoGeneral();

        System.out.println("\n>>> FASE 3: ATERRIZAJES Y ESTACIONAMIENTO <<<\n");

        aeropuerto.estacionarAvion("IB300");
        System.out.println();
        aeropuerto.estacionarAvion("AA100");
        System.out.println();

        // Asignar nuevas pistas a los que esperan
        aeropuerto.asignarPistas();

        aeropuerto.estacionarAvion("BA400");
        System.out.println();

        aeropuerto.mostrarEstadoGeneral();
    }

}
