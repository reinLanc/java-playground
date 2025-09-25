package ud7_1_1;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario extends JFrame {

    JLabel nombre,precio,tipo,extras;
    JButton enviar,borrar;
    JTextField nombreText;
    JRadioButton precio1,precio2,precio3;
    JCheckBox extra1,extra2,extra3;
    JComboBox tipoV;
    String [] listaTipo={"Piso","Ático","Casa"};

    public Formulario() {
        super("Formulario");
        setSize(280, 280);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nombre=new JLabel("Nombre");
        tipo=new JLabel("Seleccione el tipo de vivienda");
        precio=new JLabel("Seleccione el precio deseado");
        extras=new JLabel ("Extras");
        nombreText=new JTextField(15);
        tipoV=new JComboBox();
        
        for(int i = 0; i < listaTipo.length; i++)
            tipoV.addItem(listaTipo[i]);
        
        ButtonGroup grupo =new ButtonGroup();
        precio1 = new JRadioButton("Menos de 100.000 €");
        precio2 = new JRadioButton("Entre 100.000 y 200.000 €");
        precio3 = new JRadioButton("Más de 200.000 €");
        grupo.add(precio1);
        grupo.add(precio2);
        grupo.add(precio2);
        extra1=new JCheckBox("Piscina");
        extra2=new JCheckBox("Jardín");
        extra3=new JCheckBox("Garaje");
        enviar=new JButton("Enviar");
        borrar=new JButton("Borrar");
        
        nombre.setBounds(10,10,150,20);
        add(nombre);
        nombreText.setBounds(60,10,180,20);
        add(nombreText);
        precio.setBounds(10,30,300,20);
        add(precio);
        precio1.setBounds(10,50,200,20);
        add(precio1);
        precio2.setBounds(10,70,200,20);
        add(precio2);
        precio3.setBounds(10,90,200,20);
        add(precio3);
        tipo.setBounds(10,110,300,20);
        add(tipo);
        tipoV.setBounds(185,110,65,20);
        add(tipoV);
        extras.setBounds(10,130,50,20);
        add(extras);
        extra1.setBounds(60,130,70,20);
        add(extra1);
        extra2.setBounds(130,130,70,20);
        add(extra2);
        extra3.setBounds(200,130,70,20);
        add(extra3);
        enviar.setBounds(30,170,100,35);
        add(enviar);
        borrar.setBounds(140,170,100,35);
        add(borrar);

        setVisible(true);
    }
}
