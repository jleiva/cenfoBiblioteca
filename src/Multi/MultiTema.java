package Multi;

import java.util.Vector;
import CapaAccesoBD.Conector;
import CapaLogica.Tema;

public class MultiTema {
    public void borrar(Tema ptema) throws
            java.sql.SQLException,Exception{
        String sql;
        sql = "DELETE FROM TTema "+
                "WHERE id='"+ptema.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }
        catch (Exception e) {
            throw new Exception ("Error al borrar el tema.");
        }
    }

    public Tema buscar(String pidentificacion) throws
            java.sql.SQLException,Exception {
        Tema tema = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT id, nombre "+
                "FROM TTema "+
                "WHERE id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            tema = new Tema(rs.getString("id"), rs.getString("nombre"));
        } else {
            throw new Exception ("El tema no está registrado.");
        }
        rs.close();
        return tema;
    }

    public  Vector buscarPorNombre(String pnomCliente) throws java.sql.SQLException, Exception{
        Tema tema = null;
        Vector temas = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT id, nombre "+
                "FROM TTema "+
                "WHERE nombre LIKE '%"+pnomCliente+"%';";
        rs = Conector.getConector().ejecutarSQL(sql,true);
        temas = new Vector();

        if (rs.next()) {
            do {
                tema = new Tema(rs.getString("id"), rs.getString("nombre"));
                temas.add(tema);
            } while (rs.next());
        } else {
            throw new Exception ("No hay temas con ese nombre.");
        }

        rs.close();
        return temas;
    }

    public Vector buscarTemas() throws java.sql.SQLException,Exception {
        java.sql.ResultSet rs;
        String sql;
        Tema tema = null;
        Vector temas = null;
        sql="SELECT * "+
                "FROM TTema;";
        Conector.getConector().ejecutarSQL(sql);
        rs = Conector.getConector().ejecutarSQL(sql,true);
        temas = new Vector();

        while (rs.next()){
            tema = new Tema(rs.getString("id"), rs.getString("nombre"));
            temas.add(tema);
        }

        rs.close();
        return temas;
    }

    public Tema crear(String pnombre) throws Exception {
        Tema tema = null;
        String sql;
        sql = "INSERT INTO TTema "+
                "(nombre) "+
                "VALUES ('"+pnombre+"');";
        try {
            Conector.getConector().ejecutarSQL(sql);
            tema = new Tema(pnombre);
        }
        catch (Exception e) {
            throw new Exception ("El número de identificación ya está en el sistema.");
        }

        return tema;
    }
}
