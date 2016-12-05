package Objects;

import java.time.LocalDate;

/**
 * La clase {@code Objects.Otro} hereda de la superclase {@code Objects.Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Otro extends Material {
    private String descripcion;

    /**
     * Instantiates a new Objects.Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     */
    public Otro(LocalDate fechaCompra, boolean esRestringido, Tema tema) {
        super(fechaCompra, esRestringido, tema);
    }

    /**
     * Instantiates a new Objects.Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     * @param descripcion   the descripcion
     */
    public Otro(LocalDate fechaCompra, boolean esRestringido, Tema tema, String idioma, String descripcion) {
        super(fechaCompra, esRestringido, tema, idioma);
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
        return "Objects.Texto";
    }
}
