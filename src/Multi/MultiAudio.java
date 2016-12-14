package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiAudio {
    public void borrar(Material pmaterial) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TAudio "+
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

    public Audio buscar(String pidentificacion) throws
            java.sql.SQLException,Exception{
        Audio audio = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TAudio, TMaterial "+
                "WHERE TAudio.id=TMaterial.id AND TAudio.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            audio = new Audio(rs.getString("id"), rs.getString("fechaCompra"), rs.getBoolean("esRestringido"),
                    rs.getString("tema"), rs.getString("idioma"), rs.getString("formato"), rs.getInt("duracion"));
        } else {
            throw new Exception ("[Error] El material no está registrado.");
        }

        rs.close();
        return audio;
    }

    public Audio crear(String id, String fechaCompra, boolean esRestringido, String tema, String idioma, String formato,
                       int duracion)
            throws Exception {
        Audio material = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TMaterial "+
                "(id, idioma, fechaCompra, esRestringido, tema, tipo) "+
                "VALUES ('"+id+"', '"+idioma+"', '"+fechaCompra+"', "+esRestringido+" , '"+tema+"', 'Audio');";

        sqlO = "INSERT INTO TAudio "+
                "(id, formato, duracion) "+
                "VALUES ('"+id+"', '"+formato+"', '"+duracion+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            material = new Audio(id, fechaCompra, true, tema, idioma, formato, duracion);
        }
        catch (Exception e) {
            throw new Exception ("[Error] El número de ISBN ya está en el sistema.");
        }

        return material;
    }
}
