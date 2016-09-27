package pe.egcc.creditoapp.prueba;

import pe.egcc.creditoapp.model.Credito;
import pe.egcc.creditoapp.model.Item;
import pe.egcc.creditoapp.service.CreditoService;
import pe.egcc.creditoapp.service.Util;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    try {
      // Datos
      String codigo = "B";
      int meses = 12;
      double capital = 20000.00;
      // Proceso
      CreditoService service = new CreditoService();
      Credito credito = service.procesar(codigo, meses, capital);
      // Reporte
      System.out.println("Código: " + credito.getCodigo());
      System.out.println("Descripción: " + credito.getDescripcion());
      System.out.println("Capital: " + credito.getCapital());
      System.out.println("Interés: " + credito.getInteres());
      System.out.println("Meses: " + credito.getMeses());
      for (Item i : credito.getCuotas()) {
        System.out.println(i);
      }
      System.out.println("Total: " + Util.redondear(total(credito)));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  private static double total(Credito credito) {
    double total = 0.0;
    for(Item i: credito.getCuotas()){
      total += i.getCapital();
    }    
    return total;
  }
}
