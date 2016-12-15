package Multi;

import CapaAccesoBD.Conector;
import CapaLogica.*;
import java.util.Vector;

public class MultiReservacion {
    public void actualizar(Reservacion preserva) throws
            java.sql.SQLException,Exception{
        String sql;
        sql = "UPDATE TReservacion "+
                "SET estatus='"+preserva.getEstatusReserva()+"' "+
                "WHERE id='"+preserva.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }
        catch (Exception e) {
            throw new Exception ("[Error] Reservacion no está registrada.");
        }
    }

    public void borrar(Reservacion preserva) throws
            java.sql.SQLException,Exception{
        String sql;
        sql = "DELETE FROM TReservacion "+
                "WHERE id='"+preserva.getId()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }
        catch (Exception e) {
            throw new Exception ("[Error] No se pudo borrar la reservacion.");
        }
    }

    public Reservacion buscar(String pidentificacion) throws
            java.sql.SQLException,Exception {
        Reservacion reserva = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT id, idUsuario, idMaterial, estatus "+
                "FROM TReservacion "+
                "WHERE id='"+ pidentificacion +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            reserva = new Reservacion(rs.getString("id"), rs.getString("idUsuario"), rs.getString("idMaterial"),
                    rs.getString("estatus"));
        } else {
            throw new Exception ("[Error] El tema no está registrado.");
        }

        rs.close();
        return reserva;
    }

    public Vector buscarReservacionPorUsuario(String pidentificacion) throws
            java.sql.SQLException,Exception {
        java.sql.ResultSet rs;
        String sql;
        Reservacion reserva = null;
        Vector reservaciones = null;
        sql = "SELECT * "+
                "FROM TReservacion "+
                "WHERE idUsuario='"+ pidentificacion +"';";
        Conector.getConector().ejecutarSQL(sql);
        rs = Conector.getConector().ejecutarSQL(sql,true);
        reservaciones = new Vector();

        while (rs.next()){
            reserva = new Reservacion(rs.getString("id"), rs.getString("idUsuario"), rs.getString("idMaterial"),
                    rs.getString("estatus"));
            reservaciones.add(reserva);
        }

        rs.close();
        return reservaciones;
    }

    public Reservacion buscarReservacionPorUsuarioMaterial(String pidUser, String pidMaterial) throws
            java.sql.SQLException,Exception {
        Reservacion reserva = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT * "+
                "FROM TReservacion "+
                "WHERE idUsuario='"+ pidUser +"' AND idMaterial='"+ pidMaterial +"';";
        rs = Conector.getConector().ejecutarSQL(sql,true);

        if (rs.next()) {
            reserva = new Reservacion(rs.getString("id"), rs.getString("idUsuario"), rs.getString("idMaterial"),
                    rs.getString("estatus"));
        } else {
            throw new Exception ("[Error] No hay reservacion.");
        }

        rs.close();
        return reserva;
    }

    public Vector buscarReservaciones() throws java.sql.SQLException,Exception {
        java.sql.ResultSet rs;
        String sql;
        Reservacion reserva = null;
        Vector reservaciones = null;
        sql="SELECT * "+
                "FROM TReservacion;";
        Conector.getConector().ejecutarSQL(sql);
        rs = Conector.getConector().ejecutarSQL(sql,true);
        reservaciones = new Vector();

        while (rs.next()){
            reserva = new Reservacion(rs.getString("id"), rs.getString("idUsuario"), rs.getString("idMaterial"),
                    rs.getString("estatus"));
            reservaciones.add(reserva);
        }

        rs.close();
        return reservaciones;
    }

    public Reservacion crear(String usuario, String material)
            throws Exception {
        Reservacion reserva = null;
        String sql;
        sql = "INSERT INTO TReservacion "+
                "(idUsuario, idMaterial, estatus) "+
                "VALUES ('"+usuario+"', '"+material+"', 'En Prestamo');";
        try {
            Conector.getConector().ejecutarSQL(sql);
            reserva = new Reservacion(usuario, material);
        }
        catch (Exception e) {
            throw new Exception ("[Error] No se pudo crear la reservacion.");
        }

        return reserva;
    }
}
