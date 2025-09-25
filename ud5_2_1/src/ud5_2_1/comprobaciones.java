package ud5_2_1;

public class comprobaciones {

    static boolean esSimetrico(String texto) {
        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean esCapicua(int numero) {
        return esSimetrico(numero + "");
    }

    static boolean esPrimo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean esPerfecto(int numero) {
        boolean perfecto = false;
        if (numero == 1){
            return false;
        }

        int suma = 1;
  
        for (int i = 2; i < numero; i++) 
        {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero) 
            return true;
  
        return false;
    }
    
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static boolean esAntiguo(int año) {
        return año < 1900;
    }

    static boolean esTriangulo(double a, double b, double c) {
        return a < b + c && b < a + c && c < b + a;
    }

    static boolean estaIntervalo(int menor, int mayor, int numero) {
        return (numero > menor) && (numero < mayor);
    }

    static boolean esPositivo(int numero) {
        return numero > 0;
    }

    static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
