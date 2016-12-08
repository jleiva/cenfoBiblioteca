package CapaLogica;

import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Material} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */
public abstract class Material {
    protected String id;
    protected String idioma = "No Indicado";
    protected LocalDate fechaCompra;
    protected boolean esRestringido; // default es false
    protected Tema tema;


    /**
     * Instantiates a new CapaLogica.Material.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     */
    public Material(LocalDate fechaCompra, boolean esRestringido, Tema tema) {
        setFechaCompra(fechaCompra);
        setEsRestringido(esRestringido);
        setTema(tema);
        setIdioma(idioma);
    }

    /**
     * Instantiates a new CapaLogica.Material.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     */
    public Material(LocalDate fechaCompra, boolean esRestringido, Tema tema, String idioma) {
        this(fechaCompra, esRestringido, tema);
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
     * Sets tema.
     *
     * @param tema the tema
     */
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    /**
     * Gets tema.
     *
     * @return the tema
     */
    public Tema getTema() {
        return tema;
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
     * valores de los atributos.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        return "CapaLogica.Material{";
    }
}
