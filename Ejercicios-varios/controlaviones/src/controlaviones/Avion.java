/**
 * EJERCICIO 2: SISTEMA DE CONTROL DE AVIONES EN AEROPUERTO
 * 
 * Nivel: INTERMEDIO
 * Conceptos: POO, Colecciones (ArrayList, LinkedList, HashMap, PriorityQueue)
 *           Enumeraciones, Interfaces, Herencia
 * 
 * ============================================================
 * DESCRIPCIÓN DEL PROBLEMA
 * ============================================================
 * 
 * Debes crear un sistema de control de aviones para un aeropuerto que:
 * 
 * 1. GESTIONAR AVIONES con información:
 *    - ID (único)
 *    - Aerolínea
 *    - Destino
 *    - Tipo (Nacional o Internacional)
 *    - Pasajeros
 *    - Estado (En Vuelo, En Cola, Aterrizando, Estacionado, Despegando)
 * 
 * 2. GESTIONAR PISTAS:
 *    - El aeropuerto tiene múltiples pistas (3, 4, 5...)
 *    - Cada pista puede estar ocupada o libre
 *    - Los aviones esperan en cola para usar una pista
 * 
 * 3. OPERACIONES:
 *    - Registrar un avión que llega
 *    - Asignar una pista disponible
 *    - Estacionar un avión
 *    - Despegar un avión
 *    - Ver estado de todas las pistas
 *    - Ver cola de espera
 *    - Ver aviones estacionados
 * 
 * ============================================================
 * EJEMPLO DE ENTRADA/SALIDA
 * ============================================================
 * 
 * Entrada:
 * 
 * LLEGA AA100 Iberia NYC Internacional 150
 * LLEGA UA200 United MIA Nacional 200
 * LLEGA IB300 Iberia MAD Internacional 180
 * ASIGNAR
 * ESTADO
 * ESTACIONAR AA100
 * ESTADO
 * 
 * Salida esperada:
 * 
 * [AA100] Registrado - En cola esperando pista
 * [UA200] Registrado - En cola esperando pista
 * [IB300] Registrado - En cola esperando pista
 * 
 * [AA100] Asignado a Pista 1 - Aterrizando
 * [UA200] Asignado a Pista 2 - Aterrizando
 * 
 * Pista 1: [AA100] Iberia ? NYC (150 pasajeros)
 * Pista 2: [UA200] United ? MIA (200 pasajeros)
 * Pista 3: Libre
 * Pista 4: Libre
 * Pista 5: Libre
 * 
 * [AA100] Estacionado exitosamente - En Estación
 * Pista 1: Libre
 * 
 * ============================================================
 * COLECCIONES A UTILIZAR
 * ============================================================
 * 
 * - ArrayList<Avion>: Lista de todos los aviones registrados
 * - Queue<Avion> o LinkedList<Avion>: Cola de espera de aviones
 * - HashMap<Integer, Pista>: Gestión de pistas y ocupación
 * - PriorityQueue: Prioridad (aviones internacionales antes)
 * - HashSet: Aviones únicos (por ID)
 * 
 * ============================================================
 */
 
package controlaviones;

/**
 *
 * @author Reinaldo Gil
 */
// Enumeración para los tipos de aviones
enum TipoAvion {
    NACIONAL(1),
    INTERNACIONAL(2);

    int prioridad;

    TipoAvion(int prioridad) {
        this.prioridad = prioridad;
    }
}

// Enumeración para los estados de un avión
enum EstadoAvion {
    EN_VUELO,
    EN_COLA,
    ATERRIZANDO,
    ESTACIONADO,
    DESPEGANDO
}

public class Avion {

    private String id;
    private String aerolinea;
    private String destino;
    private TipoAvion tipo;
    private int pasajeros;
    private EstadoAvion estado;
    private int pistaAsignada; // -1 si no tiene pista

    // Constructor
    public Avion(String id, String aerolinea, String destino,
            TipoAvion tipo, int pasajeros) {
        this.id = id;
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.tipo = tipo;
        this.pasajeros = pasajeros;
        this.estado = EstadoAvion.EN_VUELO;
        this.pistaAsignada = -1;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getDestino() {
        return destino;
    }

    public TipoAvion getTipo() {
        return tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public EstadoAvion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAvion estado) {
        this.estado = estado;
    }

    public int getPistaAsignada() {
        return pistaAsignada;
    }

    public void setPistaAsignada(int pista) {
        this.pistaAsignada = pista;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s => %s (%d pasajeros) - %s",
                id, aerolinea, destino, pasajeros, estado);
    }

    public String infoDetallada() {
        String pista = pistaAsignada == -1 ? "Sin pista" : "Pista " + pistaAsignada;
        return String.format("[%s] %s => %s (%d pasajeros) | %s | %s",
                id, aerolinea, destino, pasajeros, estado, pista);
    }
}
