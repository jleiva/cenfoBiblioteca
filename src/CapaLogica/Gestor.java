package CapaLogica;

import Multi.*;
import java.util.TreeMap;
import java.util.Vector;

public class Gestor {
    public boolean validarDatos(String user, String pass) {
        return true;
    }

    public void crearReservacion(String userId, String materialId) throws Exception {
        Usuario usuario = null;
        Material material = null;

        usuario = (new MultiUsuario()).buscar(userId);
        material = (new MultiMaterial()).buscar(materialId);

        if (usuario != null && material != null) {
            Reservacion nuevaReserva;
            nuevaReserva = (new MultiReservacion()).crear(usuario.getId(), material.getId());
        }
    }

    public void crearAdministrativo(String nombre, String apellido, String cedula, String tipoNombramiento,
                                      int cantidadHorasSemanales) throws Exception {
        Usuario administrativo;
        administrativo = (new MultiAdministrativo()).crear(nombre, apellido, cedula, tipoNombramiento, cantidadHorasSemanales);
    }

    public void crearEstudiante(String nombre, String apellido, String carnet, String carrera,
                                    int numeroCreditos) throws Exception {
        Usuario usuario;
        usuario = (new MultiEstudiante()).crear(nombre, apellido, carnet, carrera, numeroCreditos);
    }

    public void crearProfesor(String nombre, String apellido, String cedula, String tipoContrato, String fechaContratacion)
            throws Exception {
        Usuario usuario;
        usuario = (new MultiProfesor()).crear(nombre, apellido, cedula, tipoContrato, fechaContratacion);
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

    public TreeMap buscarMaterial(String pidentificacion) throws Exception {
        TreeMap datos = null;
        Material material = null;
        String tipoMaterial;
        datos = new TreeMap();

        material = (new MultiMaterial()).buscar(pidentificacion);
        tipoMaterial = material.getTipo();

        switch (tipoMaterial) {
            case "Audio":
                Audio selectAudio = null;
                selectAudio = (new MultiAudio()).buscar(pidentificacion);

                datos.put("id", selectAudio.getId());
                datos.put("idioma", selectAudio.getIdioma());
                datos.put("fechaCompra", selectAudio.getFechaCompra());
                datos.put("tema", selectAudio.getTema());
                datos.put("esRestringido", selectAudio.getEsRestringido());
                datos.put("formato", selectAudio.getFormato());
                datos.put("duracion", selectAudio.getDuracion());
                break;

            case "Texto":
                Texto selectTexto = null;
                selectTexto = (new MultiTexto()).buscar(pidentificacion);

                datos.put("id", selectTexto.getId());
                datos.put("idioma", selectTexto.getIdioma());
                datos.put("fechaCompra", selectTexto.getFechaCompra());
                datos.put("tema", selectTexto.getTema());
                datos.put("esRestringido", selectTexto.getEsRestringido());
                datos.put("titulo", selectTexto.getTitulo());
                datos.put("autor", selectTexto.getNombreAutor());
                datos.put("fechaPublicacion", selectTexto.getFechaPublicacion());
                datos.put("numeroPaginas", selectTexto.getNumPaginas());
                break;

            case "Video":
                Video selectVideo = null;
                selectVideo = (new MultiVideo()).buscar(pidentificacion);

                datos.put("id", selectVideo.getId());
                datos.put("idioma", selectVideo.getIdioma());
                datos.put("fechaCompra", selectVideo.getFechaCompra());
                datos.put("tema", selectVideo.getTema());
                datos.put("esRestringido", selectVideo.getEsRestringido());
                datos.put("director", selectVideo.getDirector());
                datos.put("formato", selectVideo.getFormato());
                datos.put("duracion", selectVideo.getDuracion());
                break;

            case "Otro":
                Otro selectOtro = null;
                selectOtro = (new MultiOtro()).buscar(pidentificacion);

                datos.put("id", selectOtro.getId());
                datos.put("idioma", selectOtro.getIdioma());
                datos.put("fechaCompra", selectOtro.getFechaCompra());
                datos.put("tema", selectOtro.getTema());
                datos.put("esRestringido", selectOtro.getEsRestringido());
                datos.put("descripcion", selectOtro.getDescripcion());
                break;

            default:

                break;
        }

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

    public TreeMap buscarUsuario(String pidentificacion) throws Exception {
        TreeMap datos = null;
        Usuario usuario = null;
        String tipoUsuario;

        datos = new TreeMap();
        usuario = (new MultiUsuario()).buscar(pidentificacion);
        tipoUsuario = usuario.getTipo();

        switch (tipoUsuario) {
            case "Estudiante":
                Estudiante selectEstudiante = null;
                selectEstudiante = (new MultiEstudiante()).buscar(pidentificacion);

                datos.put("carnet", selectEstudiante.getId());
                datos.put("nombre", selectEstudiante.getNombre());
                datos.put("apellido", selectEstudiante.getApellido());
                datos.put("carrera", selectEstudiante.getCarrera());
                datos.put("numeroCreditos", selectEstudiante.getNumeroCreditos());
                break;

            case "Profesor":
                Profesor selectProfe = null;
                selectProfe = (new MultiProfesor()).buscar(pidentificacion);

                datos.put("cedula", selectProfe.getId());
                datos.put("nombre", selectProfe.getNombre());
                datos.put("apellido", selectProfe.getApellido());
                datos.put("tipoContrato", selectProfe.getTipoContrato());
                datos.put("fechaContratacion", selectProfe.getFechaContratacion());
                break;

            case "Administrativo":
                Administrativo selectAdmin = null;
                selectAdmin = (new MultiAdministrativo()).buscar(pidentificacion);

                datos.put("cedula", selectAdmin.getId());
                datos.put("nombre", selectAdmin.getNombre());
                datos.put("apellido", selectAdmin.getApellido());
                datos.put("tipoNombramiento", selectAdmin.getTipoNombramiento());
                datos.put("cantidadHorasSemanales", selectAdmin.getCantidadHorasSemanales());
                break;

            default:

                break;
        }

        return datos;
    }

    public TreeMap buscarReservacion(String pidentificacion) throws Exception {
        TreeMap datos = null;
        Reservacion reservacion = null;

        datos = new TreeMap();
        reservacion = (new MultiReservacion()).buscar(pidentificacion);
        datos.put("id", reservacion.getId());
        datos.put("fechaReservacion", reservacion.getFechaReservacion());
        datos.put("idUsuario", reservacion.getUsuario());
        datos.put("idMaterial", reservacion.getMaterial());
        datos.put("estatusReserva", reservacion.getEstatusReserva());

        return datos;
    }

    public void borrarReservacion(String id) throws Exception {
        Reservacion reservacion;

        reservacion = (new MultiReservacion()).buscar(id);
        (new MultiReservacion()).borrar(reservacion);
    }

    public void borrarUsuario(String id) throws Exception {
        Usuario usuario;
        String tipoUsuario;

        usuario = (new MultiUsuario()).buscar(id);
        tipoUsuario = usuario.getTipo();

        switch (tipoUsuario) {
            case "Estudiante":
                (new MultiEstudiante()).borrar(usuario);
                break;

            case "Profesor":
                (new MultiProfesor()).borrar(usuario);
                break;

            case "Administrativo":
                (new MultiAdministrativo()).borrar(usuario);
                break;

            default:
                break;
        }
    }

    public void borrarMaterial(String id) throws Exception {
        Material material;
        String tipoMaterial;

        material = (new MultiMaterial()).buscar(id);
        tipoMaterial = material.getTipo();

        switch (tipoMaterial) {
            case "Texto":
                (new MultiTexto()).borrar(material);
                break;

            case "Video":
                (new MultiVideo()).borrar(material);
                break;

            case "Audio":
                (new MultiAudio()).borrar(material);
                break;

            case "Otro":
                (new MultiOtro()).borrar(material);
                break;

            default:
                break;
        }
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
                for (int i = 0; i < cantMateriales; i++) {
                    resul += datosMateriales.get(i).toString();
                }
            } else {
                resul = "No hay Materiales.";
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return resul;
    }

    public static String listarUsuarios() throws Exception {
        String resul = "";
        Vector datosUsuarios = (new MultiUsuario()).buscarUsuarios();
        int cantUsuarios = datosUsuarios.size();

        try {
            if (cantUsuarios > 0) {
                for (int i = 0; i < cantUsuarios; i++) {
                    resul += datosUsuarios.get(i).toString();
                }
            } else {
                resul = "No hay Usuarios.";
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return resul;
    }

    public String listarTemas() throws Exception {
        String resul = "";
        Vector datosTemas = (new MultiTema()).buscarTemas();
        int cantTemas = datosTemas.size();

        try {
            if (cantTemas > 0) {
                for (int i = 0; i < datosTemas.size(); i++) {
                    resul += datosTemas.get(i).toString();
                }
            } else {
                resul = "No hay temas.";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resul;
    }

    public String listarReservaciones() throws Exception {
        String resul = "";
        Vector datosReservacion = (new MultiReservacion()).buscarReservaciones();
        int cantReservas = datosReservacion.size();

        try {
            if (cantReservas > 0) {
                for (int i = 0; i < datosReservacion.size(); i++) {
                    resul += datosReservacion.get(i).toString();
                }
            } else {
                resul = "No hay reservaciones.";
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return resul;
    }

    public String listarReservacionesPorUsuario(String id) throws Exception {
        String resul = "";
        Vector datosReservaciones = (new MultiReservacion()).buscarReservacionPorUsuario(id);
        int cantReservas = datosReservaciones.size();

        try {
            if (cantReservas > 0) {
                for (int i = 0; i < datosReservaciones.size(); i++) {
                    resul += datosReservaciones.get(i).toString();
                }
            } else {
                resul = "No hay reservaciones.";
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return resul;
    }

    public void redimirReservacion(String idUser, String idMaterial) throws Exception {
        Reservacion reserva = (new MultiReservacion().buscarReservacionPorUsuarioMaterial(idUser, idMaterial));
        reserva.setEstatusReserva("Redimido");
        (new MultiReservacion()).actualizar(reserva);
    }

    public static boolean hayUsuarios() {
        boolean hayUsuarios = false;

        return hayUsuarios;
    }
}
