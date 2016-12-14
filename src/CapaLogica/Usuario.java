package CapaLogica;

/**
 * La clase {@code CapaLogica.Usuario} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Usuario {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String username;

    public Usuario(String id) {
        setId(id);
        setNombre("");
        setApellido("");
    }

    public Usuario(String nombre, String apellido, String id) {
        this(id);
        setNombre(nombre);
        setApellido(apellido);
    }

    /**
     * Sets nombre
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sets apellido.
     *
     * @param apellido the apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

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
     * Gets apellido.
     *
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
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
     * Retorna un string que representa el estado de la clase. Incluye los
     * valores de los atributos nombre y apellido.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        return "Id: " + getId() + " - Nombre: " + getNombre() + " " + getApellido() + "\n";
    }
}
