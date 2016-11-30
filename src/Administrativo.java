/**
 * La clase {@code Administrativo} hereda de la superclase {@code Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Administrativo extends Usuario {
    private String tipoNombramiento;
    private int cantidadHorasSemanales;

    /**
     * Constructor de la Clase.
     *
     * @param nombre   el nombre
     * @param apellido el apellido
     */
    public Administrativo(String nombre, String apellido) {
        super(nombre, apellido);
    }
}
