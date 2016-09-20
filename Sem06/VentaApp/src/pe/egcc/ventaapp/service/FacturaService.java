package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaItem;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class FacturaService extends CompAbstract{

  @Override
  public VentaItem[] procesar(double total) {
    // Variables
    double importe, impuesto, servicio, totalGeneral;
    // Proceso
    importe = total / ( 1 + IGV);
    impuesto = total - importe;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    VentaItem[] repo = {
      new VentaItem("Importe", importe),
      new VentaItem("Impuesto", impuesto),
      new VentaItem("Total", total),
      new VentaItem("Servicio", servicio),
      new VentaItem("Total General", totalGeneral)
    };
    return repo;
  }
  
}
