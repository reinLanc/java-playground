package pruebamath3;

public class PruebaMath3 {

    public static void main(String[] args) {
        // Para emplear los metodos de la clase Math3 es necesario
// crear una instancia de la clase Math3
        Math3 aux = new Math3();
        int[] n = new int[12];
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (100 * Math.random() + 1);
            System.out.println("n[" + i + "] = " + n[i]);
        }
        System.out.println("Minimo : " + aux.min(n));
        System.out.println("Maximo : " + aux.max(n));
    }

}
