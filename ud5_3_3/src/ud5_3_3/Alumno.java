package ud5_3_3;
public class Alumno {
        private int ID;
    private String nombre;
    private double promedio;

    public Alumno(int ID,String nombre,double promedio){

        this.ID=ID;
        this.nombre=nombre;
        this.promedio=promedio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getID(){
        return ID;
    }

    public double getPromedio(){
        return promedio;
    }
}
