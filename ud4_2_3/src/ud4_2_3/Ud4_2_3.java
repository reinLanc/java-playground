package ud4_2_3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ud4_2_3 {

    public static void main(String[] args) {
        TreeMap<String, String> lista = new TreeMap();
        Map.Entry entrada;
        lista.put("123", "Mercedes");
        lista.put("231", "Mercedes");
        lista.put("5", "Mustang");
        lista.put("4", "Ferrari");
        lista.put("7", "Twingo");
        lista.put("6", "4Runner");
        lista.put("3", "Explorer");
        lista.put("232", "Mercedes");
        lista.put("6", "Cherokee");
        
        
        Iterator i = lista.entrySet().iterator();
        
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Matriculas de coches de la marca \"Mercedes\"");
        i = lista.entrySet().iterator();
        while (i.hasNext()) {
            entrada = (Map.Entry)i.next();
            if (((String)(entrada.getValue())).contains("Mercedes"))
            {
                System.out.println(entrada.getKey());
            }
        }

    }

}
