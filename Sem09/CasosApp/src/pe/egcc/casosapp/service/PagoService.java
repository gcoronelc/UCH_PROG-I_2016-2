package pe.egcc.casosapp.service;

import pe.egcc.casosapp.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class PagoService {

  public void procesar(PagoDto dto) {
    // Variables
    double ingreso, renta, neto;
    // Proceso
    ingreso = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
    if (ingreso > 1500.0) {
      renta = ingreso * 0.08;
    } else {
      renta = 0;
    }
    neto = ingreso - renta;
    // Salida
    dto.setIngreso(ingreso);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }

}
