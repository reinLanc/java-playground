
package practica62;

import java.util.Scanner;

public class Practica62 {

    static Scanner teclado=new Scanner(System.in); //declarado global para poder usalo en tódolos métodos

    public static void main(String[] args) {
        int opcion;
        
        do
        {
            System.out.println("\n1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("Introducir opción (1-3, 0 finaliza)");
            opcion=teclado.nextInt();
            
            switch(opcion)
            {
                case 1: System.out.println("Área: "+cuadrado());
                        break;
                case 2: System.out.println("Área: "+rectangulo());
                        break;
                case 3: System.out.println("Área: "+circulo());
                        break;
            }
        } while(opcion!=0);
        
    }
    
    public static int cuadrado()
    {  
        int lado;
        
        System.out.println("Introduce el lado del cuadrado: ");
        lado=teclado.nextInt();
        
        return lado*lado;
        
    }
    
    public static int rectangulo()
    {  
        int base,altura;
        
        System.out.println("Introduce la base del rectángulo: ");
        base=teclado.nextInt();
        System.out.println("Introduce la altura del rectángulo: ");
        altura=teclado.nextInt();
        
        return base*altura;
    }    
    
    public static double circulo()
    {  
        int radio;
        
        System.out.println("Introduce el radio del círculo: ");
        radio=teclado.nextInt();
        
        return Math.PI*radio*radio;
    }  
    
}
