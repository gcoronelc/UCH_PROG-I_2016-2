package pe.egcc.sumaapp.prueba;

import pe.egcc.sumaapp.service.SumaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    SumaService service = new SumaService();
    System.out.println("Suma: " + service.sumar(34, 12));
  }
}
