package CapaLogica;

import java.time.LocalDate;

/**
 * La clase {@code CapaLogica.Profesor} hereda de la superclase {@code CapaLogica.Usuario}
 *
 * @author jdleiva
 * @version %I% %G%
 */
public class Profesor extends Usuario {
    private String tipoContrato;
    private String fechaContratacion;

    /**
     * Instantiates a new CapaLogica.Profesor.
     *
     * @param nombre   the nombre
     * @param apellido the apellido
     * @param cedula   the cedula
     */
    public Profesor(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula, "Profesor");
    }

    /**
     * Instantiates a new CapaLogica.Profesor.
     *
     * @param nombre            the nombre
     * @param apellido          the apellido
     * @param cedula            the cedula
     * @param tipoContrato      the tipo contrato
     * @param fechaContratacion the fecha contratacion
     */
    public Profesor(String nombre, String apellido, String cedula, String tipoContrato, String fechaContratacion) {
        super(nombre, apellido, cedula, "Profesor");
        setTipoContrato(tipoContrato);
        setFechaContratacion(fechaContratacion);
    }

    /**
     * Sets tipo contrato.
     *
     * @param tipoContrato the tipo contrato
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * Sets fecha contratacion.
     *
     * @param fechaContratacion the fecha contratacion
     */
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    /**
     * Gets tipo contrato.
     *
     * @return the tipo contrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Gets fecha contratacion.
     *
     * @return the fecha contratacion
     */
    public String getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        String resul = super.toString();

        resul += "Cedula: " + getId() + "\n";
        resul += "Tipo Contrato: " + getTipoContrato() + "\n";
        resul += "Fecha Contratacion: " + getFechaContratacion() + "\n";

        return resul;
    }
}
