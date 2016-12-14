package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiEstudiante {
    public void borrar(Usuario pusuario) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TEstudiante "+
                "WHERE id='"+pusuario.getId()+"';";

        sqlP = "DELETE FROM TUsuario "+
                "WHERE id='"+pusuario.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sqlS);
            Conector.getConector().ejecutarSQL(sqlP);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Estudiante buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Estudiante usuario = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TEstudiante, TUsuario "+
                "WHERE TEstudiante.id=TUsuario.id AND TEstudiante.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            usuario = new Estudiante(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id"),
                    rs.getString("carrera"), rs.getInt("numeroCreditos"));
        } else {
            throw new Exception ("El usuario no está registrado.");
        }

        rs.close();
        return usuario;
    }

    public Estudiante crear(String nombre, String apellido, String carnet, String carrera, int numeroCreditos)
            throws Exception {
        Estudiante estudiante = null;
        String sqlP;
        String sqlS;

        sqlP = "INSERT INTO TUsuario "+
                "(id, nombre, apellido, tipo) "+
                "VALUES ('"+carnet+"', '"+nombre+"', '"+apellido+"', 'Estudiante');";

        sqlS = "INSERT INTO TEstudiante "+
                "(id, carrera, numeroCreditos) "+
                "VALUES ('"+carnet+"', '"+carrera+"', '"+numeroCreditos+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlP);
            Conector.getConector().ejecutarSQL(sqlS);
            estudiante = new Estudiante(nombre, apellido, carnet, carrera, numeroCreditos);
        }
        catch (Exception e) {
            throw new Exception ("El ID ya está en el sistema.");
        }

        return estudiante;
    }
}
