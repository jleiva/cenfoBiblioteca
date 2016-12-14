package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.Usuario;

import java.util.Vector;

public class MultiUsuario {
    public void borrar(Usuario pusuario) throws
            java.sql.SQLException,Exception{
        String sql;
        sql = "DELETE FROM TUsuario "+
                "WHERE id='"+pusuario.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }
        catch (Exception e) {
            throw new Exception ("Error al borrar el usuario.");
        }
    }

    public Usuario buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Usuario usuario = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT id, nombre, apellido, tipo "+
                "FROM TUsuario "+
                "WHERE id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            usuario = new Usuario(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id"), rs.getString("tipo"));
        } else {
            throw new Exception ("El usuario no está registrado.");
        }

        rs.close();
        return usuario;
    }

    public Vector buscarUsuarios() throws java.sql.SQLException,Exception {
        java.sql.ResultSet rs;
        String sql;
        Usuario usuario = null;
        Vector usuarios = null;
        sql="SELECT * "+
                "FROM TUsuario;";
        Conector.getConector().ejecutarSQL(sql);
        rs = Conector.getConector().ejecutarSQL(sql,true);
        usuarios = new Vector();

        while (rs.next()){
            usuario = new Usuario(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id"), rs.getString("tipo"));
            usuarios.add(usuario);
        }

        rs.close();
        return usuarios;
    }

    public Usuario crear(String nombre, String apellido, String id)
            throws Exception {
        Usuario usuario = null;
        String sql;
        sql = "INSERT INTO TUsuario "+
                "(id, nombre, apellido) "+
                "VALUES ('"+id+"', '"+nombre+"', '"+apellido+"');";
        try {
            Conector.getConector().ejecutarSQL(sql);
            usuario = new Usuario(nombre, apellido, id);
        }
        catch (Exception e) {
            throw new Exception ("El número de Id ya está en el sistema.");
        }

        return usuario;
    }
}
