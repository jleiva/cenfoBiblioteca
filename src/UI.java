import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UI {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;

    public static void main(String[] args)throws java.io.IOException {
        String url = "jdbc:mysql://localhost:8889/cenfotecBiblioteca";
        String username = "root";
        String password = "00bar";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            Statement stInsert = connection.createStatement();
            // stInsert.executeUpdate("INSERT INTO TUsuario " + "VALUES ('5324', 'Jose', 'Leiva')");
            // stInsert.close();

            connection.close();
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}

