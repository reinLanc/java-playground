package practica3;
import java.util.Arrays;
public class Practica3 {
    public static void main(String[] args) {
        int minimo = 1;
        int maximo = 100;
        int longitud = 16;

        if (maximo < minimo) {
            int aux = maximo;
            maximo = minimo;
            minimo = aux;
        }

        if ((maximo - minimo) >= (longitud - 1)) {

            int numero_elementos = 0;
            int numeros[] = new int[longitud];
            int matriz[][] = new int[4][4];
            Arrays.fill(numeros, minimo - 1);
            boolean encontrado;
            int aleatorio;
            while (numero_elementos < longitud) {

                aleatorio = generaNumeroAleatorio(minimo, maximo);
                encontrado = false;
                for (int i = 0; i < numeros.length && !encontrado; i++) {
                    if (aleatorio == numeros[i]) {
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("El numero existe: " + aleatorio);
                } else {
                    numeros[numero_elementos++] = aleatorio;
                    System.out.println("Agregado el numero: " + aleatorio);
                }

            }

            //Mostramos el arreglo
            System.out.println("Mostrar arreglo");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }

        } else {
            System.out.println("Que no se puede generar");
        }
        for(int i = 0; )
    }

    //Genera un numero aleatorio entre el minimo y el maximo, includo el maximo y el minimo
    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
