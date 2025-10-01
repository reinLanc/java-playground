package matrizsinrepetir;

import java.util.ArrayList;
import java.util.LinkedList;

public class MatrizSinRepetir {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        ArrayList li = new ArrayList();

        for (int fil = 0; fil)  {
            for (int col = 0; col matriz[fil][col] = (int) (Math.random() * 9 + 1);
        }

        for (int i = 0; i < li.size(); i++) {
            if (li.contains(matriz[fil][col])) {
                matriz[fil][col] = (int) (Math.random() * 9 + 1);
            }
        }
        li.add(matriz[fil][col]);
    }
}

for(int fil=0;fil for(int col=0;col System.out.print(matriz[fil][col]);
System.out.print(" ");
}System.out.println();
}

}

}
