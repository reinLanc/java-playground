package ficheros5;

public class Object extends ObjectOutputStream {

    //Sobrescribimos el método que crea la cabecera
    protected void writeStreamHeader() throws IOException {

        // No hacer nada.
    }

    //Constructores
    public MiObjectOutputStream() throws IOException {

        super();

    }

    public MiObjectOutputStream(OutputStream out) throws IOException {

        super(out);

    }

}

}
