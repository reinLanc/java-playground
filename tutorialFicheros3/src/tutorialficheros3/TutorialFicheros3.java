package tutorialficheros3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TutorialFicheros3 {
    public static void main(String[] args) {
  //Introducimos los datos
        String rutaFichero1=JOptionPane.showInputDialog("Indica la ruta del primer fichero");
        String rutaFichero2=JOptionPane.showInputDialog("Indica la ruta del segundo fichero");
        String rutaDestino=JOptionPane.showInputDialog("Indica la ruta donde quieres guardarlo");
 
        //Creamos dos objetos File para que nos sea mas sencillo manejarlos
        File fichero1=new File(rutaFichero1);
        File fichero2=new File(rutaFichero2);
 
        //Troceamos el el nombre del primer fichero para que se quede sin extension
        String primerFichero=fichero1.getName().substring(0, fichero1.getName().length()-4);
 
        //Crear el nombre de salida del fichero
        String nombreFicheroFinal=primerFichero+"_"+fichero2.getName();
 
        rutaDestino+=nombreFicheroFinal;
 
        File destino=new File(rutaDestino);
 
        UneFicheros(fichero1, fichero2, destino);
 

 

    }
       public static void UneFicheros (File fich1, File fich2, File destino){
 
        try (BufferedReader br=new BufferedReader(new FileReader(fich1));
            BufferedReader br2=new BufferedReader(new FileReader(fich2))){
 
            int eleccion=-1;
 
            if(destino.exists()){
                eleccion=JOptionPane.showConfirmDialog(null, "El fichero ya existe, ¿Quieres sobrescribir el fichero "+destino.getName()+"?",
                        "Sobrescribir",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            if(eleccion!=JOptionPane.CANCEL_OPTION){
 
                /*
                 * Lo creamos aquí, ya que si lo hacemos arriba
                 * siempre existira porque se crea al abrir el Stream
                 */
 
                BufferedWriter bw=new BufferedWriter(new FileWriter(destino));
 
                //Copiamos el contenido al fichero destino
                copiar(bw, br);
                copiar(bw, br2);
 
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    private static void copiar(BufferedWriter bw, BufferedReader br) throws IOException{
 
            String linea=br.readLine();
            while(linea!=null){
 
                bw.write(linea);
 
                linea=br.readLine();
            }
 
    }

}
