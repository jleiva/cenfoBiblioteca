package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiAdministrativo {
    public void borrar(Usuario pusuario) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TAdministrativo "+
                "WHERE id='"+pusuario.getId()+"';";

        sqlP = "DELETE FROM TUsuario "+
                "WHERE id='"+pusuario.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sqlS);
            Conector.getConector().ejecutarSQL(sqlP);
        }
        catch (Exception e) {
            throw new Exception ("[Error] No fue posible eliminar al usuario.");
        }
    }

    public Administrativo buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Administrativo usuario = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TAdministrativo, TUsuario "+
                "WHERE TAdministrativo.id=TUsuario.id AND TAdministrativo.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            usuario = new Administrativo(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id"),
                    rs.getString("tipoNombramiento"), rs.getInt("cantidadHorasSemanales"));
        } else {
            throw new Exception ("[Error] El usuario no está registrado.");
        }

        rs.close();
        return usuario;
    }

    public Administrativo crear(String nombre, String apellido, String cedula, String tipoNombramiento,
                                int cantidadHorasSemanales, String password)
            throws Exception {
        Administrativo administrativo = null;
        String sqlP;
        String sqlS;

        sqlP = "INSERT INTO TUsuario "+
                "(id, nombre, apellido, tipo, pass, rol) "+
                "VALUES ('"+cedula+"', '"+nombre+"', '"+apellido+"', 'Administrativo', '"+password+"', 'Usuario');";

        sqlS = "INSERT INTO TAdministrativo "+
                "(id, tipoNombramiento, cantidadHorasSemanales) "+
                "VALUES ('"+cedula+"', '"+tipoNombramiento+"', '"+cantidadHorasSemanales+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlP);
            Conector.getConector().ejecutarSQL(sqlS);
            administrativo = new Administrativo(nombre, apellido, cedula, tipoNombramiento, cantidadHorasSemanales);
        }
        catch (Exception e) {
            throw new Exception ("[Error] El ID ya está en el sistema.");
        }

        return administrativo;
    }
}
