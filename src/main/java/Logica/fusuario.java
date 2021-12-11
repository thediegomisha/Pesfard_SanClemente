/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.vusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.sql.Statement;

/**
 *
 * @author thediegomisha
 */
public class fusuario {

    Connection con;
    conexion cn = new conexion();
    static PreparedStatement pre_sentencia;
    static PreparedStatement pre_sentencia2;
    static Statement sentencia;
    static ResultSet resultado;
    private String sSQL1 = "";
    private String sSQL2 = "";

    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Nombres", "APaterno", "AMaterno", "TIPO dOCUMENTO", "numdoc", "sexo",
            ""+ "F Nacimiento", "telefono", "email", "login", "password", "tipo Usuario", "estado"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL1 = "SELECT p.idpersona, p.nombre1, p.apaterno, amaterno, td.nombredocumento, p.numdoc, "
                + "s.tipo_sexo, p.fecha_nac, p.telefono, p.email, u.login, "
                + "u.password, tu.nombre, u.estado from persona p INNER JOIN  usuario u on "
                + "idpersona=idusuario INNER JOIN tipo_usuario tu on tipo_usuario=idtipo_usuario "
                + "INNER JOIN tipodocumento td on idtipodoc=tipo_documento "
                + "INNER JOIN sexo s on s.idsexo=p.sexo "
                + "WHERE apaterno like '%" + buscar + "%' ORDER BY p.idpersona DESC";
        try {
            con = cn.conectar();
            sentencia = con.createStatement();
            resultado = sentencia.executeQuery(sSQL1);

            while (resultado.next()) {
                registro[0] = resultado.getString("idpersona");
                registro[1] = resultado.getString("nombre1");
                registro[2] = resultado.getString("apaterno");
                registro[3] = resultado.getString("amaterno");
                registro[4] = resultado.getString("nombredocumento");
                registro[5] = resultado.getString("numdoc");
                registro[6] = resultado.getString("tipo_sexo");
                registro[7] = resultado.getString("fecha_nac");
                registro[8] = resultado.getString("telefono");
                registro[9] = resultado.getString("email");
                registro[10] = resultado.getString("login");
                registro[11] = resultado.getString("password");
                registro[12] = resultado.getString("nombre");
                registro[13] = resultado.getString("estado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vusuario dts) {

        sSQL1 = "INSERT INTO persona (nombre1, apaterno, amaterno, tipo_documento, numdoc, sexo, fecha_nac, "
                + "telefono, email) values (?,?,?,?,?,?,?,?,?)";

        sSQL2 = "INSERT INTO usuario (idusuario, login, password, estado, tipo_usuario, codigo_usuario) "
                + "values ((SELECT idpersona FROM persona ORDER BY idpersona DESC LIMIT 1),?,?,?,?,?)";

        try {

            con = cn.conectar();
            pre_sentencia = con.prepareStatement(sSQL1);
            pre_sentencia2 = con.prepareStatement(sSQL2);

            pre_sentencia.setString(1, dts.getNombre());
            pre_sentencia.setString(2, dts.getApaterno());
            pre_sentencia.setString(3, dts.getAmaterno());
            pre_sentencia.setInt(4, dts.getTipo_documento());
            pre_sentencia.setString(5, dts.getNum_doc());
            pre_sentencia.setInt(6, dts.getSexo());
            pre_sentencia.setString(7, dts.getFecha_nac());
            pre_sentencia.setString(8, dts.getTelefono());
            pre_sentencia.setString(9, dts.getEmail());

            pre_sentencia2.setString(1, dts.getLogin());
            pre_sentencia2.setString(2, dts.getPassword());
            pre_sentencia2.setString(3, dts.getEstado());
            pre_sentencia2.setInt(4, dts.getTipo_usuario());
            pre_sentencia2.setString(5, dts.getCodigo_usuario());

            int n = pre_sentencia.executeUpdate();

            if (n != 0) {
                int n2 = pre_sentencia2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean editar(vusuario dts) {

        sSQL1 = "UPDATE persona SET nombre1=?, apaterno=?, amaterno=?, tipo_documento=?, numdoc=?, sexo=?, fecha_nac=?, "
                + "telefono=?, email=? WHERE idpersona=?";

        sSQL2 = "UPDATE usuario SET login=?, password=?, estado=?, tipo_usuario=?, codigo_usuario=? "
                + " WHERE idusuario";

        try {

            con = cn.conectar();
            pre_sentencia = con.prepareStatement(sSQL1);
            pre_sentencia2 = con.prepareStatement(sSQL2);

            pre_sentencia.setString(1, dts.getNombre());
            pre_sentencia.setString(2, dts.getApaterno());
            pre_sentencia.setString(3, dts.getAmaterno());
            pre_sentencia.setInt(4, dts.getTipo_documento());
            pre_sentencia.setString(5, dts.getNum_doc());
            pre_sentencia.setInt(6, dts.getSexo());
            pre_sentencia.setString(7, dts.getFecha_nac());
            pre_sentencia.setString(8, dts.getTelefono());
            pre_sentencia.setString(9, dts.getEmail());
            pre_sentencia.setInt(10, dts.getIdpersona());

            pre_sentencia2.setString(1, dts.getLogin());
            pre_sentencia2.setString(2, dts.getPassword());
            pre_sentencia2.setString(3, dts.getEstado());
            pre_sentencia2.setInt(4, dts.getTipo_usuario());
            pre_sentencia2.setString(5, dts.getCodigo_usuario());
            pre_sentencia2.setInt(6, dts.getIdpersona());

            int n = pre_sentencia.executeUpdate();

            if (n != 0) {
                int n2 = pre_sentencia2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

}
