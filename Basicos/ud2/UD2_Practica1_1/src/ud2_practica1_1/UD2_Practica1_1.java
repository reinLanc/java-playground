/*
 * Cálculo de expresiones booleanas
 */
package ud2_practica1_1;

public class UD2_Practica1_1 {

    public static void main(String[] args) {
        System.out.println("(true && true) || false == true --> " 
                            + ((true && true) || false == true ));
        
        System.out.println("(false || false) && false == true --> " 
                            + ((false || false) && false == true ));
        
        System.out.println("(!(true && false)) == false --> "
                            + ((!(true && false)) == false));
        System.out.println("");
        
        int i = 1, j = 0, k = -1;
        System.out.println("i = 1, j = 0, k = -1");
        System.out.println("i + k <= j - k * 3 && k >= 2 --> "
                            + (i + k <= j - k * 3 && k >= 2));
        System.out.println("");
        
        i = 3;
        j = 2;
        k = -1;
        System.out.println("i = 3, j = 2, k = -1");
        System.out.println("i == 3 || j <= 2 && k > 0 --> "
                           + (i == 3 || j <= 2 && k > 0));
        System.out.println("");
        
        i = 1;
        System.out.println("i = 1");
        System.out.println("3 == 2 || 5 > i + i-->" + (3 == 2 || 5 > i + i)); 
        System.out.println("");

        
        int x = 1, y = 4, z = 10;
        double PI = 3.1416;
        System.out.println("x = 1, y = 4, z = 10");
        System.out.println("PI * x * x > y || 2 * PI * x <= z --> "
                           + (PI * x * x > y || 2 * PI * x <= z));
        System.out.println("x > 3 && (y == 4 || x + y <= z) --> "
                            + (x > 3 && (y == 4 || x + y <= z)));
        
        
    }
    
}
