package UI;

import java.io.*;
import CapaLogica.*;

public class UI {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;
    private static Gestor gestor;

    public static void main(String[] args)throws java.io.IOException {
        int opc;
        int noSalir;
        gestor = new Gestor();

        // Agrego contenido para pruebas, despues debe cargar el menu y submenus

        // Temas
//        out.println(gestor.crearTema("Sociales"));
//        out.println(gestor.crearTema("Ingles"));
//        out.println(gestor.crearTema("Matematicas"));
//        out.println(gestor.crearTema("Quimica"));
//        out.println(gestor.crearTema("Fisica Matematica"));
//        out.println(gestor.crearTema("Español"));

        // Usuarios
//        out.println(gestor.crearEstudiante("Jose", "Leiva", "5324", "BSOFT", 10));
//        out.println(gestor.crearEstudiante("Pedro", "Pica", "6789", "Redes", 5));
//        out.println(gestor.crearEstudiante("Luis", "Marmol", "5324", "Redes", 7)); // No se debe agregar, id repetido
//        out.println(gestor.crearAdministrativo("Pablo", "Marmol", "1234", 'A', 48));
//        out.println(gestor.crearAdministrativo("Javier", "Caos", "5151", 'B', 30));
//        out.println(gestor.crearProfesor("Juan", "Solano", "2345", 1, 2016, 10, 1));
//        out.println(gestor.crearProfesor("Diego", "Maradona", "11171", 2, 2016, 5, 1));

        // Materiales
//        out.println(gestor.crearTexto("ISBN001", 2015, 10, 1, "N", "Matematica Basica", "Pedro Pablo", "Matematicas", "Aleman", 2000, 10, 1, 200));
//        out.println(gestor.crearOtroMaterial("1117", 2015, 10, 1, "S", "Ciencias", "Ingles", "Folleto de Comics"));
//        out.println(gestor.crearOtroMaterial("ISBN1223", 2013, 10, 1, "S", "Musica", "Ingles", "Folleto de Letras"));
//        out.println(gestor.crearVideo("V201", 2015, 10, 1, "S", "Ciencias", "Ingles", "VHS", "Laura Algo", 30));
//        out.println(gestor.crearAudio("A101", 2016, 10, 1, "s", "Sociales", "Ingles", "CD", 120));
//        out.println(gestor.crearAudio("A222", 2016, 10, 1, "n", "Musica", "Español", "CD", 10));

        // Reservaciones
//        out.println(gestor.crearReservacion("2345", "ISBN001"));
//        out.println(gestor.crearReservacion("5324", "1117"));
//        out.println(gestor.crearReservacion("1987", "ISBN001")); // Usuario no existe, no se debe crear
//        out.println(gestor.crearReservacion("2345", "A101"));
//        out.println(gestor.crearReservacion("5324", "V201"));
//        out.println(gestor.crearReservacion("5324", "ISBN001"));

        do {
            menuAdmin();
            opc = leerOpcionSelecionada();
            noSalir = ejecutarAccionSeleccionada(opc);
        } while (noSalir != 0);
    }

    private static int leerOpcionSelecionada()throws java.io.IOException{
        int opcion = 0;

        out.print("Seleccione opcion: ");
        try {
            opcion = Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            out.print("[Error] No se pudo iniciar el programa, valor invalido.");
        }
        out.println();

        return opcion;
    }

    public static void login() throws java.io.IOException {
        String usuario;
        String password;

        out.print("Digite su nombre Usuario: ");
        usuario = in.readLine();
        out.print("Digite su Password: ");
        password = in.readLine();

        gestor.validarDatos(usuario, password);
    }

    private static void menuAdmin() {
        out.println();
        out.println("============== Menu Principal del Sistema =========================");
        out.println("1. Usuarios.\n2. Materiales.\n3. Temas.\n4. Reservaciones.\n5. Redimir reservacion.\n0. Salir");
        out.println();
    }

    private static void menuUsuario() {
        out.println();
        out.println("============== Menu Principal del Sistema =========================");
        out.println("1. Reservaciones.\n0. Salir");
        out.println();
    }

    private static int ejecutarAccionSeleccionada(int opcion) throws java.io.IOException {
        int noSalir = -1;

        if (opcion == 1) { // Usuarios
            ejecutarAccionUsuarios();
        } else if (opcion == 2) { // Materiales
            ejecutarAccionMateriales();
        } else if (opcion == 3) { // Temas
            ejecutarAccionTemas();
        } else if (opcion == 4) { // Reservaciones
            ejecutarAccionReservaciones();
        } else if (opcion == 5) { // Redimir
            ejecutarAccionRedimir();
        }else {
            noSalir = 0;
        }

        return noSalir;
    }

    private static void ejecutarAccionUsuarios() throws java.io.IOException {
        int opc;
        String userId;

        do {
            out.println();
            out.println("============== Submenu Usuarios ==============");
            out.println("1. Ver lista de Usuarios.");
            out.println("2. Registrar nuevo Usuario.");
            out.println("3. Buscar Usuario.");
            out.println("4. Eliminar Usuario.");
            out.println("5. Modificar Usuario."); // Falta la funcionalidad
            out.println("0. Ir a Menu Principal.");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Usuarios ==============");
                    out.println(gestor.listarUsuarios());
                    break;

                case 2:
                    out.println("============== Registrar nuevo Usuario ==============");
                    out.println("Tipo de Usuario a crear:\n 1. Estudiante.\n 2. Profesor.\n 3. Administrativo.\nSeleccione tipo usuario: ");
                    int tipoUsuario = 0;
                    try {
                        tipoUsuario = Integer.parseInt(in.readLine());
                    } catch (NumberFormatException e) {
                        imprimirExepcion(e);
                    }
                    out.println("Id:");
                    String idNuevoUser = in.readLine();
                    out.println("Nombre:");
                    String nombre = in.readLine();
                    out.println("Apellido:");
                    String apellido = in.readLine();

                    switch (tipoUsuario) {
                        case 1:
                            out.println("Carrera:");
                            String carrera = in.readLine();
                            out.println("Creditos matriculados:");
                            int creditos = 0;

                            try {
                                creditos = Integer.parseInt(in.readLine());
                                out.println(gestor.crearEstudiante(nombre, apellido, idNuevoUser, carrera, creditos));
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Usuario");
                            }

                            break;

                        case 2:
                            out.println("Tipo Contrato\n 1. Tiempo Completo.\n 2. Medio Tiempo.\nIndique el tipo de contrato");
                            int contrato = 0;

                            try {
                                contrato = Integer.parseInt(in.readLine());
                                out.println("Fecha de contratatacion:");
                                out.println("Dia:");
                                int d = Integer.parseInt(in.readLine());
                                out.println("Mes:");
                                int m = Integer.parseInt(in.readLine());
                                out.println("Año:");
                                int y = Integer.parseInt(in.readLine());
                                out.println(gestor.crearProfesor(nombre, apellido, idNuevoUser, contrato, y, m, d));
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Usuario");
                            }
                            break;

                        case 3:
                            out.println("Tipo de nombramiento.\n Digite: A, B o C.");
                            char tipoNombramiento = in.readLine().charAt(0);
                            out.println("Horas asignadas:");
                            int horas = 0;

                            try {
                                horas = Integer.parseInt(in.readLine());
                                out.println(gestor.crearAdministrativo(nombre, apellido, idNuevoUser, tipoNombramiento, horas));
                            } catch (NumberFormatException e) {
                               imprimirExepcion(e);
                                out.println("No se creo el Usuario");
                            }
                            break;
                        default:
                            out.println("Opcion invalida.");
                            break;
                    }

                    break;

                case 3:
                    out.println("============== Buscar Usuario ==============");
                    out.println();
                    out.println(gestor.listarUsuarios());
                    out.println("Indique el numero de Id del Usuario: ");
                    userId = in.readLine();
                    out.println();
                    out.println("======= Datos del Usuario =======");
                    out.println(gestor.buscarUsuario(userId));
                    out.println("=================================");
                    break;

                case 4:
                    out.println("============== Eliminar Usuario ==============");
                    out.println();
                    out.println(gestor.listarUsuarios());
                    out.println("Indique el numero de Id del Usuario a eliminar: ");
                    userId = in.readLine();
                    out.println(gestor.borrarUsuario(userId));
                    break;

                case 5:
                    out.println("============== Modificar Usuario ==============");
                    out.println();
                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionMateriales() throws java.io.IOException {
        int opc;
        String materialId;

        do {
            out.println();
            out.println("============== Submenu Materiales =========================");
            out.println("1. Ver lista de Materiales.");
            out.println("2. Registrar nuevo Material.");
            out.println("3. Buscar Material.");
            out.println("4. Eliminar Material");
            out.println("5. Modificar Material");
            out.println("0. Ir a Menu Principal");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Materiales ==============");

                    try {
                        out.println(gestor.listarMateriales());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    break;

                case 2:
                    out.println("============== Registrar nuevo Material ==============");
                    out.println("Tipo de Material a crear:\n 1. Texto.\n 2. Video.\n 3. Audio.\n 4. Otro.\nSeleccione tipo material: ");
                    int tipoMaterial = 0;

                    try {
                        tipoMaterial = Integer.parseInt(in.readLine());
                    } catch (NumberFormatException e) {
                        imprimirExepcion(e);
                        out.println("No se creo el Material.");
                        return;
                    } catch (IOException e) {
                        out.println(e.getMessage());
                    }

                    out.println("ISBN: ");
                    String isbn = in.readLine();
                    out.println("Fecha de compra:");
                    String fechaCompra = in.readLine();
                    out.println("Material es Restringido? s/n ");
                    String esRestringido = in.readLine();
                    out.println("Tema: ");
                    String tema = in.readLine();
                    out.println("Idioma: ");
                    String idioma = in.readLine();

                    switch (tipoMaterial) {
                        case 1:
                            out.println("Titulo: ");
                            String titulo = in.readLine();
                            out.println("Autor: ");
                            String autor = in.readLine();
                            out.println("Fecha publicacion:");
                            String fechaPublicacion = in.readLine();
                            out.println("Numero de paginas: ");
                            int paginas = Integer.parseInt(in.readLine());

                            out.println(gestor.crearTexto(isbn, fechaCompra, esRestringido, titulo, autor, tema, idioma,
                                    fechaPublicacion, paginas));
                            break;

                        case 2:
                            out.println("Formato. VHS, VCD o DVD ");
                            String formato = in.readLine();
                            out.println("Duracion (en minutos): ");
                            long duracion = 0;

                            try {
                                duracion = Integer.parseInt(in.readLine());
                                out.println("Director: ");
                                String director = in.readLine();
                                out.println(gestor.crearVideo(isbn, fechaCompra, esRestringido, tema, idioma, formato,
                                        director, duracion));
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Material.");
                            }

                            break;

                        case 3:
                            out.println("Formato. Casete, CD o DVD ");
                            String aFormato = in.readLine();
                            out.println("Duracion (en minutos): ");
                            long aDuracion = 0;

                            try {
                                aDuracion = Integer.parseInt(in.readLine());
                                out.println(gestor.crearAudio(isbn, fechaCompra, esRestringido, tema, idioma, aFormato,
                                        aDuracion));
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Material.");
                            }

                            break;

                        case 4:
                            out.println("Descripcion: ");
                            String descripcion = in.readLine();
                            out.println(gestor.crearOtroMaterial(isbn, fechaCompra, esRestringido, tema, idioma, descripcion));
                            break;

                        default:
                            out.println("Opcion invalida.");
                            break;
                    }

                    break;

                case 3:
                    out.println("============== Buscar Material ==============");
                    out.println();
                    try {
                        out.println(gestor.listarMateriales());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    out.println("Indique el ISBN del Material: ");
                    materialId = in.readLine();
                    out.println();
                    out.println("======= Datos del Material =======");
                    out.println(gestor.buscarMaterial(materialId));
                    out.println("=================================");
                    break;

                case 4:
                    out.println("============== Eliminar Material ==============");
                    out.println();
                    try {
                        out.println(gestor.listarMateriales());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Indique el ISBN del Material a eliminar: ");
                    materialId = in.readLine();
                    try {
                        gestor.borrarMaterial(materialId);
                        out.println("Material eliminado del sistema.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 5:
                    out.println("============== Modificar Material ==============");
                    out.println();
                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionTemas() throws java.io.IOException {
        int opc;

        do {
            out.println();
            out.println("============== Submenu Temas =========================");
            out.println("1. Ver lista de Temas.");
            out.println("2. Registrar nuevo Tema.");
            out.println("3. Buscar Tema.");
            out.println("4. Eliminar Tema.");
            out.println("5. Modificar Tema.");
            out.println("0. Ir a Menu Principal.");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Temas ==============");

                    try {
                        out.println(gestor.listarTemas());
                    }
                    catch (Exception ex) {
                        out.print(ex.getMessage());
                    }

                    break;

                case 2:
                    out.println("============== Registrar nuevo Tema ==============");
                    out.println("Nombre: ");
                    String nombreTema = in.readLine();

                    try {
                        gestor.crearTema(nombreTema);
                        out.print("Tema agregado al sistema.");
                        out.println();
                    }
                    catch (Exception ex) {
                        out.print("El número de identificación ya está en el sistema.");
                    }

                    break;

                case 3:
                    out.println("============== Buscar Tema ==============");
                    out.println();

                    try {
                        out.println(gestor.listarTemas());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Ingrese el Id del Tema: ");
                    String criterio = in.readLine();

                    out.println();
                    out.println("======= Datos del Tema =======");

                    try {
                        out.println(gestor.buscarTemaPorId(criterio));
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    break;

                case 4:
                    out.println("============== Eliminar Tema ==============");
                    out.println();

                    try {
                        out.println(gestor.listarTemas());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Indique el Id del Tema a eliminar: ");
                    String temaId = in.readLine();

                    try {
                        gestor.borrarTema(temaId);
                        out.println("Tema eliminado del sistema.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    break;

                case 5:
                    out.println("============== Modificar Material ==============");
                    out.println();
                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionReservaciones() throws java.io.IOException {
        int opc;
        String idUser;
        String idReserva;

        do {
            out.println();
            out.println("============== Submenu Reservaciones =========================");
            out.println("1. Ver lista de Reservaciones.");
            out.println("2. Registrar nueva Reservacion.");
            out.println("3. Buscar Reservacion.");
            out.println("4. Buscar Reservacion por Usuario.");
            out.println("5. Eliminar Reservacion.");
            out.println("6. Modificar Reservacion.");
            out.println("7. Redimir Reservacion.");
            out.println("0. Ir a Menu Principal.");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Reservaciones ==============");
                    out.println(gestor.listarReservaciones());
                    break;

                case 2:
                    out.println("============== Registrar Reservacion ==============");
                    out.println();
                    out.println("Materiales Disponibles:");
                    try {
                        out.println(gestor.listarMateriales());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    out.println("Id Material a reservar: ");
                    idReserva = in.readLine();
                    out.println("Id Usuario: ");
                    idUser = in.readLine();
                    out.println(gestor.crearReservacion(idUser, idReserva));
                    break;

                case 3:
                    out.println("============== Buscar Reservacion ==============");
                    out.println(gestor.listarReservaciones());
                    out.println("Ingrese el Id de la Reservacion: ");
                    idReserva = in.readLine();
                    out.println(gestor.buscarReservacion(idReserva));
                    break;

                case 4:
                    out.println("============== Buscar Reservacion por Usuario ==============");
                    out.println(gestor.listarUsuarios());
                    out.println("Ingrese el Id del usuario: ");
                    idUser = in.readLine();
                    out.println(gestor.listarReservacionesPorUsuario(idUser));
                    break;

                case 5:
                    out.println("============== Eliminar Reservacion ==============");
                    out.println(gestor.listarReservaciones());
                    out.println("Ingrese el Id de la Reservacion: ");
                    idReserva = in.readLine();
                    out.println(gestor.borrarReservacion(idReserva));
                    break;

                case 6:
                    out.println("============== Modificar Reservacion ==============");
                    out.println(gestor.listarReservaciones());
                    break;

                case 7:
                    out.println("============== Redimir Reservacion ==============");
                    out.println("Ingrese el Id del usuario: ");
                    idUser = in.readLine();
                    out.println(gestor.listarReservacionesPorUsuario(idUser));
                    out.println("Ingrese el Id del Material: ");
                    String idMaterial = in.readLine();
                    out.println(gestor.redimirReservacion(idUser, idMaterial));
                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionRedimir() throws java.io.IOException {
        int opc;
        String idUser = null;

        do {
            out.println();
            out.println("============== Submenu Redimir =========================");
            out.println("1. Listar Reservaciones.");
            out.println("2. Listar Usuarios.");
            out.println("3. Redimir reservacion.");
            out.println("0. Ir a Menu Principal.");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Reservaciones ==============");
                    out.println(gestor.listarReservaciones());
                    break;

                case 2:
                    out.println("============== Listar Usuarios ==============");
                    out.println(gestor.listarUsuarios());
                    break;

                case 3:
                    out.println("============== Redimir Reservacion ==============");
                    out.println("Ingrese el Id del usuario: ");

                    try {
                        idUser = in.readLine();

                        if (idUser.isEmpty()) {
                            throw new Exception();
                        }

                        out.println("Reservaciones del Usuario: ");
                        out.println(gestor.listarReservacionesPorUsuario(idUser));

                    } catch (Exception e) {
                        out.println("[Error] Debe ingresar un valor.");
                    }

                    out.println("Ingrese el Id del Material: ");
                    String idMaterial = null;

                    try {
                        idMaterial = in.readLine();

                        if (idMaterial.isEmpty()) {
                            throw new Exception();
                        }

                        out.println(gestor.redimirReservacion(idUser, idMaterial));
                    } catch (Exception e) {
                        out.println("[Error] Debe ingresar un valor.");
                    }

                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void imprimirExepcion(Exception e) {
        if (e instanceof NumberFormatException) {
            out.println("[Error]\nEl valor ingresado es invalido, solo se aceptan numeros.");
        }
    }
}
