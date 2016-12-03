/**
 * La clase {@code Tema}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Tema {
    private String id;
    private String nombre;

    /**
     * Instantiates a new Tema.
     *
     * @param id     the id
     * @param nombre the nombre
     */
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
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
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
        return "Tema";
    }
}
