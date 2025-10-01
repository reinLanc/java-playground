/*
 * Programa que pinta una diana
 */
package diana;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Diana extends JFrame {

    public Diana() {
        super("Diana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.fillOval(50, 50, 450, 450);
        g.setColor(new Color(255, 255, 255));
        g.fillOval(100, 100, 350, 350);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(150, 150, 250, 250);
        g.setColor(new Color(255, 255, 255));
        g.fillOval(200, 200, 150, 150);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(250, 250, 50, 50);
    }

    public static void main(String[] args) {
        Diana diana;
        diana = new Diana();
        diana.setVisible(true);
    }

}
