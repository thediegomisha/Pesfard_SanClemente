/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Logica.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author thediegomisha
 */
public class ComboBox {
    
    
    Connection con;
    conexion cn = new conexion();
    static PreparedStatement sentencia;
    static ResultSet resultado;
    private String sSQL = "";
    
    public void llenar_combo(JComboBox tipodocumento) {

        String sSQL = "SELECT td.nombredocumento FROM tipodocumento td";
        try {
            con = cn.conectar();
            sentencia = con.prepareStatement(sSQL);
            resultado = sentencia.executeQuery();
            while (resultado.next()){
             tipodocumento.addItem(resultado.getString("td.nombredocumento"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
    
     public void tipoUsuario(JComboBox tipousuario) {

        String sSQL = "SELECT tu.nombre FROM tipo_usuario tu";
        try {
            con = cn.conectar();
            sentencia = con.prepareStatement(sSQL);
            resultado = sentencia.executeQuery();
            while (resultado.next()){
             tipousuario.addItem(resultado.getString("tu.nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }
}
