package pe.egcc.app.prueba;

import javax.swing.JOptionPane;
import pe.egcc.app.service.Datos;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    System.out.println("Mayor: " + Math.max(56, 12));
    System.out.println("Nombre: " + Datos.nombre);
    JOptionPane.showMessageDialog(null, "Hola todos",
            "Mensaje",JOptionPane.ERROR_MESSAGE);
  }
  
  
}
