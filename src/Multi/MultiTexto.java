package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;

public class MultiTexto {
    public void borrar(Material pmaterial) throws
            java.sql.SQLException,Exception{
        String sqlP;
        String sqlS;

        sqlS = "DELETE FROM TTexto "+
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

    public Texto buscar(String pidentificacion) throws
            java.sql.SQLException,Exception {
        Texto texto = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TTexto, TMaterial "+
                "WHERE TTexto.id=TMaterial.id AND TTexto.id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            texto = new Texto(rs.getString("id"), rs.getString("fechaCompra"), rs.getBoolean("esRestringido"),
                    rs.getString("titulo"), rs.getString("nombreAutor"), rs.getString("tema"), rs.getString("idioma"),
                    rs.getString("fechaPublicacion"), rs.getInt("numeroPaginas"));
        } else {
            throw new Exception ("[Error] El material no está registrado.");
        }

        rs.close();
        return texto;
    }

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
