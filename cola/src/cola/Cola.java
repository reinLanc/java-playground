package cola;

import java.util.LinkedList;

public class Cola {

    public static void main(String[] args) {
        LinkedList<Persona> cola = new LinkedList<>();

        generarCola(cola);
        double recaudacion;
        double recaudacionTotal = 0;
        Persona espectadorActual;
        int edadActual;

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
        System.out.println("Cola: " + cola.size());

    }

    public static void generarCola(LinkedList<Persona> cola) {

        int numeroPersonas = generaNumeroAleatorio(1, 5);

        for (int i = 0; i < numeroPersonas; i++) {
            cola.addLast(new Persona(generaNumeroAleatorio(5, 60)));
            System.out.println("cola: " + cola.size());
        }

    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}


