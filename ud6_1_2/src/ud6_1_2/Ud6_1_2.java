package ud6_1_2;
public class Ud6_1_2 {
    public static void main(String[] args) {
        LecturaDatos2 leer2 = new LecturaDatos2();
        
        System.out.println(leer2.leeTexto("Introduce un texto"));
        System.out.println(leer2.leeEntero("Introduce un valor entero"));
        System.out.println(leer2.leeDoble("Introduce un valor doble"));
        System.out.println(leer2.leeCaracter("Introduce un caracter"));
    }
    
}
