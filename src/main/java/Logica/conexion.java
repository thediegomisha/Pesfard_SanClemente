  package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class conexion {

    public String db = "sistemaalgodon";
    public String url = "jdbc:mysql://localhost:3306/" + db;
    public String user = "root";
    public String pass = "";

    public conexion() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        //     JOptionPane.showMessageDialog(null,"Conexion Exitosa", "Conexion",JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException | SQLException e) {
          JOptionPane.showMessageDialog(null,"Sin Conexion" + e, "Conexion",JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, e.getMessage());
//            e.printStackTrace();
        }
        return link;
    }
}
