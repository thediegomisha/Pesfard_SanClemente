package Datos;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class vusuario extends vpersona {

    private double sueldo;
    private String login;
    private String password;
    private String estado;
    private int tipo_usuario;
    private String Codigo_usuario;

    public vusuario() {
    }

    public vusuario(double sueldo, String login, String password, String estado, int tipo_usuario, String Codigo_usuario) {
        this.sueldo = sueldo;
        this.login = login;
        this.password = password;
        this.estado = estado;
        this.tipo_usuario = tipo_usuario;
        this.Codigo_usuario = Codigo_usuario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getCodigo_usuario() {
        return Codigo_usuario;
    }

    public void setCodigo_usuario(String Codigo_usuario) {
        this.Codigo_usuario = Codigo_usuario;
    }

  
}
