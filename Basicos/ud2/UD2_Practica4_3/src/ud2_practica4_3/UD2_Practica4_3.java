package ud2_practica4_3;

public class UD2_Practica4_3 {

    public static void main(String[] args) {
        int j,x=1;
        

        bucleA:
        for (j = 1; j < 10 && (x*j<=400 || x==50) ; j++) {
            System.out.println("j= " + j);
            x = 1;
            while (x < 50 && x*j<=400) {
                System.out.println(x + " " + x * j);
                x++;
            }
        }
    }

}
