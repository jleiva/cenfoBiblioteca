package CapaLogica;

import java.time.Duration;
import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Video} hereda de la superclase {@code CapaLogica.Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Video extends Material {
    private String formato;
    private String director;
    private int duracion;


    /**
     * Instantiates a new CapaLogica.Video.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     */
    public Video(String id, String fechaCompra, boolean esRestringido, String tema) {
        super(id, fechaCompra, tema);
        setEsRestringido(esRestringido);
    }


    /**
     * Instantiates a new CapaLogica.Video.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     * @param formato       the formato
     * @param director      the director
     * @param duracion      the duracion
     */
    public Video(String id, String fechaCompra, boolean esRestringido, String tema, String idioma, String formato,
                 String director, int duracion) {
        super(id, idioma, fechaCompra, esRestringido, tema, "Video");
        setFormato(formato);
        setDirector(director);
        setDuracion(duracion);
    }

    /**
     * Sets formato.
     *
     * @param formato the formato
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * Sets director.
     *
     * @param director the director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Sets duracion.
     *
     * @param duracion the duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Gets formato.
     *
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Gets director.
     *
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * Gets duracion.
     *
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    public String toString() {
        String resul = super.toString();

        resul += "Formato: " + getFormato() + "\n";
        resul += "Director: " + getDirector() + "\n";
        resul += "Duracion: " + getDuracion() + " minutos" + "\n";
        return resul;
    }
}
