package CapaLogica;

import java.time.LocalDate;

public class Reservacion {
    private String id;
    private String usuario;
    private String material;
    private LocalDate fechaReservacion;

    private String estatusReserva;
    private static int countSerie;

    public Reservacion(String usuario, String material) {
        setId();
        setFechaReservacion();
        setUsuario(usuario);
        setMaterial(material);
    }

    public Reservacion(String id, String usuario, String material) {
        this.id = id;
        setFechaReservacion();
        setUsuario(usuario);
        setMaterial(material);
    }

    public Reservacion(String id, String usuario, String material, String estatusReserva) {
        this.id = id;
        this.estatusReserva = estatusReserva;
        setFechaReservacion();
        setUsuario(usuario);
        setMaterial(material);
    }

    public void setId() {
        this.id = "R-" + ++countSerie;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setFechaReservacion() {
        this.fechaReservacion = LocalDate.now();
    }

    public void setEstatusReserva(String estatusReserva) {
        this.estatusReserva = estatusReserva;
    }

    public String getEstatusReserva() {
        return estatusReserva;
    }

    public LocalDate getFechaReservacion() {
        return fechaReservacion;
    }

    public String getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        String resul = "";

        resul += "Id Reserva: " + getId() + " | ";
        resul += "Fecha Reservacion: " + getFechaReservacion() + " | ";
        resul += "Usuario Id: " + getUsuario() + " | ";
        resul += "Material Id: " + getMaterial() + " | ";
        resul += "Estatus: " + getEstatusReserva() + "\n";

        return resul;
    }
}
