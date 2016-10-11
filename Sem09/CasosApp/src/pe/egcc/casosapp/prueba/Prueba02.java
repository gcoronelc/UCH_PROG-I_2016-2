package pe.egcc.casosapp.prueba;

import pe.egcc.casosapp.dto.PagoDto;
import pe.egcc.casosapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    PagoDto dto = new PagoDto();
    
    dto.setHorasDia(6);
    dto.setDias(20);
    dto.setPagoHora(100);
    
    PagoService service = new PagoService();
    service.procesar(dto);
    
    System.out.println("Ingreso: " + dto.getIngreso());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
    
  }
}
