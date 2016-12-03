import java.time.Duration;
import java.time.LocalDate;

/**
 * La clase {@code Video} hereda de la superclase {@code Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Video extends Material {
    private String formato;
    private String director;
    private Duration duracion;

    /**
     * Instantiates a new Video.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     */
    public Video(LocalDate fechaCompra, boolean esRestringido) {
        super(fechaCompra, esRestringido);
    }

    /**
     * Instantiates a new Video.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param idioma        the idioma
     * @param formato       the formato
     * @param director      the director
     * @param duracion      the duracion
     */
    public Video(LocalDate fechaCompra, boolean esRestringido, String idioma, String formato, String director,
                 Duration duracion) {
        super(fechaCompra, esRestringido, idioma);
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
    public void setDuracion(Duration duracion) {
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
    public Duration getDuracion() {
        return duracion;
    }

    public String toString() {
        return "Texto";
    }
}