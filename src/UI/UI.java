package UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
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
        out.println(gestor.crearTema("Ciencias"));
        out.println(gestor.crearTema("Sociales"));
        out.println(gestor.crearTema("Ingles"));
        out.println(gestor.crearTema("Ciencias")); // No se debe agregar
        out.println(gestor.crearTema("Matematicas"));
        out.println(gestor.crearTema("Quimica"));
        out.println(gestor.crearTema("Fisica Matematica"));
        out.println(gestor.crearTema("Español"));

        // Usuarios
        out.println(gestor.crearEstudiante("Jose", "Leiva", "5324", "BSOFT", 10));
        out.println(gestor.crearEstudiante("Pedro", "Pica", "6789", "Redes", 5));
        out.println(gestor.crearEstudiante("Luis", "Marmol", "5324", "Redes", 7)); // No se debe agregar, id repetido
        out.println(gestor.crearAdministrativo("Pablo", "Marmol", "1234", 'A', 48));
        out.println(gestor.crearAdministrativo("Javier", "Caos", "5151", 'B', 30));
        out.println(gestor.crearProfesor("Juan", "Solano", "2345", "Tiempo Completo", 2016, 10, 1));
        out.println(gestor.crearProfesor("Diego", "Maradona", "11171", "Medio Completo", 2016, 5, 1));

        // Materiales
        out.println(gestor.crearTexto("ISBN001", 2015, 10, 1, false, "Matematica Basica", "Pedro Pablo", "Matematicas", "Aleman", 2000, 10, 1, 200));
        out.println(gestor.crearOtroMaterial("1117", 2015, 10, 1, false, "Ciencias", "Ingles", "Folleto de Comics"));
        out.println(gestor.crearOtroMaterial("ISBN1223", 2013, 10, 1, false, "Musica", "Ingles", "Folleto de Letras"));
        out.println(gestor.crearVideo("V201", 2015, 10, 1, true, "Ciencias", "Ingles", "VHS", "Laura Algo", 30));
        out.println(gestor.crearAudio("A101", 2016, 10, 1, true, "Sociales", "Ingles", "CD", 120));
        out.println(gestor.crearAudio("A222", 2016, 10, 1, false, "Musica", "Español", "CD", 10));

        // Reservaciones
        out.println(gestor.crearReservacion("2345", "ISBN001"));
        out.println(gestor.crearReservacion("5324", "1117"));
        out.println(gestor.crearReservacion("1987", "ISBN001")); // Usuario no existe, no se debe crear
        out.println(gestor.crearReservacion("2345", "A101"));
        out.println(gestor.crearReservacion("5324", "V201"));
        out.println(gestor.crearReservacion("5324", "ISBN001"));

        do {
            menuAdmin();
            opc = leerOpcionSelecionada();
            noSalir = ejecutarAccionSeleccionada(opc);
        } while (noSalir != 0);
    }

    private static int leerOpcionSelecionada()throws java.io.IOException{
        int opcion;

        out.print("Seleccione opcion: ");
        opcion = Integer.parseInt(in.readLine());
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

        gestor.validarDatos();
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
        } else {
            noSalir = 0;
        }

        return noSalir;
    }

    private static void ejecutarAccionUsuarios() throws java.io.IOException {
        int opc;

        do {
            out.println();
            out.println("============== Submenu Usuarios =========================");
            out.println("1. Ver lista de Usuarios.");
            out.println("2. Registrar nuevo Usuario.");
            out.println("3. Buscar Usuario.");
            out.println("4. Elimnar Usuario");
            out.println("5. Modificar Usuario");
            out.println("0. Ir a Menu Principal");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:

                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:


                    break;

                case 5:


                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionMateriales() throws java.io.IOException {
        int opc;

        do {
            out.println();
            out.println("============== Submenu Materiales =========================");
            out.println("1. Ver lista de Materiales.");
            out.println("2. Registrar nuevo Material.");
            out.println("3. Buscar Material.");
            out.println("4. Elimnar Material");
            out.println("5. Modificar Material");
            out.println("0. Ir a Menu Principal");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:

                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:


                    break;

                case 5:


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
            out.println("4. Elimnar Tema");
            out.println("5. Modificar Tema");
            out.println("0. Ir a Menu Principal");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:

                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:


                    break;

                case 5:


                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }

    private static void ejecutarAccionReservaciones() throws java.io.IOException {
        int opc;

        do {
            out.println();
            out.println("============== Submenu Reservaciones =========================");
            out.println("1. Ver lista de Reservaciones.");
            out.println("2. Registrar nueva Reservacion.");
            out.println("3. Buscar Reservacion.");
            out.println("4. Eliminar Reservacion");
            out.println("5. Modificar Reservacion");
            out.println("0. Ir a Menu Principal");
            out.println();

            opc = leerOpcionSelecionada();

            switch (opc) {
                case 1:

                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 4:


                    break;

                case 5:


                    break;

                default:
                    opc = 0;
                    break;
            }

        } while (opc != 0);
    }
}
