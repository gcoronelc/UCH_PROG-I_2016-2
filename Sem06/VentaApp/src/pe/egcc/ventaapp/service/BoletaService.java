package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaItem;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class BoletaService extends CompAbstract{
  @Override
  public VentaItem[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    VentaItem[] repo = {
      new VentaItem("Total", total),
      new VentaItem("Servicio", servicio),
      new VentaItem("Total General", totalGeneral)
    };
    return repo;
  }
}
