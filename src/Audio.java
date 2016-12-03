import java.time.Duration;
import java.time.LocalDate;

/**
 * La clase {@code Audio} hereda de la superclase {@code Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Audio extends Material {
    private String formato;
    private Duration duracion;

    /**
     * Instantiates a new Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     */
    public Audio(LocalDate fechaCompra, boolean esRestringido) {
        super(fechaCompra, esRestringido);
    }

    /**
     * Instantiates a new Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param formato       the formato
     * @param idioma        the idioma
     * @param duracion      the duracion
     */
    public Audio(LocalDate fechaCompra, boolean esRestringido, String idioma, String formato, Duration duracion) {
        super(fechaCompra, esRestringido, idioma);
        setFormato(formato);
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
