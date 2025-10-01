package practica61;

import java.util.Scanner;

public class Practica61 {
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
                case 1: cuadrado();
                        break;
                case 2: rectangulo();
                        break;
                case 3: circulo();
                        break;
            }
        } while(opcion!=0);
        
    }
    
    public static void cuadrado()
    {  
        int lado;
        
        System.out.println("Introduce el lado del cuadrado: ");
        lado=teclado.nextInt();
        
        System.out.println("Área del cuadrado: "+lado*lado);
    }
    
    public static void rectangulo()
    {  
        int base,altura;
        
        System.out.println("Introduce la base del rectángulo: ");
        base=teclado.nextInt();
        System.out.println("Introduce la altura del rectángulo: ");
        altura=teclado.nextInt();
        
        System.out.println("Área del rectángulo: "+base*altura);
    }    
    
    public static void circulo()
    {  
        int radio;
        
        System.out.println("Introduce el radio del círculo: ");
        radio=teclado.nextInt();
        
        System.out.println("Área del círculo es: "+Math.PI*radio*radio);
    }    
}
