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
        gestor = new Gestor();

        out.println(gestor.listarTemas());
        out.println(gestor.crearTema("Ciencias"));
        out.println(gestor.crearTema("Sociales"));
        out.println(gestor.crearTema("Ingles"));
        out.println(gestor.crearTema("Ciencias"));
        out.println(gestor.crearTema("Matematicas"));
        out.println(gestor.listarTemas());
        out.println(gestor.borrarTema("T-2"));
        out.println(gestor.listarTemas());
        out.println(gestor.buscarTema("T-2"));
        out.println(gestor.buscarTema("T-3"));

        out.println(gestor.listarUsuarios());
        out.println(gestor.crearEstudiante("Jose", "Leiva", "5324", "BSOFT", 10));
        out.println(gestor.crearEstudiante("Pedro", "Pica", "6789", "Redes", 5));
        out.println(gestor.crearEstudiante("Luis", "Marmol", "5324", "Redes", 7));
        out.println(gestor.listarUsuarios());
        out.println(gestor.crearAdministrativo("Pablo", "Marmol", "1234", 'A', 48));
        out.println(gestor.crearAdministrativo("Javier", "Caos", "5151", 'B', 30));
        out.println(gestor.crearProfesor("Juan", "Solano", "2345", "Tiempo Completo", 2016, 10, 1));
        out.println(gestor.listarUsuarios());
        out.println(gestor.buscarUsuario("5324"));
        out.println(gestor.buscarUsuario("5151"));
        out.println(gestor.buscarUsuario("2345"));
        out.println(gestor.borrarUsuario("456"));
        out.println(gestor.listarUsuarios());

        out.println(gestor.listarMateriales());
        out.println(gestor.borrarMaterial("789"));
        out.println(gestor.buscarMaterial("1117"));
        out.println(gestor.listarTemas());
        out.println(gestor.crearTema("Ciencias"));
        out.println(gestor.listarTemas());
        out.println(gestor.crearTexto("ISBN001", 2015, 10, 1, false, "Matematica Basica", "Pedro Pablo", "Matematicas", "Aleman", 2000, 10, 1, 200));
        out.println(gestor.crearOtroMaterial("1117", 2015, 10, 1, false, "Ciencias", "Ingles", "Folleto de Comics"));
        out.println(gestor.crearVideo("V201", 2015, 10, 1, true, "Ciencias", "Ingles", "VHS", "Laura Algo", 30));
        out.println(gestor.crearAudio("A101", 2016, 10, 1, true, "Sociales", "Ingles", "CD", 120));
        out.println(gestor.buscarMaterial("ISBN001"));
        out.println();
        out.println(gestor.buscarMaterial("V201"));
        out.println();
        out.println(gestor.buscarMaterial("A101"));
        out.println(gestor.listarMateriales());

        out.println(gestor.crearReservacion("2345", "ISBN001"));
        out.println(gestor.crearReservacion("5324", "1117"));
        out.println(gestor.listarReservaciones());
        out.println(gestor.crearReservacion("1987", "ISBN001"));
        out.println(gestor.crearReservacion("2345", "A101"));
        out.println(gestor.crearReservacion("5324", "V201"));
        out.println(gestor.crearReservacion("5324", "ISBN001"));
        out.println(gestor.listarReservaciones());
        out.println(gestor.buscarReservacion("R-2"));
        out.println(gestor.listarReservaciones());
        out.println(gestor.borrarReservacion("R-1"));
        out.println(gestor.listarReservaciones());
        out.println(gestor.listarReservacionesPorUsuario("5324"));
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
}
