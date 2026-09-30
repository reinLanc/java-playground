/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaviones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Reinaldo Gil
 */
public class AeropuertoController {

    private ArrayList<Avion> todosLosAviones;      // Todos los aviones registrados
    private Queue<Avion> colaDeEspera;              // Cola FIFO para aviones en espera
    private HashMap<Integer, Pista> pistas;         // Diccionario de pistas
    private ArrayList<Avion> avionesEstacionados;   // Aviones que ya aterrizaron

    public AeropuertoController(int numeroDePistas) {
        this.todosLosAviones = new ArrayList<>();
        this.colaDeEspera = new LinkedList<>();
        this.pistas = new HashMap<>();
        this.avionesEstacionados = new ArrayList<>();

        // Inicializar pistas
        for (int i = 1; i <= numeroDePistas; i++) {
            pistas.put(i, new Pista(i));
        }
    }

    /**
     * Registrar un avión que acaba de llegar
     */
    public void registrarAvion(String id, String aerolinea, String destino,
            TipoAvion tipo, int pasajeros) {

        Avion avion = new Avion(id, aerolinea, destino, tipo, pasajeros);
        avion.setEstado(EstadoAvion.EN_COLA);

        todosLosAviones.add(avion);
        colaDeEspera.add(avion);

        System.out.println(String.format("[%s] Registrado - En cola esperando pista", id));
    }

    /**
     * Asignar aviones a pistas disponibles Idea: Los aviones internacionales
     * tienen prioridad
     */
    public void asignarPistas() {

        // Convertir cola a lista para mejor control
        ArrayList<Avion> listaEspera = new ArrayList<>(colaDeEspera);

        // Ordenar por prioridad (Internacional antes que Nacional)
        listaEspera.sort((a, b)
                -> Integer.compare(b.getTipo().prioridad, a.getTipo().prioridad)
        );

        for (Avion avion : listaEspera) {
            // Buscar una pista libre
            for (Pista pista : pistas.values()) {
                if (pista.estaLibre()) {
                    pista.setAvion(avion);
                    avion.setPistaAsignada(pista.getNumero());
                    avion.setEstado(EstadoAvion.ATERRIZANDO);
                    colaDeEspera.remove(avion);

                    System.out.println(String.format(
                            "[%s] Asignado a Pista %d - Aterrizando",
                            avion.getId(), pista.getNumero()
                    ));

                    break; // Pasar al siguiente avión
                }
            }
        }
    }

    /**
     * Estacionar un avión (libera la pista)
     */
    public void estacionarAvion(String idAvion) {

        Avion avion = null;

        // Buscar el avión
        for (Avion a : todosLosAviones) {
            if (a.getId().equals(idAvion)) {
                avion = a;
                break;
            }
        }

        if (avion == null) {
            System.out.println("ERROR: Avión no encontrado");
            return;
        }

        if (avion.getPistaAsignada() == -1) {
            System.out.println("ERROR: El avión no tiene pista asignada");
            return;
        }

        // Liberar la pista
        Pista pista = pistas.get(avion.getPistaAsignada());
        pista.setAvion(null);

        // Actualizar estado del avión
        avion.setEstado(EstadoAvion.ESTACIONADO);
        avionesEstacionados.add(avion);

        System.out.println(String.format(
                "[%s] Estacionado exitosamente - En Estación", idAvion
        ));
    }

    /**
     * Mostrar estado de todas las pistas
     */
    public void mostrarEstadoPistas() {
        System.out.println("\n--- ESTADO DE PISTAS ---");
        for (int i = 1; i <= pistas.size(); i++) {
            System.out.println(pistas.get(i));
        }
        System.out.println();
    }

    /**
     * Mostrar cola de espera
     */
    public void mostrarColaEspera() {
        System.out.println("\n--- COLA DE ESPERA ---");
        if (colaDeEspera.isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            for (Avion avion : colaDeEspera) {
                System.out.println("  " + avion);
            }
        }
        System.out.println();
    }

    /**
     * Mostrar aviones estacionados
     */
    public void mostrarAvionesEstacionados() {
        System.out.println("\n--- AVIONES ESTACIONADOS ---");
        if (avionesEstacionados.isEmpty()) {
            System.out.println("No hay aviones estacionados");
        } else {
            for (Avion avion : avionesEstacionados) {
                System.out.println("  " + avion);
            }
        }
        System.out.println();
    }

    /**
     * Mostrar información general del aeropuerto
     */
    public void mostrarEstadoGeneral() {
        System.out.println(" ESTADO DEL AEROPUERTO ");

        System.out.println(" ESTADÍSTICAS:");
        System.out.printf("   Total de aviones registrados: %d%n", todosLosAviones.size());
        System.out.printf("   Aviones en cola: %d%n", colaDeEspera.size());
        System.out.printf("   Pistas ocupadas: %d/%d%n",countPistasOcupadas(), pistas.size());
        System.out.printf("  Aviones estacionados: %d%n", avionesEstacionados.size());
        System.out.println();

        mostrarEstadoPistas();
        mostrarColaEspera();
        mostrarAvionesEstacionados();
    }

    private int countPistasOcupadas() {
        int count = 0;
        for (Pista p : pistas.values()) {
            if (!p.estaLibre()) {
                count++;
            }
        }
        return count;
    }
}
