
package Datos;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class vagricultor extends vpersona{

    private String codigo_agricultor;

    public vagricultor() {
    }

    public vagricultor(String codigo_agricultor) {
        this.codigo_agricultor = codigo_agricultor;
    }

    public String getCodigo_agricultor() {
        return codigo_agricultor;
    }

    public void setCodigo_agricultor(String codigo_agricultor) {
        this.codigo_agricultor = codigo_agricultor;
    }
    
}
