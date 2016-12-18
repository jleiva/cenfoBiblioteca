package CapaLogica;

/**
 * La clase {@code CapaLogica.Estudiante} hereda de la superclase {@code CapaLogica.Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Estudiante extends Usuario {
    private String carrera;
    private int numeroCreditos;

    /**
     * Instantiates a new CapaLogica.Estudiante.
     *
     * @param nombre   the nombre
     * @param apellido the apellido
     * @param carnet   the carnet
     */
    public Estudiante(String nombre, String apellido, String carnet) {
        super(nombre, apellido, carnet, "Estudiante");
    }

    /**
     * Instantiates a new CapaLogica.Estudiante.
     *
     * @param nombre         the nombre
     * @param apellido       the apellido
     * @param carnet         the carnet
     * @param carrera        the carrera
     * @param numeroCreditos the numero creditos
     */
    public Estudiante(String nombre, String apellido, String carnet, String carrera, int numeroCreditos) {
        super(nombre, apellido, carnet, "Estudiante");
        setCarrera(carrera);
        setNumeroCreditos(numeroCreditos);
    }

    public Estudiante(String nombre, String apellido, String carnet, String carrera, int numeroCreditos, String password) {
        super(nombre, apellido, carnet, "Estudiante", password);
        setCarrera(carrera);
        setNumeroCreditos(numeroCreditos);
    }

    /**
     * Sets carrera.
     *
     * @param carrera the carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Sets numero creditos.
     *
     * @param numeroCreditos the numero creditos
     */
    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }


    /**
     * Gets carrera.
     *
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Gets numero creditos.
     *
     * @return the numero creditos
     */
    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    @Override
    public String toString() {
        String resul = super.toString();

        resul += "Carnet: " + getId()  + "\n";
        resul += "Carrera: " + getCarrera() + "\n";
        resul += "Creditos Matriculados: " + getNumeroCreditos() + "\n";
        resul += "Tipo Usuario: " + getTipo();

        return resul;
    }
}
