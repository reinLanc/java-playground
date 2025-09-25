package ud6_1_4;

import java.time.LocalDateTime;

public class Ud6_1_4 {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.printf("Dia: %1$tA,%1$td de %1$tB de %1$tY%nHora: %1$tH:%1$tM:%1$tS%n",fecha);
    }
    
}
