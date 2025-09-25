package ud6_1_1;
public class Ud6_1_1 {
    public static void main(String[] args) {
      LecturaDatos leer = new LecturaDatos();
        System.out.println(leer.leeTexto("Introduce un texto"));
        System.out.println(leer.leeEntero("Introduce un valor entero"));
        System.out.println(leer.leeDoble("Introduce un valor doble"));
        System.out.println(leer.leeCaracter("Introduce un caracter"));
    }
}
