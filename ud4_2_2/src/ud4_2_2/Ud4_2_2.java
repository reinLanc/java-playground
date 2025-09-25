/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4_2_2;

import java.time.LocalDateTime;

/**
 *
 * @author gilguerei
 */
public class Ud4_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        FichaVehiculo vehiculo1 = new FichaVehiculo("1","Fiesta",LocalDateTime.now());
        FichaVehiculo vehiculo2 = new FichaVehiculo("3","Impresa",LocalDateTime.now());
        FichaVehiculo vehiculo3 = new FichaVehiculo("5","Indian",LocalDateTime.now());
        FichaVehiculo vehiculo4 = new FichaVehiculo("6","Mercedes",LocalDateTime.now());
         GestionReparaciones reparar = new GestionReparaciones();
         reparar.añadeVehiculo(vehiculo1);
         reparar.añadeVehiculo(vehiculo2);
         reparar.añadeVehiculo(vehiculo3);
         reparar.añadeVehiculo(vehiculo4);
         //metodos
         reparar.mostrarListaEspera();
         reparar.aReparar();
         reparar.mostrarListaEspera();
         reparar.mostrarListaReparando();
    }
    
}
