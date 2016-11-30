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
