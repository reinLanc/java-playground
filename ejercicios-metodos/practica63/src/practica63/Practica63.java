
package practica63;

import java.util.Scanner;

public class Practica63 {

static Scanner teclado=new Scanner(System.in); //declarado global para poder usalo en tódolos métodos

    public static void main(String[] args) {
        int opcion, l, b, a, r;
        
        do
        {
            System.out.println("\n1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("Introducir opción (1-3, 0 finaliza)");
            opcion=teclado.nextInt();
            
            switch(opcion)
            {
                case 1: 
                        System.out.println("Introduce el lado del cuadrado: ");
                        l=teclado.nextInt();                    
                        System.out.println("Área: "+cuadrado(l));
                        break;
                case 2: 
                        System.out.println("Introduce la base de rectángulo: ");
                        b=teclado.nextInt();  
                        System.out.println("Introduce la altura de rectángulo: ");
                        a=teclado.nextInt();  
                        System.out.println("Área: "+rectangulo(b,a));
                        break;
                case 3: 
                        System.out.println("Introduce el radio del círculo: ");
                        r=teclado.nextInt();
                        System.out.println("Área: "+circulo(r));
                        break;
            }
        } while(opcion!=0);
        
    }
    
    public static int cuadrado(int lado)
    {   
        return lado*lado;
    }
    
    public static int rectangulo(int base, int altura)
    {  
        return base*altura;
    }    
    
    public static double circulo(int radio)
    {  
        return Math.PI*radio*radio;
    }  
}
