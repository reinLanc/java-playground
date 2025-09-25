
package ud3_4_6;

public class Ud3_4_6 {

    public static void main(String[] args) {

        for (int i = -100; i <= 100; i++) {
            //Paso obligatorio al trabajar con funciones trigonometricas.
            double xRadianes = Math.toRadians(i);
            double funcion = Math.sin(4 * xRadianes) + Math.cos(xRadianes * 2);
            System.out.println("f(" + i + ") = sen(4*" + i + ") + cos(2*" + i + ") = " + funcion);
        }
    }

}
