package ud5_1_3;
public class Alumno {
  private int nmatricula;
  private String nombre;
  private double n1;
  private double n2;
  
  
  Alumno(int nmatricula,String nombre) {
      this.nmatricula = nmatricula;
      this.nombre = nombre;
  }
  public void ponNotas(double n1,double n2) {
    this.n1=n1;
    this.n2=n2;
}
  public double getMedia() {
      return (n1+n2)/2;
  }
  public String muestraAlumno() {
      return "Numero de matricula " + nmatricula + "\n Nombre " + nombre + "\n Nota media " + getMedia();
  }
}
