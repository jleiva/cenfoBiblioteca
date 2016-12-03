import java.time.LocalDate;

/**
 * La clase {@code Material} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */
public abstract class Material {
    protected String id;
    protected String idioma;
    protected LocalDate fechaCompra;
    protected boolean esRestringido;

    /**
     * Instantiates a new Material.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     */
    public Material(LocalDate fechaCompra, boolean esRestringido) {
        setFechaCompra(fechaCompra);
        setEsRestringido(esRestringido);
    }

    /**
     * Instantiates a new Material.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param idioma        the idioma
     */
    public Material(LocalDate fechaCompra, boolean esRestringido, String idioma) {
        setFechaCompra(fechaCompra);
        setEsRestringido(esRestringido);
        setIdioma(idioma);
    }

    /**
     * Sets fecha compra.
     *
     * @param fechaCompra the fecha compra
     */
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * Sets es restringido.
     *
     * @param esRestringido the es restringido
     */
    public void setEsRestringido(boolean esRestringido) {
        this.esRestringido = esRestringido;
    }

    /**
     * Sets idioma.
     *
     * @param idioma the idioma
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Gets fecha compra.
     *
     * @return the fecha compra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Gets esRestringido.
     *
     * @return the esRestringido
     */
    public boolean getEsRestringido() {
        return esRestringido;
    }

    /**
     * Gets idioma.
     *
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Retorna un string que representa el estado de la clase. Incluye los
     * valores de los atributos fechaCompra y esRestringido.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        return "Material{" +
                "fechaCompra=" + fechaCompra +
                ", restringido=" + esRestringido +
                '}';
    }
}
