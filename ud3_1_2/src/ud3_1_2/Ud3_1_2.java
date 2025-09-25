/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_1_2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 *
 * @author gilguerei
 */
public class Ud3_1_2 extends JFrame {

    public Ud3_1_2() {
        super("ud3_1_2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(50, 50, 450, 450);
        
        g.setColor(new Color(255, 255, 255));
        g.fillOval(100, 100, 350, 350);
        
        g.setColor(new Color(255, 0, 0));
        g.fillOval(150, 150, 250, 250);

        g.setColor(new Color(255, 255, 255));
        g.fillOval(200, 200, 150, 150);

        g.setColor(new Color(0, 25, 0));
        g.fillOval(250, 250, 50, 50);
    }

    public static void main(String[] args) {
        Ud3_1_2 ud3_1_2;
        ud3_1_2 = new Ud3_1_2();
        ud3_1_2.setVisible(true);
    }

}
