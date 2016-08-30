package pe.uch.ventas.prueba;

import pe.uch.ventas.model.VentaModel;
import pe.uch.ventas.service.DataService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    DataService service = new DataService();
    
    service.agregarVenta(new VentaModel(0, "Coca cola", 3.50, 4, 0));
    service.agregarVenta(new VentaModel(0, "Empanada", 4.00, 10, 0));
    service.agregarVenta(new VentaModel(0, "Combo Chaufa", 3.00, 10, 0));
    service.agregarVenta(new VentaModel(0, "Manzana", 2.00, 12, 0));
    service.agregarVenta(new VentaModel(0, "Inka Kola", 3.50, 4, 0));
    
    
    for(VentaModel model: service.getVentas()){
      System.out.println(model);
    }
    
  }
}
