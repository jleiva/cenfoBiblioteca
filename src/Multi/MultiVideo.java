package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiVideo {
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
