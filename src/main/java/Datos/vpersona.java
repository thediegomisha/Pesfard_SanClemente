package Datos;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class vpersona {

    private int idpersona;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int tipo_documento;
    private String num_doc;
    private int sexo;
    private String fecha_nac;
    private String telefono;
    private String direccion;
    private String email;

    public vpersona() {
    }

    public vpersona(int idpersona, String nombre, String apaterno, String amaterno, int tipo_documento, String num_doc, int sexo, String fecha_nac, String telefono, String direccion, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.tipo_documento = tipo_documento;
        this.num_doc = num_doc;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public int getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(int tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
