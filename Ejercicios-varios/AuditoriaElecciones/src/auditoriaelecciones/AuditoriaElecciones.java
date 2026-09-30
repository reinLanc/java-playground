/*
Ejercicio 2 (Alternativa): Colecciones
Enunciado: Sistema de Auditoría de Votos y Detección de Fraude Electoral
Un centro de votación ha registrado de forma plana todos los votos emitidos para una elección en un
ArrayList<String>, donde cada elemento es simplemente el nombre del partido votado. Sin embargo, 
debido a sospechas de fraude, el sistema debe ser capaz de procesar estos datos e identificar anomalías.

Diseña un programa en Java que realice los siguientes pasos avanzados utilizando colecciones:

Simulación de Carga: Permitir al usuario ingresar votos de manera indefinida en un ArrayList hasta que
escriba la palabra "FIN".

Consolidación y Conteo General (HashMap<String, Integer>): El programa debe recorrer el ArrayList y 
poblar un HashMap donde la Clave sea el nombre del partido y el Valor sea la cantidad total de votos 
acumulados para ese partido.

Auditoría de Umbral de Alerta: El sistema solicitará un porcentaje límite de alerta (por ejemplo, 50.0
para el 50%). El programa calculará qué porcentaje del total de votos generales representa cada partido
político. Si algún partido supera ese umbral, se debe emitir un mensaje de alerta explícito por posible
fraude o dominancia extrema.

Al igual que el anterior, todo debe programarse secuencialmente dentro del método main, usando la variable
teclado para el Scanner y construyendo las salidas de texto únicamente con System.out.println.
 */
package auditoriaelecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class AuditoriaElecciones {

    public static void main(String[] args) {
        // Instancia del Scanner llamada teclado
        Scanner teclado = new Scanner(System.in);

        // Estructura 1: Lista plana para recibir todos los votos en el orden en que ingresan
        ArrayList<String> registroVotos = new ArrayList<>();

        System.out.println("--- SISTEMA DE REGISTRO DE VOTOS ---");
        System.out.println("Ingrese el nombre del partido votado (o escriba 'FIN' para terminar):");

        String voto = teclado.nextLine();

        // 1. Fase de recolección de datos en el ArrayList
        while (!voto.equalsIgnoreCase("FIN")) {
            // Pasamos a mayúsculas para evitar que 'PartidoA' y 'partidoa' se cuenten por separado
            registroVotos.add(voto.toUpperCase());

            System.out.println("Voto registrado. Ingrese el siguiente (o 'FIN'):");
            voto = teclado.nextLine();
        }

        // Validación inicial por si cierran el programa sin datos
        if (registroVotos.isEmpty()) {
            System.out.println("No se registraron votos en el sistema. Saliendo.");
        } else {

            // Total de votos emitidos (tamaño de nuestro ArrayList)
            int totalVotos = registroVotos.size();

            // Estructura 2: Mapa para consolidar y contar frecuencias. Clave = Partido, Valor = Cantidad de votos
            HashMap<String, Integer> escrutinio = new HashMap<>();

            // 2. Fase de Consolidación lógica (Crucial para que los alumnos entiendan la acumulación en mapas)
            for (int i = 0; i < registroVotos.size(); i++) {
                String partidoActual = registroVotos.get(i);

                // Si el partido ya existe en el mapa, extraemos su valor actual y le sumamos 1
                if (escrutinio.containsKey(partidoActual)) {
                    int votosActuales = escrutinio.get(partidoActual);
                    escrutinio.put(partidoActual, votosActuales + 1);
                } // Si es la primera vez que vemos este partido, lo inicializamos en 1 voto
                else {
                    escrutinio.put(partidoActual, 1);
                }
            }

            // 3. Configuración del umbral de alerta de auditoría
            System.out.println("\nIngrese el porcentaje umbral para activar la alerta de auditoria (ejemplo: 50.0):");
            double umbralAlerta = teclado.nextDouble();

            System.out.println("\n=========================================");
            System.out.println("       RESULTADOS DEL ESCRUTINIO         ");
            System.out.println("=========================================");
            System.out.println("Total de votos emitidos validos: " + totalVotos);
            System.out.println("-----------------------------------------");

            // 4. Procesamiento y visualización cruzando los datos mapeados
            // Explicar a los alumnos que 'keySet()' nos da la lista de todas las claves (partidos) del mapa
            for (String partido : escrutinio.keySet()) {
                int votosPartido = escrutinio.get(partido);

                // Cálculo matemático del porcentaje con cast a double para evitar división entera truncada
                double porcentaje = ((double) votosPartido / totalVotos) * 100;

                // Salida estándar formateada manualmente mediante Strings pegados
                System.out.println("Partido: " + partido + " | Votos: " + votosPartido + " | Porcentaje: " + porcentaje + "%");

                // Evaluación del umbral crítico solicitado por el ejercicio
                if (porcentaje > umbralAlerta) {
                    System.out.println("  [ALERTA DE AUDITORIA]: El partido " + partido + " supera el umbral del " + umbralAlerta + "%");
                }
            }
            System.out.println("=========================================");
        }
    }
}
