import java.time.LocalDate;

/**
 * La clase {@code Otro} hereda de la superclase {@code Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Otro extends Material {
    private String descripcion;

    /**
     * Instantiates a new Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     */
    public Otro(LocalDate fechaCompra, boolean esRestringido) {
        super(fechaCompra, esRestringido);
    }

    /**
     * Instantiates a new Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param idioma        the idioma
     * @param descripcion   the descripcion
     */
    public Otro(LocalDate fechaCompra, boolean esRestringido, String idioma, String descripcion) {
        super(fechaCompra, esRestringido, idioma);
        setDescripcion(descripcion);
    }

    /**
     * Sets descripcion.
     *
     * @param descripcion the descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return "Texto";
    }
}
