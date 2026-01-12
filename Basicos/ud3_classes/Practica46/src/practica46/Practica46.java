package practica46;

public class Practica46 {

    public static void main(String[] args) {
        int x;
        double r;

        for(x=-100;x<=100;x++)
        {
            r=Math.toRadians(x);
            System.out.println(x+" "+(Math.sin(4*r)+Math.cos(2*r)));
        }
    }
    
}
