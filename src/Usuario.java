/*
 * Copyright (c) info deberiamos incluir algo??
 *
 */

// Aqui van los package
// e imports

/**
 * La clase {@code Usuario} es abstracta, la usamos como superclase.
 *
 * @author jdleiva
 * @version %I% %G%
 */

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    /**
     * Constructor de la Clase, especificando un valor para nombre y apellido
     */
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getters
     */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    /**
     * Retorna un string que representa el estado de la clase. Incluye los
     * valores de los atributos nombre y apellido.
     *
     * @return un string que representa el estado de la clase
     */
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
