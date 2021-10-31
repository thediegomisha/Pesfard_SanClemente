
package Logica;

import jssc.SerialPort;
import jssc.SerialPortList;

/**
 *
 * @author Juan Luis Diaz Aylas
 */
public class TestBalanza {
    
    public static void main(String[] args) {
            String puertos[]= SerialPortList.getPortNames();
            for(String n : puertos){
                System.out.println(n);
            }
    }

}
