package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiAudio {
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
            throw new Exception ("El número de ISBN ya está en el sistema.");
        }

        return material;
    }
}
