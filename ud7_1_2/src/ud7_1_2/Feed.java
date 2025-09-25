package ud7_1_2;

import javax.swing.*;


public class Feed extends JFrame {
    private JLabel nameLabel = new JLabel("e-mail");
    private JTextField name;
    private JLabel urlLabel = new JLabel("Nombre: ");
    private JTextField url;
    private JLabel typeLabel = new JLabel("Tipo: ");
    private JTextField type;
    private JPanel panel = new JPanel();
    
    public Feed() {
        super("Información");
        setSize(320,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //SITIO
        String response1 = JOptionPane.showInputDialog(null,"Introduzca e-mail");
        
        //DIRECCIÓN
        String response2 = JOptionPane.showInputDialog(null,"Introduzca nombre:");
        
        //TIPO DEL SITIO
        String[] choices = {"Personal","Trabajo","Desconocido"};
        int response3 = JOptionPane.showOptionDialog(null,"¿De qué tipo es?","Tipo",0,JOptionPane.QUESTION_MESSAGE,null,choices,choices[0]);
        
        System.out.println(response3);
        //  setLayout(new GridLayout(3, 2));
        name=new JTextField(response1,20);
        url=new JTextField(response2,20);
        type=new JTextField(choices[response3],20);
        panel.add(nameLabel);
        panel.add(name);
        
        panel.add(urlLabel);
        panel.add(url);
        panel.add(typeLabel);
        panel.add(type);
        add(panel);
        
        setVisible(true);
    }
    
}
