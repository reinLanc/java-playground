/*
Un conjunto de personas esperaran la cola para sacar una entrada, tendremos que calcular la entrada
según la edad de la persona (mínimo 5 años).
La edad de las personas se generan aleatoriamente entre 5 y 60 años. 
Se recomienda realizar un método en el main para generar Personas en la cola.
Al final, deberemos mostrar la cantidad total recaudada.
El número de personas de la cola se elige al azar entre 0 y 50.
Edad	                  Precio
Entre 5 y 10 años	1 €
Entre 11 y 17 años	2.5 €
Mayor de 18 años	3.5 €
 */
package Ejercicio1;

import common.Persona;
import java.util.LinkedList;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        //Creamos la cola, al crearla ya creamos el numero de personas
        LinkedList<Persona> cola = new LinkedList<>();

        //Generamos la cola
        generarCola(cola);

        //Creamos variables que nos seran útiles
        double recaudacion;
        double recaudacionTotal = 0;
        Persona espectadorActual;
        int edadActual;

        //Recorremos la cola
        while (!cola.isEmpty()) {

            //"Atendemos" al espectador para que pague
            espectadorActual = cola.getFirst();
            edadActual = espectadorActual.getEdad();

            //Comprobamosla edad
            if (edadActual >= 5 && edadActual <= 10) {
                recaudacion = 1;
            } else if (edadActual >= 11 && edadActual <= 17) {
                recaudacion = 2.5;
            } else {
                recaudacion = 3.5;
            }
            recaudacionTotal += recaudacion;

            System.out.println("Una persona de " + edadActual + " años se le ha cobrado " + recaudacion + " euros");

            //Quitamos al espectador de la cola
            //Tambien hemos podido usar al principio el meotodo devolverYBorrarPrimero();
            cola.removeFirst();

        }

        //Mostramos el resultado
        System.out.println("La recaudación es de " + recaudacionTotal + " euros");

    }

    /**
     * Genera una cola de personas
     *
     * @param cola
     */
    public static void generarCola(LinkedList<Persona> cola) {

        int numeroPersonas = generaNumeroAleatorio(1, 50);

        for (int i = 0; i < numeroPersonas; i++) {
            cola.addLast(new Persona(generaNumeroAleatorio(5, 60)));
        }

    }

    /**
     * Genera un numero aleatorio entre dos numeros. Entre el minimo y el maximo
     * incluidos
     *
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
}
