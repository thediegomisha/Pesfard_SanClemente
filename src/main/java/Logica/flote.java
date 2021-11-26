package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class flote {

    Connection con;
    conexion cn = new conexion();
    static PreparedStatement sentencia;
    static ResultSet resultado;
    private String sSQL = "";

    public Integer totalregistros;
    
     public void llenar_combo(JComboBox razonsocial) {

        String sSQL = "SELECT p.idpersona, c.codigo_cliente FROM persona p INNER JOIN cliente c ON p.idpersona = c.idpersona";
        try {
            con = cn.conectar();
            sentencia = con.prepareStatement(sSQL);
            resultado = sentencia.executeQuery();
            while (resultado.next()){
             razonsocial.addItem(resultado.getString("c.codigo_cliente"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    
}
