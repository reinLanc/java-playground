package ud5_3_3;
public class Grupo {

    private String nombre;
    private Alumno al[] = new Alumno[100];
    static int numelem = 0;

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public void matricular(Alumno al) {
        this.al[numelem] = al;
        numelem++;
    }

    public boolean eliminar(Alumno al) {
        for (int i = 0; i < numelem; i++) {
            if (al == this.al[i]) {
                this.al[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean estaInscrito(Alumno al) {
        for (int i = 0; i < numelem; i++) {
            if (al == this.al[i]) {
                return true;
            }
        }
        return false;
    }

    public void imprimir() {
        for (int i = 0; i < numelem; i++) {
            if (al[i] != null) {
                System.out.println(al[i].getID() + " " + al[i].getNombre() + " "
                        + al[i].getPromedio());
            }
        }

    }
}
