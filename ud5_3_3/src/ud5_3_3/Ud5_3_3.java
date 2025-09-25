/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud5_3_3;

/**
 *
 * @author gilguerei
 */
public class Ud5_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al1 = new Alumno(1, "ALFA", 6.5);
        Alumno al2 = new Alumno(2, "BETA", 4.5);
        Alumno al3 = new Alumno(3, "GAMMA", 5.5);
        

//             Crear el curso llamado ASIR.
        Grupo gru = new Grupo("ASIR");

//           imprimir alumnos del curso
        System.out.println("Listado alumnos:\n ");
        gru.imprimir();

//            Matricular a ALFA y BETA en el curso ASIR.
        if (!gru.estaInscrito(al1)) {
            gru.matricular(al1);
        } else {
            System.out.println(al1.getNombre() + " ya está inscrito");
        }

        if (!gru.estaInscrito(al2)) {
            gru.matricular(al2);
        } else {
            System.out.println(al2.getNombre() + " ya está inscrito");
        }

//            Mostrar en pantalla, utilizando el método estaInscrito(), si BETA
//                y GAMMA están inscritos en el curso.
        if (gru.estaInscrito(al2)) {
            System.out.println(al2.getNombre() + " está inscrito");
        } else {
            System.out.println(al2.getNombre() + " no está inscrito");
        }

        if (gru.estaInscrito(al3)) {
            System.out.println(al3.getNombre() + " está inscrito");
        } else {
            System.out.println(al3.getNombre() + " no está inscrito");
        }

//              eliminar BETA
        if (gru.eliminar(al2)) {
            System.out.println(al2.getNombre() + " ha sido eliminado");
        } else {
            System.out.println(al2.getNombre() + " no ha podido eliminarse");
        }

//              imprimir
        System.out.println("Listado alumnos: ");
        gru.imprimir();
    }
}
