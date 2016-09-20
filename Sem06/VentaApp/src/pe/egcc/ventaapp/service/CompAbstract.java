package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.VentaItem;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public abstract class CompAbstract {

  protected final double IGV = 0.18;
  protected final double SERVICIO = 0.10;
  
  public abstract VentaItem[] procesar( double total);
  
}
