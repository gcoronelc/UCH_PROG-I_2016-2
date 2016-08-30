package pe.uch.ventas.service;

import java.util.List;
import pe.uch.ventas.model.VentaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class DataService {
  
  private static int contVenta;
  
  static {
    contVenta = 1000;
  }
  
  public void agregarVenta(VentaModel model){
    model.setIdVenta(++contVenta);
    model.setImporte(model.getPrecio() * model.getCant());
    Data.ventas.add(model);
  }
  
  public List<VentaModel> getVentas(){
    return Data.ventas;
  }
  
  public void eliminarVenta(int idVenta){
    for(int i = 0; i < Data.ventas.size(); i++){
      if(Data.ventas.get(i).getIdVenta() == idVenta){
        Data.ventas.remove(i);
        break;
      }
    }
    
  }
  
}
