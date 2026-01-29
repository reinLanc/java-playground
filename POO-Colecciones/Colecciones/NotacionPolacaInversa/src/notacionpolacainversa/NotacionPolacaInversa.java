/*
Programa que procese expresiones aritméticas en notación polaca inversa (RPN).
Para ello, se debe utilizar un ArrayList como pila, introduciendo los operandos y realizando las operaciones
cuando se encuentre un operador (+, -, *, /).
Al finalizar el procesamiento de la expresión, el programa debe mostrar el resultado final.
 */
package notacionpolacainversa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Reinaldo Gil
 */
public class NotacionPolacaInversa {

    public static void main(String[] args) {
        ArrayList e1 = new ArrayList(Arrays.asList("3", "10", "5", "+", "*"));
        ArrayList e2 = new ArrayList(Arrays.asList("3", "4", "*", "5", "6", "*", "+"));
        ArrayList e3 = new ArrayList(Arrays.asList("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"));

        System.out.println(procesarExpresionRPN(e1) + " = 45");
        System.out.println(procesarExpresionRPN(e2) + " = 42");
        System.out.println(procesarExpresionRPN(e3) + " = 22");
    }

    static int procesarExpresionRPN(ArrayList expresion) {
        Stack pila = new Stack();
        String c;
        int n_l;
        int n_r;
        int res;

        for (int i = 0; i < expresion.size(); i++) {
            c = (String) expresion.get(i);
            if (c.equals("*") || c.equals("/") || c.equals("+") || c.equals("-")) {
                n_r = (int) pila.pop();
                n_l = (int) pila.pop();

                if (c.equals("*")) {
                    res = n_l * n_r;
                } else if (c.equals("/")) {
                    res = n_l / n_r;
                } else if (c.equals("-")) {
                    res = n_l - n_r;
                } else {
                    res = n_l + n_r;
                }

                pila.push(res);

            } else {
                pila.push(Integer.parseInt(c));
            }
        }
        return (int) pila.pop();
    }
}
