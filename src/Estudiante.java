/**
 * La clase {@code Estudiante} hereda de la superclase {@code Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */

public class Estudiante extends Usuario {
    private String carrera;
    private int numeroCreditos;

    /**
     * Constructor de la Clase.
     *
     * @param nombre   el nombre
     * @param apellido el apellido
     */
    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }
}
