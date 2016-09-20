package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.VentaItem;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

public class Prueba01 {

  public static void main(String[] args) {
    CompAbstract comp = new BoletaService();
    for (VentaItem i : comp.procesar(1000.0)) {
      System.out.println(i.toString());
    }
  }
  
}
