package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.Administrativo;

public class MultiAdministrativo {
    public Administrativo crear(String nombre, String apellido, String cedula, char tipoNombramiento,
                                int cantidadHorasSemanales)
            throws Exception {
        Administrativo administrativo = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TUsuario "+
                "(id, nombre, apellido) "+
                "VALUES ('"+cedula+"', '"+nombre+"', '"+apellido+"');";

        sqlO = "INSERT INTO TAdministrativo "+
                "(id, tipoNombramiento, cantidadHorasSemanales) "+
                "VALUES ('"+cedula+"', '"+tipoNombramiento+"', '"+cantidadHorasSemanales+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            administrativo = new Administrativo(nombre, apellido, cedula, tipoNombramiento, cantidadHorasSemanales);
        }
        catch (Exception e) {
            throw new Exception ("El ID ya está en el sistema.");
        }

        return administrativo;
    }
}
