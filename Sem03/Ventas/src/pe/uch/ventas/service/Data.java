package pe.uch.ventas.service;

import java.util.ArrayList;
import java.util.List;
import pe.uch.ventas.model.VentaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
final class Data {

  private Data() {
  }
  
  public static List<VentaModel> ventas;
  
  static {
    ventas = new ArrayList<>();
  }
  
  
}
