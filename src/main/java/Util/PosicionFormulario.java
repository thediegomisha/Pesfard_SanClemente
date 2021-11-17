
package Util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class PosicionFormulario {

    public void abrirFormulario(JInternalFrame ventana, JDesktopPane escritorio){
        int lDesk = escritorio.getWidth();
        int aDesk = escritorio.getHeight();
        int lIframe = ventana.getWidth();
        int aIFrame = ventana.getHeight();
        ventana.setLocation(lDesk / 2 - lIframe / 2, aDesk / 2 - aIFrame / 2);
        escritorio.add(ventana);
        ventana.toFront();
        ventana.setVisible(true);
        
    }
    
    
}
