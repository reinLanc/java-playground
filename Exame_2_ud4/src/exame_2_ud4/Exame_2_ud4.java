package exame_2_ud4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exame_2_ud4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
          ArrayList<String> lista = new ArrayList<>();
        System.out.println("Introducir frase:");
        String frase = teclado.nextLine();
       lista.add(frase);
        while(!frase.isEmpty()) {

            System.out.println("Introducir Frase:");
            frase = teclado.nextLine();
            lista.add(frase);
        }       
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
      
    }
    
}
}