package grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grafica extends JFrame {

    int zoom = 100; //variable que indicará el porcentaje de zoom

    public Grafica() {
        super("Grafica");
        JButton botonMas, botonMenos;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        setLayout(null);  //non se fija ningún diseño y se colocarán los controles por coordenadas

        botonMas = new JButton("zoom +");
        botonMas.setBounds(700,500,75,20);  //posición y tamaño
        botonMas.addActionListener(
                new ActionListener()  //se crea un objeto desde un interface, que en principio no
                {                     //se puede instanciar, pero si implementando todos sus métodos
                    public void actionPerformed(ActionEvent e)
                    {
                        zoom+=30;
                        repaint();
                    }
                });

        botonMenos = new JButton("zoom -");
        botonMenos.setBounds(700,525,75,20);
        botonMenos.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        if(zoom>50)
                          zoom-=30;
                        else if (zoom>5)
                          zoom-=5;
                        repaint();
                    }
                });

         add(botonMenos);  //se añaden los botones a JFrame
         add(botonMas);

    }


    /* Tamaño de frame 800x600
     * Centro de coordenadas en (400,300)
     * La variable i recorrerá las coordenadas x del JFrame desde 0 a 799
     * Las variables a, aRadianes almacenarán la coordenada x que representa i pero trasladadas respecto origen de coordenadas y aplicado el zoom
     * Las variables b, bRadianes almacenarán la coordenada x que representa i pero trasladadas respecto origen de coordenadas y aplicado el zoom
     */
    public void paint(Graphics g) {
        int i;
        double a, aRadianes, b, bRadianes;

        super.paint(g);

        g.setColor(Color.black);         //pintar origen de coordenadas
        g.drawLine(0, 300, 799, 300);
        g.drawLine(400, 0, 400, 599);

        g.setColor(new Color(0, 200, 0));
        for (i = 0; i < 799; i++) {
            a = (i - 400) / (4.0*zoom/100);
            aRadianes = Math.toRadians(a);
            b = ((i + 1) - 400) / (4.0*zoom/100);
            bRadianes = Math.toRadians(b);
            g.drawLine(i,
                    (int) ((Math.sin(4 * aRadianes) + Math.cos(2 * aRadianes)) * -100 + 300),
                    i + 1,
                    (int) ((Math.sin(4 * bRadianes) + Math.cos(2 * bRadianes)) * -100 + 300));
            //Se multiplica por -100 para que los valores que devuelve la función entre -2 y 2 queden
            //entre -200 y 200 y además se invierta la función ya que en java las coordenadas y crecen
            //al bajar en la pantalla y en matemáticas al subir.
            //Se suma 300 para trasladar el origen de coordenadas al centro del JFrame
        }

    }

    public static void main(String[] args) {
        Grafica grafica;

        grafica = new Grafica();
        grafica.setVisible(true);
    }
}