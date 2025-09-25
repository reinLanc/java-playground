package ud7_2_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ud7_2_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Formulario");
        JPanel panelNorte,panelSur,panelEste,panelOeste,
        panelCentro;
        JLabel extras,seleccione,tipo,nombre;
        JCheckBox piscina,jardin,garaje;
        JRadioButton rb1,rb2,rb3;
        ButtonGroup grupo;
        JComboBox tipoVivienda;
        JTextField campoNombre;
        JButton enviar,borrar;
        
        panelNorte = new JPanel();
        panelSur=new JPanel();
        panelEste=new JPanel();
        panelOeste=new JPanel();
        panelOeste.setLayout(new GridLayout(4,1));
        panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(4,1));
        
        extras=new JLabel("Extras");
        panelOeste.add(extras);
        piscina=new JCheckBox("Piscina");
        panelOeste.add(piscina);
        jardin = new JCheckBox("Jardin");
        panelOeste.add(jardin);
        garaje=new JCheckBox("Garaje");
        panelOeste.add(garaje);
        
        seleccione = new JLabel("Seleccione el precio deseado");
        grupo = new ButtonGroup();
        rb1 = new JRadioButton("Menos de 100.000 €");
        grupo.add(rb1);
                rb2 = new JRadioButton("Entre 100.000 y 200.000 €");
        grupo.add(rb2);
                rb3 = new JRadioButton("Más de 200.000 €");
        grupo.add(rb3);
        panelCentro.add(seleccione);
        panelCentro.add(rb1);
           panelCentro.add(rb2);
              panelCentro.add(rb3);
              
              tipo = new JLabel("Tipo");
              tipoVivienda = new JComboBox();
              tipoVivienda.addItem("Piso");
              tipoVivienda.addItem("Casa");
              tipoVivienda.addItem("Apartamento");
              panelEste.add(tipo);
              panelEste.add(tipoVivienda);
              
              nombre = new JLabel("Nombre");
              campoNombre=new JTextField(15);
              panelNorte.add(nombre);
              panelNorte.add(campoNombre);
              
              enviar=new  JButton("Enviar");
              borrar=new JButton("Borrar");
              panelSur.add(enviar);
              panelSur.add(borrar);
              
              f.getContentPane().setLayout(new BorderLayout(20,20));
              panelEste.setBorder(new LineBorder(Color.BLUE));
              panelOeste.setBorder(new LineBorder(Color.BLUE));
              panelCentro.setBorder(new LineBorder(Color.BLUE));
              f.add(panelNorte,BorderLayout.NORTH);
              f.add(panelSur,BorderLayout.SOUTH);
              f.add(panelEste,BorderLayout.EAST);
              f.add(panelOeste,BorderLayout.WEST);
              f.add(panelCentro,BorderLayout.CENTER);
              
              ((JPanel)f.getContentPane()).setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              f.setSize(500, 400);
              f.setVisible(true);
        
    }
    
}
