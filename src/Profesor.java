import java.time.LocalDate;

/**
 * La clase {@code Profesor} hereda de la superclase {@code Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Profesor extends Usuario {
    private String tipoContrato;
    private LocalDate fechaContratacion;

    /**
     * Constructor de la Clase.
     *
     * @param nombre   el nombre
     * @param apellido el apellido
     */
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }
}
