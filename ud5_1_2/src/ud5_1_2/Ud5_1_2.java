package ud5_1_2;
public class Ud5_1_2 {
    public static void main(String[] args) {
        vehiculo v1;
        v1 = new vehiculo("Mazda");
        v1.ponPotencia(120);
        v1.ponTracción(true);
        System.out.println(v1.imprimir());
    }
    
}
