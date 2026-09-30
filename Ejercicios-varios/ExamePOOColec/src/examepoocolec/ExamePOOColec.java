/*
 * ENUNCIADO COMPLETO DEL EXAMEN
 * DAM DUAL INTENSIVO 2025-2026
 * EXAME REC. 2ª AV. PROGRAMACIÓN — 10/3/2026
 *
 * Unha axencia espacial precisa un software para xestionar a súa frota.
 * Existen diferentes tipos de vehículos, pero todos comparten certas
 * características. Ademais, algúns vehículos teñen capacidades especiais
 * (como entrar en modo combate). Crear os paquetes necesarios para ter
 * ben organizado o proxecto.
 *
 * REQUISITOS DO DESEÑO:
 *
 * 1. Clase Abstracta Vehiculo:
 *    - Atributos: matricula (String), modelo (String) e nivelCombustible (double).
 *    - Métodos:
 *        · Un construtor para inicializar todos os atributos.
 *        · Un método abstracto void viaxar(double distancia) que reducirá
 *          o combustible segundo o tipo de vehículo.
 *        · Métodos getters e setters.
 *
 * 2. Interface Combativo:
 *    - Debe declarar un método chamado void activarEscudos().
 *
 * 3. Subclases (fillas de Vehiculo):
 *
 *    · NaveCarga:
 *        - Atributo propio: capacidadeCarga (int).
 *        - Implementación do método viaxar: Consume 1 unidade de combustible
 *          por cada km. Mostrará o tipo de nave (de carga neste caso), o modelo
 *          da nave e o combustible restante despois de recorrida a distancia.
 *
 *    · CazaEstelar:
 *        - Implementa a interface Combativo.
 *        - Implementación de viaxar: Consume 2 unidades de combustible por cada km.
 *          Mostrará o tipo de nave (de combate neste caso), o modelo da nave e o
 *          combustible restante despois de recorrida a distancia.
 *        - Implementación de activarEscudos: Mostra unha mensaxe indicando que
 *          os escudos de enerxía están ao 100%.
 *
 * 4. Clase Main (método main()):
 *    - Declarar un ArrayList<Vehiculo> para almacenar a frota.
 *    - Engadir ao ArrayList unha nave de cada tipo.
 *    - Executar unha misión de 50 km: Percorre a lista e fai que todos os
 *      vehículos viaxen esa distancia (método viaxar()). Se un vehículo é de
 *      tipo Combativo, debe activar os escudos antes de viaxar.
 *
 * NOTA: Esta solución evita o uso de instanceof aplicando polimorfismo puro.
 *       O método prepararMision() está definido (vacío) en Vehiculo e
 *       sobreescrito en CazaEstelar para activar os escudos. Así o bucle
 *       do Main non necesita coñecer o tipo concreto de cada vehículo.
 */
package examepoocolec;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class ExamePOOColec {

    public static void main(String[] args) {

        /* 1. Declaramos un ArrayList de tipo Vehiculo para almacenar toda la flota.
            Gracias al polimorfismo, puede contener NaveCarga Y CazaEstelar,
            porque ambas son subclases de Vehiculo.*/
        ArrayList<Vehiculo> frota = new ArrayList<>();

        // 2. Añadimos una nave de cada tipo a la flota
        frota.add(new NaveCarga("NC-001", "Halcón Mercante", 200.0, 5000));
        frota.add(new CazaEstelar("CE-002", "X-Wing Estelar", 200.0));

        // 3. Ejecutamos una misión de 50 km para toda la flota
        System.out.println(" < MISIÓN: Recorrido de 50 km >\n");

        for (Vehiculo v : frota) {
            /* prepararMision() no hace nada en NaveCarga (método vacío heredado),
             pero en CazaEstelar activa los escudos. Sin instanceof, limpio y extensible.*/
            v.prepararMision();

            // Cada vehículo usa su propia versión de viaxar() (polimorfismo)
            v.viaxar(50);

            System.out.println(); // Separador entre vehículos
        }

        System.out.println("¡Misión completada!");

    }

}
