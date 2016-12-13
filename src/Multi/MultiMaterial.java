package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.Material;
import CapaLogica.Tema;

import java.util.Vector;

public class MultiMaterial {
    public void borrar(Material pmaterial) throws
            java.sql.SQLException,Exception{
        String sql;
        sql = "DELETE FROM TMaterial "+
                "WHERE id='"+pmaterial.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }
        catch (Exception e) {
            throw new Exception ("Error al borrar el material.");
        }
    }

    public Material buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Material material = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TMaterial "+
                "WHERE id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            material = new Material(rs.getString("id"), rs.getString("idioma"), rs.getString("fechaCompra"),
                    rs.getBoolean("esRestringido"), rs.getString("tema"));
        } else {
            throw new Exception ("El material no está registrado.");
        }

        rs.close();
        return material;
    }

    public Vector buscarMateriales() throws java.sql.SQLException,Exception {
        java.sql.ResultSet rs;
        String sql;
        Material material = null;
        Vector materiales = null;
        sql="SELECT * "+
                "FROM TMaterial;";
        Conector.getConector().ejecutarSQL(sql);
        rs = Conector.getConector().ejecutarSQL(sql,true);
        materiales = new Vector();

        while (rs.next()){
            material = new Material(rs.getString("id"), rs.getString("idioma"), rs.getString("fechaCompra"),
                    rs.getBoolean("esRestringido"), rs.getString("tema"));
            materiales.add(material);
        }

        rs.close();
        return materiales;
    }
}
