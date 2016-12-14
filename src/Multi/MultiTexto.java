package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiTexto {
    public Texto crear(String id, String fechaCompra, boolean esRestringido, String titulo, String nombreAutor,
                       String tema, String idioma, String fechaPublicacion, int numPaginas)
            throws Exception {
        Texto material = null;
        String sqlM;
        String sqlO;

        sqlM = "INSERT INTO TMaterial "+
                "(id, idioma, fechaCompra, esRestringido, tema, tipo) "+
                "VALUES ('"+id+"', '"+idioma+"', '"+fechaCompra+"', "+esRestringido+" , '"+tema+"', 'Texto');";

        sqlO = "INSERT INTO TTexto "+
                "(id, titulo, nombreAutor, fechaPublicacion, numeroPaginas) "+
                "VALUES ('"+id+"', '"+titulo+"', '"+nombreAutor+"', '"+fechaPublicacion+"', '"+numPaginas+"');";
        try {
            Conector.getConector().ejecutarSQL(sqlM);
            Conector.getConector().ejecutarSQL(sqlO);
            material = new Texto(id, fechaCompra, esRestringido, titulo, nombreAutor, tema, idioma,
                    fechaPublicacion, numPaginas);
        }
        catch (Exception e) {
            throw new Exception ("El número de ISBN ya está en el sistema.");
        }

        return material;
    }
}
