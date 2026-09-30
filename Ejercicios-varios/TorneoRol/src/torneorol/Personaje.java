/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 2: personaje añade vida, puntos en el torneo y comportamientos
abstract class Personaje extends EntidadJuego {

    protected int vidaMaxima;
    protected int vidaActual;
    protected int puntosTorneo;

    public Personaje(String nombre, int nivel, int vida) {
        super(nombre, nivel);
        this.vidaMaxima = vida;
        this.vidaActual = vida;
        this.puntosTorneo = 0;
    }

    public abstract int calcularAtaque();

    public abstract int calcularDefensa();

    public abstract String getClase();
// Logica de combate comun: un personaje recibe danio reducido por su defensa

    public void recibirAtaque(int danioEntranteTotal) {
        int danioReal = Math.max(0, danioEntranteTotal - calcularDefensa());
        vidaActual = Math.max(0, vidaActual - danioReal);
    }
// Sube puntos al ganar; se llama desde la logica del torneo

    public void ganarPuntos(int puntos) {
        puntosTorneo += puntos;
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }

    public int getPuntos() {
        return puntosTorneo;
    }

    public void restaurarVida() {
        vidaActual = vidaMaxima;
    }

    public String estado() {
        return getClase() + " " + nombre + " | Nv." + nivel
                + " | Vida: " + vidaActual + "/" + vidaMaxima
                + " | Ataque: " + calcularAtaque()
                + " | Defensa: " + calcularDefensa()
                + " | Puntos: " + puntosTorneo;
    }
}
