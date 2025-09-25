
package ud7_2_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class Ud7_2_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Botons");
        int i;
        JPanel panelNorte,panelSur,panelInterno;
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(2,1));
        
        panelNorte = new JPanel();
        panelNorte.setLayout(new GridLayout(2,3));
        
        for(i=0;i<6;i++)
         panelNorte.add(new JButton("Botón " + i));
        
        panelSur=new JPanel();
        panelSur.setLayout(new BorderLayout());
        panelInterno = new JPanel();
        panelSur.add(panelInterno,BorderLayout.SOUTH);
        panelInterno.add(new JButton("Botón 7"));
        JButton boton8 = new JButton("Botón 8");
        panelInterno.add(boton8);
        f.add(panelNorte);
        f.add(panelSur);
        f.setSize(325,175);
        f.setVisible(true);
    }
    
}
