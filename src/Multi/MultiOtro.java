package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiOtro {
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
