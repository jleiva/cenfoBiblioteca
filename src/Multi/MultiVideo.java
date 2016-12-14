package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiVideo {
    public void borrar(Material pmaterial) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TVideo "+
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

    public Video buscar(String pidentificacion) throws
            java.sql.SQLException,Exception {
        Video video = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TVideo, TMaterial "+
                "WHERE TVideo.id=TMaterial.id AND TVideo.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            video = new Video(rs.getString("id"), rs.getString("fechaCompra"), rs.getBoolean("esRestringido"),
                    rs.getString("tema"), rs.getString("idioma"), rs.getString("formato"), rs.getString("director"),
                    rs.getInt("duracion"));
        } else {
            throw new Exception ("[Error] El material no está registrado.");
        }

        rs.close();
        return video;
    }

    public Video crear(String id, String fechaCompra, boolean esRestringido, String tema, String idioma, String formato,
                       String director, int duracion)
            throws Exception {
        Video material = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TMaterial "+
                "(id, idioma, fechaCompra, esRestringido, tema, tipo) "+
                "VALUES ('"+id+"', '"+idioma+"', '"+fechaCompra+"', "+esRestringido+" , '"+tema+"', 'Video');";

        sqlO = "INSERT INTO TVideo "+
                "(id, formato, director, duracion) "+
                "VALUES ('"+id+"', '"+formato+"', '"+director+"', '"+duracion+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            material = new Video(id, fechaCompra, esRestringido, tema, idioma, formato, director, duracion);
        }
        catch (Exception e) {
            throw new Exception ("El número de ISBN ya está en el sistema.");
        }

        return material;
    }
}
