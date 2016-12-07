package CapaLogica;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestor {
    private static CL capaLogica = new CL();

    public void validarDatos() {

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

    public String crearProfesor(String nombre, String apellido, String cedula, String tipoContrato, int y, int m, int d) {
        String msg;
        Profesor nuevoProfesor;

        if (capaLogica.buscarUsuario(cedula) == null) {
            LocalDate fechaContratacion = LocalDate.of(y, m, d);
            nuevoProfesor = new Profesor(nombre, apellido, cedula, tipoContrato, fechaContratacion);
            capaLogica.crearUsuario(nuevoProfesor);
            msg = "El usuario ha sido agregado";
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

    public String crearTexto(String id, LocalDate fechaCompra, boolean esRestringido, String titulo, String nombreAutor,
                             String tema, String idioma, LocalDate fechaPublicacion, int numPaginas) {
        String msg;
        Material nuevoMatrerial;

        if (capaLogica.buscarMaterial(id) == null) {
            nuevoMatrerial = new Texto(id, fechaCompra, esRestringido, titulo, nombreAutor, tema, idioma,
                    fechaPublicacion, numPaginas);
            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearVideo(String id, LocalDate fechaCompra, boolean esRestringido, String tema, String idioma,
                             String formato, String director, Duration duracion) {
        String msg;
        Material nuevoMatrerial;

        if (capaLogica.buscarMaterial(id) == null) {
            nuevoMatrerial = new Video(id, fechaCompra, esRestringido, tema, idioma, formato, director, duracion);
            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearAudio(String id, LocalDate fechaCompra, boolean esRestringido, String tema, String idioma,
                             String formato, Duration duracion) {
        String msg;
        Material nuevoMatrerial;

        if (capaLogica.buscarMaterial(id) == null) {
            nuevoMatrerial = new Audio(id, fechaCompra, esRestringido, tema, idioma, formato, duracion);
            capaLogica.crearMaterial(nuevoMatrerial);
            msg = "El material ha sido agregado";
        } else {
            msg = "El numero de identificacion " + id + " ya esta en el sistema.";
        }

        return msg;
    }

    public String crearOtroMaterial(String id, int y, int m, int d, boolean esRestringido, String tema, String idioma,
                                    String descripcion) {
        String msg;
        Material nuevoMatrerial;

        if (capaLogica.buscarMaterial(id) == null) {
            LocalDate fechaCompra = LocalDate.of(y, m, d);
            nuevoMatrerial = new Otro(id, fechaCompra, esRestringido, tema, idioma, descripcion);
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

    public String buscarTema(String id) {
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
            msg = "El n�mero de identificaci�n " + id + " no est� en el sistema.";
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

                resul += "Signatura: " + signatura + " | Tema: " + tema + " | Tipo Material: " + tipoMaterial + " | " + restringido + "\n";
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

    public static boolean hayUsuarios() {
        boolean hayUsuarios = false;

        if (capaLogica.getListaUsuarios().size() > 0) {
         hayUsuarios = true;
        }

        return hayUsuarios;
    }
}
