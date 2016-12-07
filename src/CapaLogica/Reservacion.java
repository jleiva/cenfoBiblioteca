package CapaLogica;

import java.time.LocalDate;

public class Reservacion {
    private String id;
    private Usuario usuario;
    private Material material;
    private LocalDate fechaReservacion;

    private static int countSerie;

    public Reservacion(Usuario usuario, Material material) {
        setId();
        setFechaReservacion();
        setUsuario(usuario);
        setMaterial(material);
    }

    public void setId() {
        this.id = "R-" + ++countSerie;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setFechaReservacion() {
        this.fechaReservacion = LocalDate.now();
    }

    public LocalDate getFechaReservacion() {
        return fechaReservacion;
    }

    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        String resul = "== Datos Reservacion == \n";

        resul += "Id: " + getId() + "\n";
        resul += "Fecha Reservacion: " + getFechaReservacion() + "\n";
        resul += "Material: \n";
        resul += getMaterial().toString();

        return resul;
    }
}
