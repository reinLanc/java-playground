package ud4_2_2;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class GestionReparaciones {

    LinkedList<FichaVehiculo> listaEspera = new LinkedList();
    LinkedList<FichaVehiculo> listaReparando = new LinkedList();

    public void añadeVehiculo(FichaVehiculo fv) {
         listaEspera.add(fv);
    }

    public void aReparar() {
       listaReparando.add(listaEspera.remove());
    }

    public void mostrarListaEspera() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        FichaVehiculo fv;
        ListIterator li=listaEspera.listIterator();
        
        System.out.println("Lista de vehículos en espera");
        while(li.hasNext())
        {
            fv=(FichaVehiculo)li.next();
            System.out.println(fv.getMatricula()+" "+fv.getModelo()+" "+formato.format(fv.getInstanteEntrada()));
        }
        System.out.println();
    }

    public void mostrarListaReparando() {
        FichaVehiculo fv;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        Iterator i = listaReparando.iterator();
        System.out.println("Lista de Reparación:");
        while (i.hasNext()) {
            fv = (FichaVehiculo)i.next();
            System.out.println("Modelo: " + fv.getModelo() + " Matricula: " + fv.getMatricula() + " Instante de entrada " + formato.format(fv.getInstanteEntrada()));
        }
    }
}
