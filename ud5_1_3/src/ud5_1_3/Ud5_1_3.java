package ud5_1_3;

import java.util.Scanner;

public class Ud5_1_3 {
    public static void main(String[] args) {
        System.out.println("Numero de matricula del alumno?");
        Scanner teclado = new Scanner(System.in);
        int nmatricula = teclado.nextInt();
        System.out.println("Introduzca el nombre del alumno:");
        teclado.nextLine();
        String nombre = teclado.nextLine();
        System.out.println("Introduzca la Nota 1");
        double n1 = teclado.nextDouble();
        System.out.println("Introduzca la Nota 2");
        double n2 = teclado.nextDouble();
        //LAMADA A METODOS
        Alumno reinaldo = new Alumno(nmatricula,nombre);
        reinaldo.ponNotas(n1, n2);
        System.out.println(reinaldo.muestraAlumno());
    }
    
}
