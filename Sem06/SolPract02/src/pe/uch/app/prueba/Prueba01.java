package pe.uch.app.prueba;

import pe.uch.app.service.TurismoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    TurismoService service = new TurismoService();
    for (String s : service.getCiudades()) {
      System.out.println(s);
    }
  }
}
