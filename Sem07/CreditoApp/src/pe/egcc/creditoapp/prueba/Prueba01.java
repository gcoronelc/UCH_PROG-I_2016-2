package pe.egcc.creditoapp.prueba;

import pe.egcc.creditoapp.model.Tipo;
import pe.egcc.creditoapp.service.CreditoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    CreditoService service = new CreditoService();
    for(Tipo t: service.getTipos()){
      System.out.println(t);
    }
  }
  
}
