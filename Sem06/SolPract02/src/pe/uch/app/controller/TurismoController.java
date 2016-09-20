package pe.uch.app.controller;

import pe.uch.app.model.Turismo;
import pe.uch.app.service.TurismoService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class TurismoController {
  
  private TurismoService service;

  public TurismoController() {
    service = new TurismoService();
  }
  
  public String[] getCiudades() {
    return service.getCiudades();
  }

  public String[] getPaquetes(String ciudad) {
    return service.getPaquetes(ciudad);
  }

  public double getPrecio(String ciudad, String paquete) {
    return service.getPrecio(ciudad, paquete);
  }

  public void procesar(Turismo bean) {
    service.procesar(bean);
  }
  
}
