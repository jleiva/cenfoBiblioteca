package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.Estudiante;

public class MultiEstudiante {
    public Estudiante crear(String nombre, String apellido, String carnet, String carrera, int numeroCreditos)
            throws Exception {
        Estudiante estudiante = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TUsuario "+
                "(id, nombre, apellido) "+
                "VALUES ('"+carnet+"', '"+nombre+"', '"+apellido+"');";

        sqlO = "INSERT INTO TEstudiante "+
                "(id, carrera, numeroCreditos) "+
                "VALUES ('"+carnet+"', '"+carrera+"', '"+numeroCreditos+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            estudiante = new Estudiante(nombre, apellido, carnet, carrera, numeroCreditos);
        }
        catch (Exception e) {
            throw new Exception ("El ID ya está en el sistema.");
        }

        return estudiante;
    }
}
