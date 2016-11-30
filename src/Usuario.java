/**
 * La clase {@code Usuario} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */
public abstract class Usuario {
    protected String nombre;
    protected String apellido;

    /**
     * Constructor de la Clase, especificando un valor para nombre y apellido
     *
     * @param nombre   el nombre
     * @param apellido el apellido
     */
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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
     * Retorna un string que representa el estado de la clase. Incluye los
     * valores de los atributos nombre y apellido.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
