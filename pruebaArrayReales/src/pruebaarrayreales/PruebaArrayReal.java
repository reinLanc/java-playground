package pruebaarrayreales;
public class PruebaArrayReal implements Estadisticas {
    double[] valor;
    
    PruebaArrayReal()
    {
        valor = new double[15];
        for (int i = 0; i < valor.length; i++) {
            valor[i] = (int)Math.floor(Math.random()*8+1);
        }
    }

    public double minimo() {
        double menor = valor[0];
        for (int i = 1; i < valor.length; i++) {
            if (menor > valor[i]) {
                menor = valor[i];
            }
        }
        return menor;
    }

    public double maximo() {
        double mayor = valor[0];
        for (int i = 1; i < valor.length; i++) {
            if (mayor < valor[i]) {
                mayor = valor[i];
            }
        }
        return mayor;
    }

    public double sumatorio() {
        double suma = 0.0;
        for (int i = 0; i < valor.length; i++) {
            suma += valor[i];
        }
        return suma;
    }

    public void imprimir() {
        for (int i = 0; i < valor.length; i++) {
            System.out.println("x[" + i + "]=" + valor[i]);
        }
    }
}
