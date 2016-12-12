package CapaLogica;

import java.util.ArrayList;

public class CL {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private ArrayList<Material> listaMateriales = new ArrayList<Material>();
    private ArrayList<Tema> listaTemas = new ArrayList<Tema>();
    private ArrayList<Reservacion> listaReservaciones = new ArrayList<Reservacion>();

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Material> getListaMateriales() {
        return listaMateriales;
    }

    public ArrayList<Tema> getListaTemas() {
        return listaTemas;
    }

    public ArrayList<Reservacion> getListaReservaciones() {
        return listaReservaciones;
    }

    public void borrarUsuario(Usuario user) {
        listaUsuarios.remove(user);
    }

    public void borrarMaterial(Material material) {
        listaMateriales.remove(material);
    }

    public void borrarTema(Tema tema) {
        listaTemas.remove(tema);
    }

    public void borrarReservacion(Reservacion reservacion) {
        listaReservaciones.remove(reservacion);
    }

    public void crearUsuario(Usuario user) {
        listaUsuarios.add(user);
    }

    public void crearMaterial(Material material) {
        listaMateriales.add(material);
    }

    public void crearTema(Tema tema) {
        listaTemas.add(tema);
    }

    public void crearReservacion(Reservacion reservacion) {
        listaReservaciones.add(reservacion);
    }

    public Tema buscarTemaPorNombre(String nombre) {
        Tema tema = null;
        boolean encontrado = false;

        for(int i=0; i < listaTemas.size() && !encontrado; i++) {
            if(listaTemas.get(i).getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                tema = listaTemas.get(i);
            }
        }

        return tema;
    }

    public Tema buscarTemaPorId(String id) {
        Tema tema = null;
        boolean encontrado = false;

        for(int i=0; i < listaTemas.size() && !encontrado; i++) {
            if(listaTemas.get(i).getId().equals(id)){
                encontrado = true;
                tema = listaTemas.get(i);
            }
        }

        return tema;
    }

    public Material buscarMaterial(String id) {
        Material material = null;
        boolean encontrado = false;

        for(int i=0; i < listaMateriales.size() && !encontrado; i++) {
            if(listaMateriales.get(i).getId().equals(id)){
                encontrado = true;
                material = listaMateriales.get(i);
            }
        }

        return material;
    }

    public Usuario buscarUsuario(String id) {
        Usuario usuario = null;
        boolean encontrado = false;

        for(int i=0; i < listaUsuarios.size() && !encontrado; i++) {
            if(listaUsuarios.get(i).getId().equals(id)){
                encontrado = true;
                usuario = listaUsuarios.get(i);
            }
        }

        return usuario;
    }

    public Reservacion buscarReservacion(String id) {
        Reservacion reservacion = null;
        boolean encontrado = false;

        for(int i=0; i < listaReservaciones.size() && !encontrado; i++) {
            if(listaReservaciones.get(i).getId().equals(id)){
                encontrado = true;
                reservacion = listaReservaciones.get(i);
            }
        }

        return reservacion;
    }
}
