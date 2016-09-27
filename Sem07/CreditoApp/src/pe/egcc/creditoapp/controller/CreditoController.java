package pe.egcc.creditoapp.controller;

import pe.egcc.creditoapp.model.Credito;
import pe.egcc.creditoapp.model.Tipo;
import pe.egcc.creditoapp.service.CreditoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class CreditoController {
  
  private CreditoService service;

  public CreditoController() {
    service = new CreditoService();
  }
  
  public Tipo[] getTipos(){
    return service.getTipos();
  }
  
  public Credito procesar(String codigo, int meses, double capital){
    return service.procesar(codigo, meses, capital);
  }
  
}
