
package Datos;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class vacopiador extends vpersona{

    private String codigo_acopiador;

    public vacopiador() {
    }

    public vacopiador(String codigo_acopiador) {
        this.codigo_acopiador = codigo_acopiador;
    }

    public String getCodigo_acopiador() {
        return codigo_acopiador;
    }

    public void setCodigo_acopiador(String codigo_acopiador) {
        this.codigo_acopiador = codigo_acopiador;
    }
    
}
