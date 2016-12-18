package CapaLogica;

import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Material} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Material {
    protected String id;
    protected String idioma = "Español"; // default
    protected String fechaCompra;
    protected boolean esRestringido; // default es false
    protected String tema;

    protected String tipo;
    protected boolean estaDisponible;

    /**
     * Instantiates a new CapaLogica.Material.
     *
     * @param id   the id
     * @param tema the tema
     */
    public Material(String id, String fechaCompra, String tema) {
        setId(id);
        setFechaCompra(fechaCompra);
        setTema(tema);
        setEsRestringido(esRestringido);
        setIdioma(idioma);
    }

    /**
     * Instantiates a new CapaLogica.Material.
     *
     * @param id     the id
     * @param idioma the idioma
     * @param tema   the tema
     */
    public Material(String id, String idioma, String fechaCompra, boolean esRestringido, String tema) {
        this(id, fechaCompra, tema);
        setIdioma(idioma);
        setEsRestringido(esRestringido);
    }

    /**
     * Instantiates a new CapaLogica.Material.
     *
     * @param id            the id
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     */
    public Material(String id, String idioma, String fechaCompra, boolean esRestringido, String tema, String tipo) {
        this(id, fechaCompra, tema);
        setIdioma(idioma);
        setEsRestringido(esRestringido);
        setTipo(tipo);
    }

    public Material(String id, String idioma, String fechaCompra, boolean esRestringido, String tema, String tipo, boolean estaDisponible) {
        this(id, fechaCompra, tema);
        setIdioma(idioma);
        setEsRestringido(esRestringido);
        setTipo(tipo);
        setEsRestringido(estaDisponible);
    }

    /**
     * Sets fecha compra.
     *
     * @param fechaCompra the fecha compra
     */
    public void setFechaCompra(String fechaCompra) {
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
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public boolean estaDisponible() {
        return estaDisponible;
    }

    public String getTipo() {
        return tipo;
    }

    /**
     * Gets tema.
     *
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * Gets fecha compra.
     *
     * @return the fecha compra
     */
    public String getFechaCompra() {
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
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Retorna un string que representa el estado de la clase. Incluye los
     * valores de los atributos.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        String resul = "Id: " + getId() + " | ";

        resul += "Tema: " + getTema() + " | ";
        resul += "Idioma: " + getIdioma() + " | ";
        resul += (getEsRestringido() ? "Material Restringido" : "No Restringido") + " | ";
        resul += "Fecha Compra: " + getFechaCompra() + " | ";
        resul += "Tipo Material: " + getTipo() + "\n";

        return resul;
    }
}
