package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Conexion {

//    private final String base = "registro";
//    private final String usuario = "root";
//    private final String contraseña = null;
//    private final String url = "jbdc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public static Connection getConexion() throws ClassNotFoundException, SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/registro", "root", "informatica");
            System.out.println("Conexión realizada");
            return c;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;

        }

    }
    
}
