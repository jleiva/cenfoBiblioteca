package CapaLogica;

import java.time.Duration;
import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Audio} hereda de la superclase {@code CapaLogica.Material}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Audio extends Material {
    private String formato;
    private Duration duracion;

    /**
     * Instantiates a new CapaLogica.Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     */
    public Audio(LocalDate fechaCompra, boolean esRestringido, Tema tema) {
        super(fechaCompra, esRestringido, tema);
    }

    /**
     * Instantiates a new CapaLogica.Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param esRestringido the es restringido
     * @param tema          the tema
     * @param idioma        the idioma
     * @param formato       the formato
     * @param duracion      the duracion
     */
    public Audio(LocalDate fechaCompra, boolean esRestringido, Tema tema, String idioma, String formato,
                 Duration duracion) {
        super(fechaCompra, esRestringido, tema, idioma);
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
        return "CapaLogica.Audio";
    }
}
