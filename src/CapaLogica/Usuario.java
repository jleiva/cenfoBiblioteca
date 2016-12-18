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

    protected String tipo;
    protected String password;
    protected String rol;

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

    public Usuario(String nombre, String apellido, String id, String tipo) {
        this(id);
        setNombre(nombre);
        setApellido(apellido);
        setTipo(tipo);
    }

    public Usuario(String nombre, String apellido, String id, String tipo, String password) {
        this(id);
        setNombre(nombre);
        setApellido(apellido);
        setTipo(tipo);
        setPassword(password);
        setRol("Usuario");
    }

    public Usuario(String nombre, String apellido, String id, String tipo, String password, String rol) {
        this(id);
        setNombre(nombre);
        setApellido(apellido);
        setTipo(tipo);
        setPassword(password);
        setRol(rol);
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    public String getTipo() {
        return tipo;
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
        return "Id: " + getId() + " | Nombre: " + getNombre() + " " + getApellido() + " | Tipo Usuario: " + getTipo() + "\n";
    }
}
