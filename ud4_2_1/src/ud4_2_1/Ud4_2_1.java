package ud4_2_1;

public class Ud4_2_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("123", "PersonaUno");
        Persona persona2 = new Persona("124", "PersonaDos");
        Persona persona3 = new Persona("125", "PersonaTres");
        Persona persona4 = new Persona("126", "PersonaCuatro");
        Persona persona5 = new Persona("127", "PersonaCinco");
        Persona persona6 = new Persona("1979", "BC C");
        Persona persona7 = new Persona("1990", "GC CA");
        Persona persona8 = new Persona("1991", "GC CAsss");
        Persona persona9 = new Persona("1991", "Max Powers");

        Agenda a = new Agenda();
        a.añadePersona(persona1);
        a.añadePersona(persona2);
        a.añadePersona(persona3);
        a.añadePersona(persona4);
        a.añadePersona(persona5);
        a.añadePersona(persona6);
        a.añadePersona(persona7);
        a.añadePersona(persona8);

      //  a.borraPersona(persona3);
        //contar con size
        //a.borraPersona(persona8);
        a.cuenta();
        a.muestraListaPersona();
        a.añadePersona(persona9);
        a.muestraListaPersona();
        a.buscaPersona("126");
    }

}
