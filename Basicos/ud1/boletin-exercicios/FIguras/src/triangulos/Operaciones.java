package triangulos;

/**
 *
 * @author Reinaldo Gil * Esta aplicación calcula el área y el perímetro de un
 * triángulo usando valores predefinidos de base, altura y lados.
 *
 *
 */
public class Operaciones {

    public static void main(String[] args) {
        // Base del triángulo para calcular el área
        double base = 10.0;

        // Altura del triángulo para calcular el área
        double altura = 12.0;

        // Lados del triángulo para calcular el perímetro
        double lado1 = 10.0;
        double lado2 = 12.0;
        double lado3 = 12.0;

        // Cálculo del área: (base × altura) / 2
        double area = (base * altura) / 2;

        // Cálculo del perímetro: suma de los tres lados
        double perimetro = lado1 + lado2 + lado3;

        // Mostramos los resultados
        System.out.println("=== CÁLCULOS DEL TRIÁNGULO ===");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

/* EXPLICACIÓN:
 * Área del triángulo = (base × altura) / 2
 * Con base=10 y altura=12: (10 × 12) / 2 = 60
 * 
 * Perímetro = suma de los tres lados
 * Con lados 10, 12, 12: 10 + 12 + 12 = 34
 */
