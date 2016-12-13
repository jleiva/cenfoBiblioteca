package CapaLogica;

/**
 * La clase {@code CapaLogica.Tema}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Tema {
    private String id;
    private String nombre;

    private static int countSerie;

    /**
     * Instantiates a new CapaLogica.Tema.
     *
     * @param nombre the nombre
     */
    public Tema(String nombre) {
        setId();
        this.nombre = nombre;
    }

    public Tema(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param
     */
    public void setId() {
        this.id = "T-" + ++countSerie;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resul = "";

        resul += "Id: "  + getId() + " | Tema: " + getNombre() + "\n";

        return resul;
    }
}
