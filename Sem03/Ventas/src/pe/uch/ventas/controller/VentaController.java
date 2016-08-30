package pe.uch.ventas.controller;

import java.util.List;
import pe.uch.ventas.model.VentaModel;
import pe.uch.ventas.service.DataService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class VentaController {
  
  private DataService service;

  public VentaController() {
    service = new DataService();
  }

  public void grabar(VentaModel model) {
    service.agregarVenta(model);
  }

  public List<VentaModel> obtenerVentas() {
    return service.getVentas();
  }

  public void eliminar(int idVenta) {
    service.eliminarVenta(idVenta);
  }
  
  
}
