package CapaLogica;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

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

    public String crearTema(String nombre) {
        String msg = "El tema ya existe.";
        Tema nuevoTema;

        if (capaLogica.buscarTemaPorNombre(nombre) == null) {
            nuevoTema = new Tema(nombre);
            capaLogica.crearTema(nuevoTema);
            msg = "El tema ha sido agregado";
        }

        return msg;
    }

    public String crearTexto(String id, int y, int m, int d, String pRestringido, String titulo, String nombreAutor,
                             String pTema, String idioma, int py, int pm, int pd, int numPaginas) {
        String msg;
        Material nuevoMatrerial;
        Tema nuevoTema;
        String tema;

        if (capaLogica.buscarTemaPorNombre(pTema) == null) {
            nuevoTema = new Tema(pTema);
            tema = nuevoTema.getNombre();
            capaLogica.crearTema(nuevoTema);
        } else {
            tema = pTema;
        }

        if (capaLogica.buscarMaterial(id) == null) {
            try {
                LocalDate fechaCompra = LocalDate.of(y, m, d);
                LocalDate fechaPublicacion = LocalDate.of(py, pm, pd);

                if (pRestringido.equalsIgnoreCase("S")) {
                    nuevoMatrerial = new Texto(id, fechaCompra, true, titulo, nombreAutor, tema, idioma,
                            fechaPublicacion, numPaginas);
                } else {
                    nuevoMatrerial = new Texto(id, fechaCompra, titulo, nombreAutor, tema, idioma,
                            fechaPublicacion, numPaginas);
                }

                capaLogica.crearMaterial(nuevoMatrerial);
                msg = "El material ha sido agregado";
            } catch (DateTimeException e) {
                msg = "[Error] Fecha invalida, no se creo el Material.";
            }

        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearVideo(String id, int y, int m, int d, String pRestringido, String pTema, String idioma,
                             String formato, String director, long dMinutos) {
        String msg;
        Material nuevoMatrerial;
        Tema nuevoTema;
        String tema;

        if (capaLogica.buscarTemaPorNombre(pTema) == null) {
            nuevoTema = new Tema(pTema);
            tema = nuevoTema.getNombre();
            capaLogica.crearTema(nuevoTema);
        } else {
            tema = pTema;
        }

        if (capaLogica.buscarMaterial(id) == null) {
            Duration duracion = Duration.ofMinutes(dMinutos);
            LocalDate fechaCompra = LocalDate.of(y, m, d);

            if (pRestringido.equalsIgnoreCase("S")) {
                nuevoMatrerial = new Video(id, fechaCompra, true, tema, idioma, formato, director, duracion);
            } else {
                nuevoMatrerial = new Video(id, fechaCompra, tema, idioma, formato, director, duracion);
            }

            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearAudio(String id, int y, int m, int d, String pRestringido, String pTema, String idioma,
                             String formato, long dMinutos) {
        String msg;
        Material nuevoMatrerial;
        Tema nuevoTema;
        String tema;

        if (capaLogica.buscarTemaPorNombre(pTema) == null) {
            nuevoTema = new Tema(pTema);
            tema = nuevoTema.getNombre();
            capaLogica.crearTema(nuevoTema);
        } else {
            tema = pTema;
        }

        if (capaLogica.buscarMaterial(id) == null) {
            Duration duracion = Duration.ofMinutes(dMinutos);
            LocalDate fechaCompra = LocalDate.of(y, m, d);

            if (pRestringido.equalsIgnoreCase("S")) {
                nuevoMatrerial = new Audio(id, fechaCompra, true, tema, idioma, formato, duracion);
            } else {
                nuevoMatrerial = new Audio(id, fechaCompra, tema, idioma, formato, duracion);
            }

            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearOtroMaterial(String id, int y, int m, int d, String pRestringido, String pTema, String idioma,
                                    String descripcion) {
        String msg;
        Material nuevoMatrerial;
        Tema nuevoTema;
        String tema;

        if (capaLogica.buscarTemaPorNombre(pTema) == null) {
            nuevoTema = new Tema(pTema);
            tema = nuevoTema.getNombre();
            capaLogica.crearTema(nuevoTema);
        } else {
            tema = pTema;
        }

        if (capaLogica.buscarMaterial(id) == null) {
            LocalDate fechaCompra = LocalDate.of(y, m, d);

            if (pRestringido.equalsIgnoreCase("S")) {
                nuevoMatrerial = new Otro(id, fechaCompra, true, tema, idioma, descripcion);
            } else {
                nuevoMatrerial = new Otro(id, fechaCompra, tema, idioma, descripcion);
            }

            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String buscarMaterial(String id) {
        Material material = capaLogica.buscarMaterial(id);
        String msg;

        if (material != null) {
            msg = material.toString();
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public String buscarTemaPorNombre(String nombre) {
        Tema tema = capaLogica.buscarTemaPorNombre(nombre);
        String msg;

        if (tema != null) {
            msg = tema.toString();
        } else {
            msg = "El tema con nombre " + nombre + " no esta en el sistema.";
        }

        return msg;
    }

    public String buscarTemaPorId(String id) {
        Tema tema = capaLogica.buscarTemaPorId(id);
        String msg;

        if (tema != null) {
            msg = tema.toString();
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
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

    public String borrarMaterial(String id) {
        String msg;
        Material material = capaLogica.buscarMaterial(id);

        if (material != null) {
            capaLogica.borrarMaterial(material);
            msg = "El material ha sido eliminado";
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public String borrarTema(String id) {
        String msg;
        Tema tema = capaLogica.buscarTemaPorId(id);

        if (tema != null) {
            capaLogica.borrarTema(tema);
            msg = "El tema " + "con Id " + id + " ha sido eliminado";
        } else {
            msg = "El numero de identificacion " + id + " no esta en el sistema.";
        }

        return msg;
    }

    public String listarMateriales() {
        ArrayList<Material> materiales = capaLogica.getListaMateriales();
        int cantMateriales = materiales.size();
        String resul = "";

        if (cantMateriales > 0) {
            for(int i=0; i < cantMateriales; i++) {
                Material materialSel = materiales.get(i);
                String signatura = materialSel.getId();
                String tema = materialSel.getTema();
                String restringido = materialSel.getEsRestringido() ? "Restringido" : "No Restringido";
                String tipoMaterial = "";

                if (materialSel.getClass().equals(Texto.class)) {
                    tipoMaterial = "Texto";
                } else if (materialSel.getClass().equals(Video.class)) {
                    tipoMaterial = "Video";
                } else if (materialSel.getClass().equals(Audio.class)) {
                    tipoMaterial = "Audio";
                } else if (materialSel.getClass().equals(Otro.class)) {
                    tipoMaterial = "Otro";
                }

                resul += "Signatura: " + signatura + " | Tema: " + tema + " | Tipo Material: " + tipoMaterial +
                        " | " + restringido + "\n";
            }
        } else {
            resul = "No hay materiales.";
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

    public String listarTemas() {
        ArrayList<Tema> temas = capaLogica.getListaTemas();
        int cantTemas = temas.size();
        String resul = "";

        if (cantTemas > 0) {
            for (int i = 0; i < cantTemas; i++) {
                String id = temas.get(i).getId();
                String nombre = temas.get(i).getNombre();

                resul += "Id: " + id + " | Tema: " + nombre + "\n";
            }
        } else {
            resul = "No hay temas.";
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
