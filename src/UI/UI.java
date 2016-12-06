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

//        out.println(gestor.listarMateriales());

//        out.println(gestor.listarUsuarios());

//        out.println(gestor.borrarUsuario("456"));
//        out.println(gestor.borrarMaterial("789"));
//        out.println(gestor.buscarUsuario("5324"));
//        out.println(gestor.buscarMaterial("11171"));

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
