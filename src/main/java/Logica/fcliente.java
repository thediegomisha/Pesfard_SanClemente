package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;


/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class fcliente {

//    private conexion mysql = new conexion();
//    private Connection cn = mysql.conectar();
//    private String sSQL = "";
    
    Connection con;
    conexion cn = new conexion();
    static PreparedStatement sentencia;
    static ResultSet resultado;
    private String sSQL = "";

    public Integer totalregistros;

    public void llenar_combo(JComboBox tipodocumento) {

        String sSQL = "SELECT td.nombredocumento FROM tipodocumento td";
        try {
            con = cn.conectar();
            sentencia = con.prepareStatement(sSQL);
            resultado = sentencia.executeQuery();
            while (resultado.next()){
             tipodocumento.addItem(resultado.getString("td.nombredocumento"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    
//    public DefaultTableModel mostrar(String buscar){
//        DefaultTableModel modelo;
//        
//        String [] titulos ={};
//        
//        String [] registro = new String [5];
//        
//        totalregistros = 0;
//        modelo = new DefaultTableModel(null, titulos);
//        
//        sSQL = "";
//        
//        
//        
//        
//    }
    
}
