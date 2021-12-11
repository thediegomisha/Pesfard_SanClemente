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
//    private String sSQL = "";Connection con;
    conexion cn = new conexion();
    static PreparedStatement sentencia;
    static ResultSet resultado;
    private String sSQL = "";

    public Integer totalregistros;
    
    
    
    

   
    
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
