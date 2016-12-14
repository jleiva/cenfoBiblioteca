package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiOtro {
    public void borrar(Material pmaterial) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TOtro "+
                "WHERE id='"+pmaterial.getId()+"';";

        sqlP = "DELETE FROM TMaterial "+
                "WHERE id='"+pmaterial.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sqlS);
            Conector.getConector().ejecutarSQL(sqlP);
        }
        catch (Exception e) {
            throw new Exception ("[Error] No fue posible eliminar el material.");
        }
    }

    public Otro buscar(String pidentificacion) throws
            java.sql.SQLException,Exception {
        Otro otro = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * " +
                "FROM TOtro, TMaterial " +
                "WHERE TOtro.id=TMaterial.id AND TOtro.id='" + pidentificacion + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);

        if (rs.next()) {
            otro = new Otro(rs.getString("id"), rs.getString("fechaCompra"), rs.getBoolean("esRestringido"),
                    rs.getString("tema"), rs.getString("idioma"), rs.getString("descripcion"));
        } else {
            throw new Exception("[Error] El material no está registrado.");
        }

        rs.close();
        return otro;
    }

    public Otro crear(String id, String fechaCompra, boolean esRestringido, String tema, String idioma,
                      String descripcion)
            throws Exception {
        Otro material = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TMaterial "+
                "(id, idioma, fechaCompra, esRestringido, tema, tipo) "+
                "VALUES ('"+id+"', '"+idioma+"', '"+fechaCompra+"', "+esRestringido+" , '"+tema+"', 'Otro');";

        sqlO = "INSERT INTO TOtro "+
                "(id, descripcion) "+
                "VALUES ('"+id+"', '"+descripcion+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            material = new Otro(id, fechaCompra, esRestringido, tema, idioma, descripcion);
        }
        catch (Exception e) {
            throw new Exception ("El número de ISBN ya está en el sistema.");
        }

        return material;
    }
}
