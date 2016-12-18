package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiProfesor {
    public void borrar(Usuario pusuario) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TProfesor "+
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

    public Profesor buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Profesor usuario = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TProfesor, TUsuario "+
                "WHERE TProfesor.id=TUsuario.id AND TProfesor.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            usuario = new Profesor(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id"),
                    rs.getString("tipoContrato"), rs.getString("fechaContratacion"));
        } else {
            throw new Exception ("[Error] El usuario no está registrado.");
        }

        rs.close();
        return usuario;
    }

    public Profesor crear(String nombre, String apellido, String cedula, String tipoContrato, String fechaContratacion,
                          String password)
            throws Exception {
        Profesor profesor = null;
        String sqlP;
        String sqlS;

        sqlP = "INSERT INTO TUsuario "+
                "(id, nombre, apellido, tipo, pass, rol) "+
                "VALUES ('"+cedula+"', '"+nombre+"', '"+apellido+"', 'Profesor', '"+password+"', 'Usuario');";

        sqlS = "INSERT INTO TProfesor "+
                "(id, tipoContrato, fechaContratacion) "+
                "VALUES ('"+cedula+"', '"+tipoContrato+"', '"+fechaContratacion+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlP);
            Conector.getConector().ejecutarSQL(sqlS);
            profesor = new Profesor(nombre, apellido, cedula, tipoContrato, fechaContratacion);
        }
        catch (Exception e) {
            throw new Exception ("[Error] El ID ya está en el sistema.");
        }

        return profesor;
    }
}
