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
    private int duracion;

    /**
     * Instantiates a new CapaLogica.Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param tema          the tema
     */
    public Audio(String id, String fechaCompra, String tema) {
        super(id, fechaCompra, tema);
    }

    /**
     * Instantiates a new CapaLogica.Audio.
     *
     * @param fechaCompra   the fecha compra
     * @param tema          the tema
     * @param idioma        the idioma
     * @param formato       the formato
     * @param duracion      the duracion
     */
    public Audio(String id, String fechaCompra, String tema, String idioma, String formato,
                 int duracion) {
        super(id, fechaCompra, tema, idioma);
        setFormato(formato);
        setDuracion(duracion);
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
    public Audio(String id, String fechaCompra, boolean esRestringido, String tema, String idioma, String formato,
                 int duracion) {
        super(id, idioma, fechaCompra, esRestringido, tema);
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
        resul += "Duracion: " + getDuracion() + " minutos" + "\n";
        return resul;
    }
}
