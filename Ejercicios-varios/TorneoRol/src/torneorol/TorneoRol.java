/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneorol;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class TorneoRol {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Torneo torneo = new Torneo("Copa del Caos");
        Guerrero g = new Guerrero("Thorin", 5, 120, 40, 15);
        Mago m = new Mago("Gandalf", 5, 70, 80, 6);
        Arquero a = new Arquero("Legolas", 5, 90, 30, 12);
        Brujo b = new Brujo("Warlock", 5, 65, 70, 4);
        torneo.inscribir(g);
        torneo.inscribir(m);
        torneo.inscribir(a);
        torneo.inscribir(b);
        torneo.combatir(g, m);
        torneo.combatir(a, b);
        torneo.combatir(g, a);
        torneo.combatir(m, b);
        torneo.mostrarRanking();
        torneo.mostrarPorClase();
        System.out.println("Nombre del nuevo guerrero:");
        String nombre = teclado.nextLine();
        Guerrero nuevo = new Guerrero(nombre, 40, 100, 35, 10);
        torneo.inscribir(nuevo);
        torneo.combatir(nuevo, m);
        torneo.mostrarRanking();
    }

}
