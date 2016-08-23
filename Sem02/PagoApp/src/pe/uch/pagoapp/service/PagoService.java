package pe.uch.pagoapp.service;

import pe.uch.pagoapp.dto.PagoDto;

public class PagoService {


  public void procesar(PagoDto dto){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getDiasTrab() * 
            dto.getHorasDia() * dto.getPagoHora();
    renta = 0.0;
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    }
    neto = ingresos - renta;
    // Reporte
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }
  
}
