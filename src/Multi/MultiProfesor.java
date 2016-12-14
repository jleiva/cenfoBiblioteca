package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.Profesor;

public class MultiProfesor {
    public Profesor crear(String nombre, String apellido, String cedula, String tipoContrato, String fechaContratacion)
            throws Exception {
        Profesor profesor = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TUsuario "+
                "(id, nombre, apellido) "+
                "VALUES ('"+cedula+"', '"+nombre+"', '"+apellido+"');";

        sqlO = "INSERT INTO TProfesor "+
                "(id, tipoContrato, fechaContratacion) "+
                "VALUES ('"+cedula+"', '"+tipoContrato+"', '"+fechaContratacion+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            profesor = new Profesor(nombre, apellido, cedula, tipoContrato, fechaContratacion);
        }
        catch (Exception e) {
            throw new Exception ("El ID ya está en el sistema.");
        }

        return profesor;
    }
}
