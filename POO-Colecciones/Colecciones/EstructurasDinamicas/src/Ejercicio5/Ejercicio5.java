/*
 Un amigo funcionario nos pide que le hagamos un informe para sus informes. 
Debemos gestionar informes que están formados de un código numérico y una tarea que pueden ser
ADMINISTRATIVO, EMPRESARIAL y PERSONAL. Debe comprobarse que la tarea es alguna de estas.
Nuestro amigo quiere que seamos capaz de agregar y eliminar informes en forma de pila
(el último en entrar, es el primero en salir). 
Agrega 10 informes y muestra su contenido, elimina todo el contenido y agrega de nuevo 5 informes.
Puedes crear los informes como quieras.
 */
package Ejercicio5;

import java.util.LinkedList;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        LinkedList<Informe> informes = new LinkedList<>();

        //Agregamos 10 informes
        for (int i = 1; i <= 10; i++) {
            //Genero los informes
            informes.addLast(new Informe(i, generaNumeroAleatorio(0, 2)));
        }

        System.out.println("Primeros diez informes agregados: ");

        //Mostramos los ultimos informes
        LinkedList<Informe> aux = new LinkedList<>();

        //Paso los datos en una lista llamado aux
        while (!informes.isEmpty()) {
            aux.addLast(informes.getLast());
            informes.removeLast();

            System.out.println(aux.getLast());
        }

        informes = aux;

        //Los eliminamos todos, uno a uno
        while (!informes.isEmpty()) {
            informes.removeLast();
        }

        System.out.println("Informes eliminados");

        //Agregamos 5 informes mas
        for (int i = 1; i <= 5; i++) {
            //Genero los informes
            informes.addLast(new Informe(i, generaNumeroAleatorio(0, 2)));
        }

        System.out.println("Agregados 5 informes");

        //Mostramos los ultimos informes
        aux = new LinkedList<>();

        while (!informes.isEmpty()) {
            aux.addLast(informes.getLast());
            informes.removeLast();

            System.out.println(aux.getLast());
        }

        //Dejamos informes con los datos de aux;
        informes = aux;
        aux = null; //La dejamos sin referenciar

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
