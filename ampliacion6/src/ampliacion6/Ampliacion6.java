package ampliacion6;

import java.util.Scanner;

public class Ampliacion6 {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        double nota = 0;
        int examenA = 0;
        int examenB = 0;
        double mediaA = 0;
        double mediaB = 0;
        double totalA = 0;
        double totalB = 0;
        int tipoExamen = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println("Introduzca la nota del alumno (" + i + "/10)");
            Scanner teclado = new Scanner(System.in);
            nota = teclado.nextInt();
            while (nota < 0 || nota > 10) {
                System.out.println("Nota incorrecta. Debe estar entre 1 y 10");
                nota = teclado.nextDouble();
            }
            System.out.println("Introduzca tipo del examen. 1 para A 2 para B");
            tipoExamen = teclado.nextInt();
            while(tipoExamen > 2 || tipoExamen < 1) {
                System.out.println("ERROR. Las opciones son 1 para A y 2 para N");
                tipoExamen = teclado.nextInt();
            }
            switch (tipoExamen) {
                case 1:
                    examenA++;
                    totalA += nota;
                    break;
                case 2:
                    examenB++;
                    totalB += nota;
                    break;
            }
            if (totalA > 0) {
                mediaA = totalA / examenA;
            } else {
                mediaA = 0;
            }
            if (totalB > 0) {
                mediaB = totalB / examenB;
            } else {
                mediaB = 0;
            }
        }
        System.out.println("Media del examen tipo A: " + mediaA);
        System.out.println("Media del examen tipo B: " + mediaB);
    }

}
