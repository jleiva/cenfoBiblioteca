package CapaLogica;

import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Otro} hereda de la superclase {@code CapaLogica.Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Otro extends Material {
    private String descripcion;

    /**
     * Instantiates a new CapaLogica.Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param tema          the tema
     */
    public Otro(String id, String fechaCompra, String tema) {
        super(id, fechaCompra, tema);
    }

    /**
     * Instantiates a new CapaLogica.Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param tema          the tema
     * @param idioma        the idioma
     * @param descripcion   the descripcion
     */
    public Otro(String id, String fechaCompra, String tema, String idioma, String descripcion) {
        super(id, fechaCompra, tema, idioma);
        setDescripcion(descripcion);
    }

    /**
     * Instantiates a new CapaLogica.Otro.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     * @param descripcion   the descripcion
     */
    public Otro(String id, String fechaCompra, boolean esRestringido, String tema, String idioma, String descripcion) {
        super(id, idioma, fechaCompra, esRestringido, tema);
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
        return "CapaLogica.Texto";
    }
}
