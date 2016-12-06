package CapaLogica;

import java.util.ArrayList;
import java.util.TreeMap;

public class CL {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private ArrayList<Material> listaMateriales = new ArrayList<Material>();
    private ArrayList<Tema> listaTemas = new ArrayList<Tema>();

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Material> getListaMateriales() {
        return listaMateriales;
    }

    public ArrayList<Tema> getListaTemas() {
        return listaTemas;
    }

    public void crearUsuario(Usuario user) {
        listaUsuarios.add(user);
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

    public void crearMaterial(Material material) {
        listaMateriales.add(material);
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

    public void crearTema(Tema tema) {
        listaTemas.add(tema);
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
}
