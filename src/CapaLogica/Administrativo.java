package CapaLogica;

/**
 * La clase {@code CapaLogica.Administrativo} hereda de la superclase {@code CapaLogica.Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Administrativo extends Usuario {
    private char tipoNombramiento;
    private int cantidadHorasSemanales;

    /**
     * Instantiates a new CapaLogica.Administrativo.
     *
     * @param nombre   the nombre
     * @param apellido the apellido
     * @param cedula   the cedula
     */
    public Administrativo(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    /**
     * Instantiates a new CapaLogica.Administrativo.
     *
     * @param nombre                 the nombre
     * @param apellido               the apellido
     * @param cedula                 the cedula
     * @param tipoNombramiento       the tipo nombramiento
     * @param cantidadHorasSemanales the cantidad horas semanales
     */
    public Administrativo(String nombre, String apellido, String cedula, char tipoNombramiento,
                          int cantidadHorasSemanales) {
        super(nombre, apellido, cedula);
        setTipoNombramiento(tipoNombramiento);
        setCantidadHorasSemanales(cantidadHorasSemanales);
    }

    /**
     * Sets tipo nombramiento.
     *
     * @param tipoNombramiento the tipo nombramiento
     */
    public void setTipoNombramiento(char tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }

    /**
     * Sets cantidad horas semanales.
     *
     * @param cantidadHorasSemanales the cantidad horas semanales
     */
    public void setCantidadHorasSemanales(int cantidadHorasSemanales) {
        this.cantidadHorasSemanales = cantidadHorasSemanales;
    }

    /**
     * Gets tipo nombramiento.
     *
     * @return the tipo nombramiento
     */
    public char getTipoNombramiento() {
        return tipoNombramiento;
    }

    /**
     * Gets cantidad horas semanales.
     *
     * @return the cantidad horas semanales
     */
    public int getCantidadHorasSemanales() {
        return cantidadHorasSemanales;
    }

    @Override
    public String toString() {
        return "CapaLogica.Administrativo{";
    }
}
