package UI;

import java.awt.*;
import java.io.*;
import CapaLogica.*;

import javax.swing.*;

public class UI {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;
    private static Gestor gestor;

    public static void main(String[] args)throws java.io.IOException {
        int opc;
        int noSalir;
        gestor = new Gestor();


        EventQueue.invokeLater(()->
        {
            JFrame login = new LoginUI();
            login.setTitle("Biblioteca");
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            login.setVisible(true);




        });

//        do {
            menuAdmin();
//            opc = leerOpcionSelecionada();
//            noSalir = ejecutarAccionSeleccionada(opc);
//        } while (noSalir != 0);
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

    public  void login() throws java.io.IOException {
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
        out.println("1. Usuarios.\n2. Materiales.\n3. Temas.\n4. Reservaciones.\n0. Salir");
        out.println();
    }

    private static void menuUsuario() {
        out.println();
        out.println("============== Menu Principal del Sistema =========================");
        out.println("1. Reservaciones.\n0. Salir");
        out.println();
    }

    private  int ejecutarAccionSeleccionada(int opcion) throws java.io.IOException {
        int noSalir = -1;

        if (opcion == 1) { // Usuarios
            ejecutarAccionUsuarios();
        } else if (opcion == 2) { // Materiales
            ejecutarAccionMateriales();
        } else if (opcion == 3) { // Temas
            ejecutarAccionTemas();
        } else if (opcion == 4) { // Reservaciones
            ejecutarAccionReservaciones();
        } else {
            noSalir = 0;
        }

        return noSalir;
    }

    private  void ejecutarAccionUsuarios() throws java.io.IOException {
        int opc;
        String userId;

        do {
            out.println();
            out.println("============== Submenu Usuarios ==============");
            out.println("1. Ver lista de Usuarios.");
            out.println("2. Registrar nuevo Usuario.");
            out.println("3. Buscar Usuario.");
            out.println("4. Eliminar Usuario.");
            out.println("5. Modificar Usuario.");
            out.println("0. Ir a Menu Principal.");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:
                    out.println("============== Lista de Usuarios ==============");

                    try {
                        out.println(gestor.listarUsuarios());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
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
                                try {
                                    gestor.crearEstudiante(nombre, apellido, idNuevoUser, carrera, creditos);
                                    out.println("Se creo el nuevo Usuario.");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Usuario");
                            }

                            break;

                        case 2:
                            out.println("Tipo Contrato\n 1. Tiempo Completo.\n 2. Medio Tiempo.\nIndique el tipo de contrato");
                            String contrato = null;

                            try {
                                contrato = in.readLine();
                                out.println("Fecha de contratatacion:");
                                String fechaContratacion = in.readLine();

                                try {
                                    gestor.crearProfesor(nombre, apellido, idNuevoUser, contrato, fechaContratacion);
                                    out.println("Se creo el nuevo Usuario.");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println("No se creo el Usuario");
                            }
                            break;

                        case 3:
                            out.println("Tipo de nombramiento.\n Digite: A, B o C.");
                            String tipoNombramiento = in.readLine();
                            out.println("Horas asignadas:");
                            int horas = 0;

                            try {
                                horas = Integer.parseInt(in.readLine());

                                try {
                                    gestor.crearAdministrativo(nombre, apellido, idNuevoUser, tipoNombramiento,
                                            horas);
                                    out.println("Se creo el nuevo Usuario.");
                                } catch (Exception e) {
                                    out.println(e.getMessage());
                                }

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

                    try {
                        out.println(gestor.listarUsuarios());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    out.println("Indique el numero de Id del Usuario: ");
                    userId = in.readLine();
                    out.println();
                    out.println("======= Datos del Usuario =======");

                    try {
                        out.println(gestor.buscarUsuario(userId));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    out.println("============== Eliminar Usuario ==============");
                    out.println();

                    try {
                        out.println(gestor.listarUsuarios());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Indique el numero de Id del Usuario a eliminar: ");
                    userId = in.readLine();
                    try {
                        gestor.borrarUsuario(userId);
                        out.println("Usuario eliminado del sistema.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
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

    private  void ejecutarAccionMateriales() throws java.io.IOException {
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
                    out.println("Fecha de compra (dd/mm/yy):");
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
                            out.println("Fecha publicacion (dd/mm/yy):");
                            String fechaPublicacion = in.readLine();
                            out.println("Numero de paginas: ");
                            int paginas = Integer.parseInt(in.readLine());

                            try {
                                gestor.crearTexto(isbn, fechaCompra, esRestringido, titulo, autor, tema, idioma,
                                        fechaPublicacion, paginas);
                                out.println("Material agregado.");
                            } catch (Exception e) {
                                out.println(e.getMessage());
                            }
                            break;

                        case 2:
                            out.println("Formato. VHS, VCD o DVD ");
                            String formato = in.readLine();
                            out.println("Duracion (en minutos): ");
                            int duracion = 0;

                            try {
                                duracion = Integer.parseInt(in.readLine());
                                out.println("Director: ");
                                String director = in.readLine();

                                try {
                                    gestor.crearVideo(isbn, fechaCompra, esRestringido, tema, idioma, formato,
                                            director, duracion);
                                    out.println("Material agregado.");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println(e.getMessage());
                            }

                            break;

                        case 3:
                            out.println("Formato. Casete, CD o DVD ");
                            String aFormato = in.readLine();
                            out.println("Duracion (en minutos): ");
                            int aDuracion = 0;

                            try {
                                aDuracion = Integer.parseInt(in.readLine());

                                try {
                                    gestor.crearAudio(isbn, fechaCompra, esRestringido, tema, idioma, aFormato,
                                            aDuracion);
                                    out.println("Material agregado.");
                                } catch (Exception e) {
                                    out.println(e.getMessage());
                                }
                            } catch (NumberFormatException e) {
                                imprimirExepcion(e);
                                out.println(e.getMessage());
                            }

                            break;

                        case 4:
                            out.println("Descripcion: ");
                            String descripcion = in.readLine();
                            try {
                                gestor.crearOtroMaterial(isbn, fechaCompra, esRestringido, tema, idioma, descripcion);
                                out.println("Material agregado.");
                            } catch (Exception e) {
                                out.println(e.getMessage());
                            }
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
                        out.println(e.getMessage());
                    }
                    out.println("Indique el ISBN del Material: ");
                    materialId = in.readLine();
                    out.println();

                    out.println("======= Datos del Material =======");
                    try {
                        out.println(gestor.buscarMaterial(materialId));
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
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

    private  void ejecutarAccionTemas() throws java.io.IOException {
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
                        out.println(ex.getMessage());
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

    private  void ejecutarAccionReservaciones() throws java.io.IOException {
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
                    try {
                        out.println(gestor.listarReservaciones());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 2:
                    out.println("============== Registrar Reservacion ==============");
                    out.println();
                    out.println("Materiales Disponibles:");

                    try {
                        out.println(gestor.listarMateriales());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Id Material a reservar: ");
                    idReserva = in.readLine();
                    out.println("Id Usuario: ");
                    idUser = in.readLine();

                    try {
                        gestor.crearReservacion(idUser, idReserva);
                        out.println("Reservacion creada.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 3:
                    out.println("============== Buscar Reservacion ==============");
                    try {
                        out.println(gestor.listarReservaciones());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    out.println("Ingrese el Id de la Reservacion: ");
                    idReserva = in.readLine();
                    try {
                        out.println(gestor.buscarReservacion(idReserva));
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 4:
                    out.println("============== Buscar Reservacion por Usuario ==============");
                    try {
                        out.println(gestor.listarUsuarios());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    out.println("Ingrese el Id del usuario: ");
                    idUser = in.readLine();
                    try {
                        out.println(gestor.listarReservacionesPorUsuario(idUser));
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 5:
                    out.println("============== Eliminar Reservacion ==============");
                    try {
                        out.println(gestor.listarReservaciones());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Ingrese el Id de la Reservacion: ");
                    idReserva = in.readLine();

                    try {
                        gestor.borrarReservacion(idReserva);
                        out.println("Reservacion eliminada.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 6:
                    out.println("============== Modificar Reservacion ==============");
                    try {
                        out.println(gestor.listarReservaciones());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    break;

                case 7:
                    out.println("============== Redimir Reservacion ==============");
                    try {
                        out.println(gestor.listarReservaciones());
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }

                    out.println("Ingrese el Id del usuario: ");
                    idUser = in.readLine();

                    try {
                        out.println(gestor.listarReservacionesPorUsuario(idUser));
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                    out.println("Ingrese el Id del Material: ");
                    String idMaterial = in.readLine();
                    try {
                        gestor.redimirReservacion(idUser, idMaterial);
                        out.println("El Material ha sido redimido de manera exitosa.");
                    } catch (Exception e) {
                        out.println(e.getMessage());
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
