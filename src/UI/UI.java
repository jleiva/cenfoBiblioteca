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

//        out.println(gestor.crearTema("Ciencias"));
//        out.println(gestor.crearTema("Sociales"));
//        out.println(gestor.crearTema("Ingles"));
//        out.println(gestor.crearTema("Ciencias"));
//        out.println(gestor.crearTema("Matematicas"));
//        out.println(gestor.listarTemas());
//        out.println(gestor.borrarTema("T-2"));
//        out.println(gestor.listarTemas());
//        out.println(gestor.buscarTema("T-2"));
//        out.println(gestor.buscarTema("T-3"));

        /*
        * 1. Listo Usuarios, no hay imprime mensaje
        * 2. Creo 3 Estudiantes, el tercer estudiante tiene el mismo ID que el 1ero, no debe agregar repetidos
        * 3. Listo Usuarios, imprime lista
        * 4. Creo Administrativos y Profesor
        * 5. Listo Usuarios, revisar que esten los Usuaurios
        * 6. Busco por ID
        * 7. Borro usuario con ID 456
        * 8. Listo usuarios, no debe estar el usuario borrado
        * */
//        out.println(gestor.listarUsuarios());
//        out.println(gestor.crearEstudiante("Jose", "Leiva", "5324", "BSOFT", 10));
//        out.println(gestor.crearEstudiante("Pedro", "Pica", "6789", "Redes", 5));
//        out.println(gestor.crearEstudiante("Luis", "Marmol", "5324", "Redes", 7));
//        out.println(gestor.listarUsuarios());
//        out.println(gestor.crearAdministrativo("Pablo", "Marmol", "1234", 'A', 48));
//        out.println(gestor.crearAdministrativo("Javier", "Caos", "5151", 'B', 30));
//        out.println(gestor.crearProfesor("Juan", "Solano", "2345", "Tiempo Completo", 2016, 10, 1));
//        out.println(gestor.listarUsuarios());
//        out.println(gestor.buscarUsuario("5324"));
//        out.println(gestor.buscarUsuario("5151"));
//        out.println(gestor.borrarUsuario("456"));
//        out.println(gestor.listarUsuarios());

        /*
        * 1. Listo materiales, no hay
        * 2. Trato de borrar por ID 789, no hay
        * 3. Busco por Id 1117, no hay
        * 4. Creo material tipo Otro
        * 5. Listo Material
        * 6. Creo tema
        * 7. Listo
        * 8. Creo material
        * 9. Listo
        * */
        out.println(gestor.listarMateriales());
        out.println(gestor.borrarMaterial("789"));
        out.println(gestor.buscarMaterial("1117"));
        out.println(gestor.listarTemas());
        out.println(gestor.crearTema("Ciencias"));
        out.println(gestor.listarTemas());
        out.println(gestor.crearOtroMaterial("1117", 2015, 10, 1, false, "Ciencias", "Ingles", "Folleto de Comics"));
        out.println(gestor.listarMateriales());
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
