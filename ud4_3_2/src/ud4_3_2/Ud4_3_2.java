package ud4_3_2;

import java.util.Scanner;

public class Ud4_3_2 {

    public static void main(String[] args) {
        Scanner teclado;
        Vehiculo v[];
        String modelo;
        int potencia;
        boolean traccion;
        int i;

        teclado = new Scanner(System.in);
        v = new Vehiculo[1000];
        System.out.println("Introduce modelo ");
        modelo = teclado.nextLine();
        for (i = 0; !modelo.equalsIgnoreCase("Fin"); i++) {
            System.out.println("Introduce potencia");
            potencia = Integer.parseInt(teclado.nextLine());
            System.out.println("Tiene tracción cuatro ruedas s/n ?");
            traccion = teclado.nextLine().equalsIgnoreCase("s");
            v[i] = new Vehiculo(modelo);
            v[i].ponPotencia(potencia);
            v[i].ponTracción(traccion);
            System.out.println("Introduce modelo ");
            modelo = teclado.nextLine();
        }

        for (i = 0; v[i] != null; i++) {
            System.out.println(v[i].muestraVehículo());
        }
    }

}
