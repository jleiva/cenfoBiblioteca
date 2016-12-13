package CapaLogica;

import Multi.*;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Vector;

public class Gestor {
    private static CL capaLogica = new CL();

    public boolean validarDatos(String user, String pass) {
        Usuario usuarioValido = capaLogica.buscarUsuario(user);

        if (usuarioValido != null) {

        }

        return true;
    }

    public String crearReservacion(String userId, String materialId) {
        String msg = "No se pudo crear la reservacion.";
        Usuario usuario = capaLogica.buscarUsuario(userId);
        Material material = capaLogica.buscarMaterial(materialId);

        if (usuario != null && material != null) {
            Reservacion nuevaReserva = new Reservacion(usuario, material);
            capaLogica.crearReservacion(nuevaReserva);
            msg = "Reservacion creada";
        }

        return msg;
    }

    public String crearAdministrativo(String nombre, String apellido, String cedula, char tipoNombramiento,
                                      int cantidadHorasSemanales) {
        String msg;
        Administrativo nuevoAdministrativo;

        if (capaLogica.buscarUsuario(cedula) == null) {
            nuevoAdministrativo = new Administrativo(nombre, apellido, cedula, tipoNombramiento,
                    cantidadHorasSemanales);
            capaLogica.crearUsuario(nuevoAdministrativo);
            msg = "El usuario ha sido agregado";
        } else {
            msg = "El numero de identificacion " + cedula + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearEstudiante(String nombre, String apellido, String carnet, String carrera,
                                    int numeroCreditos) {
        String msg;
        Estudiante nuevoEstudiante;

        if (capaLogica.buscarUsuario(carnet) == null) {
            nuevoEstudiante = new Estudiante(nombre, apellido, carnet, carrera, numeroCreditos);
            capaLogica.crearUsuario(nuevoEstudiante);
            msg = "El usuario ha sido agregado";
        } else {
            msg = "El numero de identificacion " + carnet + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearProfesor(String nombre, String apellido, String cedula, int contrato, int y, int m, int d) {
        String msg;
        String tipoContrato = "";
        Profesor nuevoProfesor;

        if (capaLogica.buscarUsuario(cedula) == null) {
            switch (contrato) {
                case 1:
                    tipoContrato = "Tiempo Completo";
                    break;
                case 2:
                    tipoContrato = "Medio Tiempo";
                    break;
            }

            try {
                LocalDate fechaContratacion = LocalDate.of(y, m, d);
                nuevoProfesor = new Profesor(nombre, apellido, cedula, tipoContrato, fechaContratacion);
                capaLogica.crearUsuario(nuevoProfesor);
                msg = "El usuario ha sido agregado";
            } catch (DateTimeException e) {
                msg = "[Error] Fecha invalida, no se creo el Usuario.";
            }
        } else {
            msg = "El numero de identificacion " + cedula + " ya esta en el sistema.";
        }

        return msg;
    }

    public void crearTema(String pnombre) throws Exception {
        Tema tema;
        tema = (new MultiTema()).crear(pnombre);
    }



    public void crearTexto(String id, String fechaCompra, String pRestringido, String titulo, String nombreAutor,
                             String pTema, String idioma, String fechaPublicacion, int numPaginas) throws Exception {
        Material texto;

        if (pRestringido.equalsIgnoreCase("S")) {
            texto = (new MultiTexto()).crear(id, fechaCompra, true, titulo, nombreAutor, pTema, idioma,
                    fechaPublicacion, numPaginas);
        } else {
            texto = (new MultiTexto()).crear(id, fechaCompra, false, titulo, nombreAutor, pTema, idioma,
                    fechaPublicacion, numPaginas);
        }
    }

    public void crearVideo(String id, String fechaCompra, String pRestringido, String pTema, String idioma,
                             String formato, String director, int duracion) throws Exception {
        Material video;

        if (pRestringido.equalsIgnoreCase("S")) {
            video = (new MultiVideo()).crear(id, fechaCompra, true, pTema, idioma, formato, director, duracion);
        } else {
            video = (new MultiVideo()).crear(id, fechaCompra, false, pTema, idioma, formato, director, duracion);
        }
    }

    public void crearAudio(String id, String fechaCompra, String pRestringido, String pTema, String idioma,
                             String formato, int duracion) throws Exception {
        Material audio;

        if (pRestringido.equalsIgnoreCase("S")) {
            audio = (new MultiAudio()).crear(id, fechaCompra, true, pTema, idioma, formato, duracion);
        } else {
            audio = (new MultiAudio()).crear(id, fechaCompra, false, pTema, idioma, formato, duracion);
        }
    }

    public void crearOtroMaterial(String id, String fechaCompra, String esRestringido, String tema, String idioma,
                                  String descripcion) throws Exception {
        Material otro;

        if (esRestringido.equalsIgnoreCase("S")) {
            otro = (new MultiOtro()).crear(id, fechaCompra, true, tema, idioma, descripcion);
        } else {
            otro = (new MultiOtro()).crear(id, fechaCompra, false, tema, idioma, descripcion);
        }
    }

//    public String buscarMaterial(String id) {
//        Material material = capaLogica.buscarMaterial(id);
//        String msg;
//
//        if (material != null) {
//            msg = material.toString();
//        } else {
//            msg = "El numero de identificacion " + id + " no esta en el sistema.";
//        }
//
//        return msg;
//    }

    public TreeMap buscarMaterial(String pidentificacion) throws Exception {
        TreeMap datos = null;
        Material material = null;
        String nombre;
        datos = new TreeMap();
        material = (new MultiMaterial()).buscar(pidentificacion);
        datos.put("id", material.getId());
        datos.put("idioma", material.getIdioma());
        datos.put("fecha compra", material.getFechaCompra());
        datos.put("tema", material.getTema());
        datos.put("es restringido", material.getEsRestringido());

        return datos;
    }

    public Vector buscarTemaPorNombre(String pnombre) throws Exception {
        Vector temas = null;
        Vector datosTemas = null;
        Tema tema;
        temas = (new MultiTema()).buscarPorNombre(pnombre);
        datosTemas = new Vector();

        for (int i=0; i < temas.size(); i++) {
            tema = ((Tema) temas.get(i));
            TreeMap datosTema = new TreeMap();
            datosTema.put("nombre", tema.getNombre());
            datosTema.put("identificacion", tema.getId());

            datosTemas.add(datosTema);
        }

        return datosTemas;
    }

    public TreeMap buscarTemaPorId(String pidentificacion) throws Exception {
        TreeMap datos = null;
        Tema tema = null;
        String nombre;
        datos = new TreeMap();
        tema = (new MultiTema()).buscar(pidentificacion);
        datos.put("nombre", tema.getNombre());
        datos.put("identificacion", tema.getId());

        return datos;
    }

    public String buscarUsuario(String id) {
        Usuario usuario = capaLogica.buscarUsuario(id);
        String msg;

        if (usuario != null) {
            msg = usuario.toString();
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public String buscarReservacion(String id) {
        Reservacion reservacion = capaLogica.buscarReservacion(id);
        String msg;

        if (reservacion != null) {
            msg = reservacion.toString();
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public ArrayList<Reservacion> buscarReservacionesPorUsuario(String id) {
        ArrayList<Reservacion> reservasPorUsuario = new ArrayList<>();
        ArrayList<Reservacion> listaReservaciones = capaLogica.getListaReservaciones();
        int cantReservaciones = listaReservaciones.size();

        if (cantReservaciones > 0) {
            for (int i = 0; i < cantReservaciones; i++) {
                if(listaReservaciones.get(i).getUsuario().getId().equals(id)){
                    reservasPorUsuario.add(listaReservaciones.get(i));
                }
            }
        }

        return reservasPorUsuario;
    }

    public String borrarReservacion(String id) {
        String msg;
        Reservacion reservacion = capaLogica.buscarReservacion(id);

        if (reservacion != null) {
            capaLogica.borrarReservacion(reservacion);
            msg = "La reservacion con ID " + id + " ha sido eliminado";
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public String borrarUsuario(String id) {
        String msg;
        Usuario usuario = capaLogica.buscarUsuario(id);

        if (usuario != null) {
            capaLogica.borrarUsuario(usuario);
            msg = "El usuario ha sido eliminado";
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public void borrarMaterial(String id) throws Exception {
        Material material;
        material = (new MultiMaterial()).buscar(id);
        (new MultiMaterial()).borrar(material);
    }

    public void borrarTema(String pidTema) throws Exception {
        Tema tema;
        tema = (new MultiTema()).buscar(pidTema);
        (new MultiTema()).borrar(tema);
    }

    public String listarMateriales() throws Exception {
        String resul = "";
        Vector datosMateriales = (new MultiMaterial()).buscarMateriales();
        int cantMateriales = datosMateriales.size();

        try {
            if (cantMateriales > 0) {
                for (int i = 0; i < datosMateriales.size(); i++) {
                    resul += datosMateriales.get(i).toString();
                }
            } else {
                resul = "No hay Materiales";
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return resul;
    }

    public String listarUsuarios() {
        ArrayList<Usuario> usuarios = capaLogica.getListaUsuarios();
        int cantUsuarios = usuarios.size();
        String resul = "";

        if (cantUsuarios > 0) {
            for(int i=0; i < cantUsuarios; i++) {
                Usuario usuarioSel = usuarios.get(i);
                String id = usuarioSel.getId();
                String nombre = usuarioSel.getNombre();
                String apellido = usuarioSel.getApellido();
                String rolUsuario = "";

                if (usuarioSel.getClass().equals(Estudiante.class)) {
                    rolUsuario = "Estudiante";
                } else if (usuarioSel.getClass().equals(Profesor.class)) {
                    rolUsuario = "Profesor";
                } else if (usuarioSel.getClass().equals(Administrativo.class)) {
                    rolUsuario = "Administrativo";
                }

                resul += "Id: " + id + " | Nombre: " + nombre + " " + apellido + " | Rol: " + rolUsuario + "\n";
            }
        } else {
            resul = "No hay usuarios.";
        }

        return resul;
    }

    public String listarTemas() throws Exception {
        String resul = "";
        Vector datosTemas = (new MultiTema()).buscarTemas();

        try {
            for (int i = 0; i < datosTemas.size(); i++) {
                resul += datosTemas.get(i).toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resul;
    }

    public String listarReservaciones() {
        ArrayList<Reservacion> reservaciones = capaLogica.getListaReservaciones();
        int cantReservas = reservaciones.size();
        String resul = "";

        if (cantReservas > 0) {
            for (int i = 0; i < cantReservas; i++) {
                String id = reservaciones.get(i).getId();
                LocalDate fecha = reservaciones.get(i).getFechaReservacion();
                String usuario = reservaciones.get(i).getUsuario().getId();
                String material = reservaciones.get(i).getMaterial().getId();

                resul += "Id: " + id + " | Fecha Reservacion: " + fecha +  " | Usuario Id: " + usuario + " | Material Id: " + material + "\n";
            }
        } else {
            resul = "No hay reservaciones.";
        }

        return resul;
    }

    public String listarReservacionesPorUsuario(String id) {
        String resul = "";
        Usuario usuario = capaLogica.buscarUsuario(id);

        if (usuario != null) {
            ArrayList<Reservacion> reservasUsuario = buscarReservacionesPorUsuario(id);
            for (int i = 0; i < reservasUsuario.size(); i++) {
                String idU = reservasUsuario.get(i).getId();
                LocalDate fecha = reservasUsuario.get(i).getFechaReservacion();
                String userId = reservasUsuario.get(i).getUsuario().getId();
                String material = reservasUsuario.get(i).getMaterial().getId();

                resul += "Id: " + idU + " | Fecha Reservacion: " + fecha + " | Material Id: " + material + "\n";
            }
        } else {
            resul = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return resul;
    }

    public Reservacion buscarReservacionARedimir(String idUser, String idMaterial) {
        Reservacion reserva = null;
        boolean encontrado = false;
        ArrayList<Reservacion> reservasUsuario = buscarReservacionesPorUsuario(idUser);

        for (int i = 0; i < reservasUsuario.size() && !encontrado; i++) {
            if(reservasUsuario.get(i).getMaterial().getId().equals(idMaterial)){
                encontrado = true;
                reserva = reservasUsuario.get(i);
            }
        }

        return reserva;
    }

    public String redimirReservacion(String idUser, String idMaterial) {
        String msg = "No hay reservacion.";
        Reservacion hayReserva = buscarReservacionARedimir(idUser, idMaterial);

        if (hayReserva != null) {
            capaLogica.borrarReservacion(hayReserva);
            msg = "Reservacion con Id " + hayReserva.getId() + " ha sido redimida.";
        }

        return msg;
    }

    public static boolean hayUsuarios() {
        boolean hayUsuarios = false;

        if (capaLogica.getListaUsuarios().size() > 0) {
         hayUsuarios = true;
        }

        return hayUsuarios;
    }
}
